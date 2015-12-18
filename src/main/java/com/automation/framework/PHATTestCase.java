package com.automation.framework;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.Connection;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;

import junit.framework.TestCase;

import org.apache.commons.io.FileUtils;
import org.apache.jmeter.config.Arguments;
import org.apache.jmeter.protocol.java.sampler.JavaSamplerClient;
import org.apache.jmeter.protocol.java.sampler.JavaSamplerContext;
import org.apache.jmeter.samplers.SampleResult;
import org.apache.jmeter.threads.JMeterContext;
import org.apache.jmeter.threads.JMeterContextService;
import org.apache.jmeter.threads.JMeterVariables;
import org.apache.jmeter.util.JMeterUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.sanity.utils.AutomationException;
import com.sanity.utils.PHATLogger;
import com.sanity.utils.PHATResponseData;
import com.sanity.utils.PHATResultValidator;
import com.sanity.utils.PHATValidationHolder;
import com.sanity.utils.PHATValidationResult;
import com.sanity.utils.PHResponseDataConstants;
import com.sanity.utils.ResultValidatorConditionType;


public abstract class PHATTestCase extends TestCase  implements JavaSamplerClient, PHTestCaseConstants{

	public WebDriver driver                              = null; 
	protected WebDriverWait wait							= null;
	protected FirefoxProfile firefoxProfile                 = null;
	protected JavaSamplerContext samplerContext             = null;
	protected SampleResult sampleResult                       = null;
	protected Arguments defaultArguments                    = null;
	protected String loginURL                               = null;
	protected String userName                               = null;
	protected String password                               = null;
	protected String errorMsg          	  	                = "";
	protected String infoMsg          	  	                = "";
	protected  JMeterContext jmeterContext                  = null;
	protected  JMeterVariables jmeterVariables              = null;
	public boolean pageExecutionStatus                   = false;
	private String ENCODING_FORMAT                          = "UTF-8";
	public int DRIVER_TIMEOUT_VALUE                = 10;
	public static final String UTILITIES_CONF_FOLDER		= "src/test/jmeter/utilities/conf/";
	public static final String SCREENSHOTS_FOLDER	 		= "target/jmeter/logs/";
	public static final String XML_SCRIPT_FILE	 		= "xmlScriptFileName";
	private PHATResponseData pHATResponseData				= null;
	private final int SCREENSHOT_DISPLAYCHAR				= 160;
	private Properties prop;

	protected String expectedResult							= null;
	protected String actualResult							= null;
	protected String validationResult						= null;
	protected String valDesc								= null;	

	Document testDocument = null;
	Connection connection = null;
	String stepNo = null;
	NodeList stepList = null;

	protected Boolean isAnyValidationFailed = Boolean.FALSE;

	public Properties getProp() {
		return prop;
	}

	public void setProp(Properties prop) {
		this.prop = prop;
	}

	public SampleResult getSampleResult() {
		return sampleResult;
	}

	public void setSampleResult(SampleResult sampleResult) {
		this.sampleResult = sampleResult;
	}

	public PHATTestCase() {
		sampleResult            = new SampleResult();  
		pHATResponseData = new PHATResponseData();
		defaultArguments        = new Arguments();
		populateArguments ();
	} 

	public void setTestCaseDescription(String testCaseDescription){
		this.pHATResponseData.setTestCaseDescription(testCaseDescription);
	}

	public void setTestCaseSeverity(String testCaseSeverity){
		this.pHATResponseData.setTestCaseSeverity(testCaseSeverity);
	}

	public void setStepDescription(String stepDescription){
		this.pHATResponseData.setStepDescription(stepDescription);
	}

	public void setStepSeverity(String severity){
		this.pHATResponseData.setStepSeverity(severity);
	}

	public void addLog(int type, String logMsg){
		PHATLogger logger = this.pHATResponseData.getLogger();
		if(type == PHResponseDataConstants.INFO){
			logger.setInfoLog(logMsg);
		}else if(type == PHResponseDataConstants.WARN){
			logger.setWarnLog(logMsg);
		}else if(type == PHResponseDataConstants.DEBUG){
			logger.setDebugLog(logMsg);
		}else if(type == PHResponseDataConstants.ERROR){
			logger.setErrLog(logMsg);
		}
	}

	public void resetLog() {
		this.pHATResponseData.setLogger(null);
	}

	public Arguments getDefaultParameters() {
		return defaultArguments;
	}

	public abstract void populateArguments();

	protected void loadDriverAndData() throws Exception {
		initializeResponseData();
		initializeJmeterContext();
		initializeDriver();
		initializeXMLDocument();
		initializeResourceObjects();
		initializeDBConnection();
	}
	
	protected void initializeDBConnection() throws Exception {
		try {
			connection  		 = (Connection)jmeterVariables.getObject("DB_CONNECTION");
		} catch(Exception e){
			pageExecutionStatus  = false;
			setErrorMsg("Failed to initialize DB Connection.");
			throw (new AutomationException(getErrorMsg()));
		}
	}

	protected void initializeResponseData() throws Exception {
		this.pHATResponseData = new PHATResponseData();
		isAnyValidationFailed = Boolean.FALSE;
	}
	
	protected void initializeResourceObjects() throws Exception {
		String fileName = "src\\test\\jmeter\\ph_6.4\\regression\\xpaths.properties";
		if(JMeterUtils.getProperty("PH_VERSION_NUMBER").trim().contains("6.4.1")){
			fileName = fileName.replace("src\\test\\jmeter\\ph_6.4\\regression", "src\\test\\jmeter\\ph_6.4.1\\regression");
		}
		if(!ResourceObjects.initialize(fileName)){
			pageExecutionStatus  = false;
			setErrorMsg("Failed to initialize Resource Objects.");
			throw (new AutomationException(getErrorMsg()));
		}
	}

	protected void initializeXMLDocument() throws Exception {
		try {
			testDocument  		 = (Document)jmeterVariables.getObject("XML_DOCUMENT");
			stepNo   		 	 = jmeterVariables.get("STEP_NO");

			XPath mainXPathObject =  XPathFactory.newInstance().newXPath();

			String tmpl_name = "/steps/step[%s]";
			String mainXpath_name = String.format(tmpl_name, stepNo);
			Node step_name = (Node) mainXPathObject.compile(mainXpath_name).evaluate(testDocument, XPathConstants.NODE);
			String stepName = getAttribute(step_name, "name");
			String stepDescription = getAttribute(step_name, "description");
			String stepSeverity = getAttribute(step_name, "severity");
			sampleResult.setSampleLabel(stepName);
			this.pHATResponseData.setStepDescription(stepDescription);
			this.pHATResponseData.setStepSeverity(stepSeverity);			
			
			String scriptName = JMeterUtils.getProperty(PHTestCaseConstants.XML_SCRIPT_FILE_NAME);
			sampleResult.setResultFileName(scriptName+".jmx");			
			
			String linkFileName = getAttribute(step_name, STEP_ATTRIBUTE_LINKFILE);	
			
			
			
			if(linkFileName != null) {
				
				System.out.println("Read from link file : " + linkFileName);
				DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
				DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
				Document innerDocument = dBuilder.parse(new File(linkFileName));

				XPath innerXPathObject =  XPathFactory.newInstance().newXPath();
				String innerXPath = "/steps/step/component|/steps/step/if|/steps/step/loop";
				stepList = (NodeList) innerXPathObject.compile(innerXPath).evaluate(innerDocument, XPathConstants.NODESET);

			}else {
				System.out.println("Read from main file");
				String tmpl_main = "/steps/step[%s]/component|/steps/step[%s]/if|/steps/step[%s]/loop";
				String Xpath_main = String.format(tmpl_main, stepNo,stepNo,stepNo);
				stepList = (NodeList) mainXPathObject.compile(Xpath_main).evaluate(testDocument, XPathConstants.NODESET);
			}
		} catch (Exception e) {
			e.printStackTrace();
			pageExecutionStatus  = false;
			setErrorMsg("Failed to initialize XML document."+e);
			throw (new AutomationException(getErrorMsg()));
		}
	}

	public String getAttribute(Node node, String name) throws Exception {
		String value = null;

		try {
			Node valueNode = node.getAttributes().getNamedItem(name);
			if(valueNode != null) {
				value = valueNode.getTextContent();
			}
		} catch (Exception e) {
			e.printStackTrace();
			pageExecutionStatus  = false;
			setErrorMsg("Exception in reading attribute : " + name + " , " + getErrorMsg());
			throw (new AutomationException(getErrorMsg()));
		}

		return value;
	}

	protected void initializeJmeterContext() throws Exception {
		try {
			jmeterContext        = JMeterContextService.getContext();
			jmeterVariables      = jmeterContext.getVariables();
			sampleResult         = new SampleResult();
			sampleResult.sampleStart();

		} catch (Exception e) {
			e.printStackTrace();
			pageExecutionStatus  = false;
			setErrorMsg("Failed to load Jmeter context. " + e.getMessage());
			throw (new AutomationException(getErrorMsg()));
		}
	}

	private void initializeDriver() throws Exception {

		try {			
			driver              = (WebDriver)jmeterVariables.getObject("DRIVER");
			DRIVER_TIMEOUT_VALUE = Integer.parseInt(JMeterUtils.getProperty("DRIVER_TIMEOUT_VALUE"));
			System.out.println(driver);
			setDriverTimeOutValue(DRIVER_TIMEOUT_VALUE);
			driver.manage().window().maximize();
		} catch (Exception e) {
			e.printStackTrace();
			pageExecutionStatus  = false;
			setErrorMsg("Driver is null.");
			throw (new AutomationException(getErrorMsg()));
		}
	}

	protected void setDriverTimeOutValue(int timeOutValue) {
		driver.manage().timeouts().implicitlyWait(timeOutValue, TimeUnit.SECONDS);
	}

	protected void doGenerateSampleResultData(String message) {
		try {
			/*String responseData = sampleResult.getResponseDataAsString()!= null ?  
					sampleResult.getResponseDataAsString() +"\n "+ message : message;
			sampleResult.setResponseData(responseData, ENCODING_FORMAT);*/
			
			addLog(PHResponseDataConstants.DEBUG, message);
			
			System.out.println(message);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	

	protected PHATValidationHolder getNewValidationHolder(){
		PHATValidationHolder pHATValHolder = new PHATValidationHolder();
		pHATValHolder.setValName("Validation", this.pHATResponseData.getPhatValHolderList().size()+1);
		return pHATValHolder;
	}

	protected void setValidationHolderToResponseData(PHATValidationHolder pHATValHolder) {
		try {		

			this.pHATResponseData.addPhatValHolderToList(pHATValHolder);

			sampleResult.setResponseData(this.pHATResponseData.getPHATResponseDataAsXMLForRegression(), ENCODING_FORMAT);	
			//System.out.println(message);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	protected boolean doGenerateSampleResultData(String valDesc, Object expectedResult, Object actualResult, String validationKey) {
		return doGenerateSampleResultData(valDesc, expectedResult, actualResult, validationKey, ResultValidatorConditionType.EQUAL);
	}
	
	/*protected boolean doGenerateSampleResultData(String valDesc, Object expectedResult, Object actualResult, String validationKey) {
		return doGenerateSampleResultData(valDesc, expectedResult, actualResult, validationKey, ResultValidatorConditionType.EQUAL);
	}*/

	public boolean doGenerateSampleResultData(String valDesc, Object expectedResult, Object actualResult, String validationKey, int resultValCondType) {
		boolean result = Boolean.FALSE;
		try {
			//String responseData = sampleResult.getResponseDataAsString();
			PHATValidationHolder pHATValHolder = new PHATValidationHolder();

			pHATValHolder.setValName("Validation", this.pHATResponseData.getPhatValHolderList().size()+1);
			pHATValHolder.setValidationDesc(valDesc);

			PHATResultValidator phatResVal = new PHATResultValidator(resultValCondType);
			phatResVal.addToValidator(validationKey, expectedResult, actualResult);

			if(actualResult!= null){
				pHATValHolder.setActualResult(validationKey +" : "+ actualResult.toString());
			}else{
				pHATValHolder.setActualResult(validationKey +" : "+ "Actual value is Null");
			}
			if(expectedResult!= null){
				pHATValHolder.setExpectedResult(validationKey +" : "+ expectedResult.toString());
			}else{
				pHATValHolder.setExpectedResult(validationKey +" : "+ "Expected value is Null");
			}		

			PHATValidationResult valRes = phatResVal.validate();
			pHATValHolder.setValidationResult(valRes.getValidationMsg());						
			this.pHATResponseData.addPhatValHolderToList(pHATValHolder);					
			sampleResult.setResponseData(this.pHATResponseData.getPHATResponseDataAsXMLForRegression(), ENCODING_FORMAT);	
			result = valRes.isPassed();
			if(!valRes.isPassed()){
				isAnyValidationFailed = Boolean.TRUE;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}

	

	public void doGenerateFinalSamplerResultMessage(String message, boolean status) {
		try {
			doGenerateSampleResultData(message);
			String responseMessage = sampleResult.getResponseMessage()!= null ?  
					sampleResult.getResponseMessage() +"\n "+ message : message;
			if(isAnyValidationFailed){
				sampleResult.setSuccessful(Boolean.FALSE);
			}else{
				sampleResult.setSuccessful(status);
			}
			sampleResult.setResponseData(this.pHATResponseData.getPHATResponseDataAsXMLForRegression(), ENCODING_FORMAT);
			sampleResult.setResponseMessage(responseMessage);
			sampleResult.setDataType(SampleResult.TEXT);
			//sampleResult.setEndTime(System.currentTimeMillis());
			sampleResult.sampleEnd();

			//sampleResult.setSampleLabel(getClass().getName());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public SampleResult runTest(JavaSamplerContext context) {
		try {	
			this.samplerContext    = context;
			sampleResult           = startTest();			
			return sampleResult;			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}	


	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		if(this.errorMsg.trim().isEmpty())
			this.errorMsg = errorMsg;
		else 
			this.errorMsg = this.errorMsg+" \n "+errorMsg;
	}

	/**
	 * @return the infoMsg
	 */
	public String getInfoMsg() {
		return infoMsg;
	}

	/**
	 * @param infoMsg the infoMsg to set
	 */
	public void setInfoMsg(String infoMsg) {
		this.infoMsg = infoMsg;
	}

	public String takeScreenShotMethod_Robot(String className){
		if(className.indexOf(".") > -1) {
			className = className.substring(className.lastIndexOf(".")+1);
		}
		String fileName = "screenshots/" + className + "_" + System.currentTimeMillis() + ".jpg";

		String absoluteLocation = null;
		try{
			BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
			File file = new File(fileName);
			ImageIO.write(image, "jpg", file);
			absoluteLocation = file.getAbsolutePath();
		}
		catch(Exception e){
			System.out.println("Failed to take screenshot");
			e.printStackTrace();
		}
		return absoluteLocation;
	}

	/**
	 * 
	 * @param className ClassName to be appended with screenshot
	 * @param stringToDraw Actual String needs to displayed on screen (NA if nothing required)
	 * @param status - Success/Failure status in either true/false
	 * 
	 * Takes screen shot with message display on screen based on need
	 */
	public void takeScreenShotMethod_Driver(String className,String stringToDraw,boolean status){
		
		String scriptName = JMeterUtils.getProperty(XML_SCRIPT_FILE);
		String fileName = SCREENSHOTS_FOLDER + scriptName + "/" + scriptName + "_" + System.currentTimeMillis() + ".jpg";
		
		
		/*String scriptName = FileServer.getFileServer().getScriptName();
		if(className.indexOf(".") > -1) {
			className = className.substring(className.lastIndexOf(".")+1);
		}
		String fileName = SCREENSHOTS_FOLDER +scriptName.substring(0,scriptName.indexOf("."))+"/"+ className+"_"+System.currentTimeMillis() + ".jpg";*/
		String absoluteLocation = null;
		Graphics graphics=null;
		Graphics2D graphics_2d=null;
		BufferedImage image=null;
		File scrFile=null;
		File destFile=null;
		try {
			scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			if(!stringToDraw.trim().equalsIgnoreCase("na")){
				image = ImageIO.read(scrFile);
				graphics = image.getGraphics();	
				graphics.setFont(new Font("Verdana", Font.BOLD, 12));
				if(status)
					graphics.setColor(new Color (0, 102,0));
				else 
					graphics.setColor(Color.RED);

				int indexToStart=40;
				for(int iter=0;iter<stringToDraw.length();iter+=SCREENSHOT_DISPLAYCHAR){
					indexToStart=indexToStart+20;
					String newStringToTest=null;
					try {

						if((iter+SCREENSHOT_DISPLAYCHAR)>stringToDraw.length())
							newStringToTest ="-"+stringToDraw.substring(iter,stringToDraw.length());
						else
							newStringToTest ="-"+stringToDraw.substring(iter, (iter+SCREENSHOT_DISPLAYCHAR));
						graphics.drawString(newStringToTest, 200, indexToStart);
					} catch (Exception e) {
						doGenerateSampleResultData("Problem Processing Screenshot content");
					} finally{
						newStringToTest=null;
					}
				}

				graphics_2d = (Graphics2D) graphics;
				graphics_2d.setStroke(new BasicStroke(3));
				graphics_2d.setColor(Color.blue);
				graphics_2d.drawRect(190, 35, 1460, indexToStart);

				graphics.dispose();
				ImageIO.write(image, "png", scrFile);
			}
			destFile = new File(fileName);
			FileUtils.copyFile(scrFile, destFile);
			absoluteLocation = destFile.getAbsolutePath();
			doGenerateSampleResultData("Screenshot stored at " + absoluteLocation);
		} catch (Exception e) {
			doGenerateSampleResultData("Failed to take screenshot.");
		} finally{
			absoluteLocation=null;
			image=null;
			graphics=null;
			graphics_2d=null;
			scrFile=null;
			destFile=null;
		}
	}


	public void takeScreenShotMethod_Driver(String className){
		String scriptName = JMeterUtils.getProperty(XML_SCRIPT_FILE);
		/*if(className.indexOf(".") > -1) {
			className = className.substring(className.lastIndexOf(".")+1);
		}
		String fileName = SCREENSHOTS_FOLDER +scriptName.substring(0,scriptName.indexOf("."))+"/"+ className+"_"+System.currentTimeMillis() + ".jpg";*/
		String fileName = SCREENSHOTS_FOLDER + scriptName + "/" + scriptName + "_" + System.currentTimeMillis() + ".jpg";

		String absoluteLocation = null;
		try {
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File file = new File(fileName);
			FileUtils.copyFile(scrFile, file);
			absoluteLocation = file.getAbsolutePath();
			doGenerateSampleResultData("Screenshot stored at " + absoluteLocation);
		} catch (Exception e) {
			doGenerateSampleResultData("Failed to take screenshot.");
			e.printStackTrace();
		}
	}

	private void createFirefoxDriver() {
		try {
			driver = new FirefoxDriver();			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void createChromeDriver() {
		try {
			System.setProperty("webdriver.chrome.driver", "C:/ProjData/ProjSWs/AUTOMATION_TOOL_RELATED/chromedriver_win32/chromedriver.exe");
			driver = new ChromeDriver();				
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void createIEDriver() {
		try {
			System.setProperty("webdriver.ie.driver", "C:/webdrivers/IEDriverServer.exe" );  
			driver = new InternetExplorerDriver();			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	public abstract SampleResult startTest();

	public void setupTest(JavaSamplerContext arg0) {
	}

	public void teardownTest(JavaSamplerContext arg0) {
	}

	/*
	 *	@param valueIn - Plain value or jmeter varaible name
	 *	@return retValue - if valueIn is a jmeter variable (which startswith ##), returns value read from jmeter context otherwise returns the same value.
	 *   
	 */
	public Object parseValue(String valueIn) throws Exception {
	
		if(valueIn != null && valueIn.startsWith(JMETER_PROPERTY_NOTATION)){
			String temp = valueIn.replace(JMETER_PROPERTY_NOTATION, "");
			valueIn = JMeterUtils.getProperty(temp);
			doGenerateSampleResultData("Value " + valueIn + " read from Jmeter property " + temp);
		}		
		else if(valueIn != null && valueIn.startsWith(JMETER_VARIABLE_NOTATION)){	
			String temp = valueIn.replace(JMETER_VARIABLE_NOTATION, "");
			valueIn = jmeterVariables.get(temp);
			if(valueIn == null) {
				valueIn = "";
			}
			doGenerateSampleResultData("Value " + valueIn + " read from Jmeter Variable " + temp);	
		}
		else if(valueIn != null && valueIn.startsWith(JMETER_VARIABLE_OBJ_NOTATION)){
			String temp = valueIn.replace(JMETER_VARIABLE_OBJ_NOTATION, "");
			System.out.println(" Jmeter Object Notation ::: "+temp);
			valueIn = jmeterVariables.getObject(temp) != null? jmeterVariables.getObject(temp).toString():"NULL";
			return jmeterVariables.getObject(temp);		
		}
		else if(valueIn != null && valueIn.startsWith(JMETER_VARIABLE_REPLACE_NOTATION)){
			String temp = valueIn.replace(JMETER_VARIABLE_REPLACE_NOTATION, "");
			System.out.println(" Jmeter Object Notation REP ::: "+temp);
			while(temp.contains(JMETER_VARIABLE_NOTATION)){
				int startIndex = temp.indexOf(JMETER_VARIABLE_NOTATION);
				int endIndex = temp.indexOf(JMETER_VARIABLE_NOTATION, startIndex+1);
				String variable = temp.substring(startIndex+2, endIndex);	
				String varValue =jmeterVariables.get(variable);
				if(varValue == null){
					varValue = "";
				}
				String replaceStr = temp.substring(startIndex,  endIndex+2);	
				temp = temp.replace(replaceStr, varValue);
				valueIn = temp;
			}
			valueIn = temp;
		}
		return valueIn;
	}
}