package com.automation.framework;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;

import org.apache.jmeter.samplers.SampleResult;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.sanity.utils.AutomationException;
import com.sanity.utils.ResultValidatorConditionType;


public class PHATXMLDrivenParser extends PHATTestCase {

	@Override
	public SampleResult startTest() {
		try {			
			System.out.println("start " + getClass());
			loadInputFromJmeter();
			executeSteps();
			pageExecutionStatus  = true;
		} catch (Exception e) {
			e.printStackTrace();
			pageExecutionStatus  = false;
			takeScreenShotMethod_Driver(getClass().toString());
		}
		finally {
			doGenerateFinalSamplerResultMessage(pageExecutionStatus?"Success":"Failure", pageExecutionStatus);
		}
		return getSampleResult();
	}

	private void loadInputFromJmeter() throws Exception {

		try {			
			loadDriverAndData();
			System.out.println("Current step number is : " + stepNo);
		} catch (Exception e) {
			e.printStackTrace();
			pageExecutionStatus  = false;
			setErrorMsg("Failed to load value from Jmeter context. " + e.getMessage());
			throw (new AutomationException(getErrorMsg()));
		}
	}

	public void executeSteps() throws Exception {

		try {
			for (int i = 0; i < stepList.getLength(); i++) {
				Node mainNode = stepList.item(i);
				String nodeName = mainNode.getNodeName();
				if(nodeName.equalsIgnoreCase("COMPONENT")) {
					handleComponents(mainNode);
				} 
				}
			
		}catch (Exception e) {
			e.printStackTrace();
			pageExecutionStatus  = false;
			setErrorMsg("Error while executing Steps. " + e.getMessage());
			throw (new AutomationException(getErrorMsg()));
		}
	}

	private void handleParameter(Node node1) throws Exception {
		String parameterName = getAttribute(node1,COMPONENT_ATTRIBUTE_NAME);
		String parameterValue = getAttribute(node1,COMPONENT_ATTRIBUTE_VALUE);
		jmeterVariables.put(parameterName, parameterValue);
	}
	private void handleIfBlock(Node node) throws Exception {
		XPath XPathObject =  XPathFactory.newInstance().newXPath();
		String XPath = "./component";
		try {
			NodeList nodes = (NodeList) XPathObject.compile(XPath).evaluate(node, XPathConstants.NODESET);
			for (int i = 0; i < nodes.getLength(); i++) {
				Node innerNode = nodes.item(i);
				handleComponents(innerNode);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		try {
			XPath = "./parameter";
			NodeList nodes = (NodeList) XPathObject.compile(XPath).evaluate(node, XPathConstants.NODESET);
			for (int i = 0; i < nodes.getLength(); i++) {
				Node innerNode = nodes.item(i);
				handleParameter(innerNode);
			}	
		} catch (Exception e) {
			// TODO: handle exception
		}		
	}
	private void handleLoopBlock(Node node) throws Exception {
		XPath XPathObject =  XPathFactory.newInstance().newXPath();
		String XPath = "./component";
		try {
			NodeList nodes = (NodeList) XPathObject.compile(XPath).evaluate(node, XPathConstants.NODESET);
			for (int i = 0; i < nodes.getLength(); i++) {
				Node innerNode = nodes.item(i);
				handleComponents(innerNode);
			}	
		} catch (Exception e) {
			// TODO: handle exception
		}
		
			try {
				 XPath = "./parameter";
				NodeList nodes = (NodeList) XPathObject.compile(XPath).evaluate(node, XPathConstants.NODESET);
				for (int i = 0; i < nodes.getLength(); i++) {
					Node innerNode = nodes.item(i);
					handleParameter(innerNode);
				}	
			} catch (Exception e) {
				// TODO: handle exception
			}		
	}
	private void handleComponents(Node node1) throws Exception {
		String componentName = getAttribute(node1,COMPONENT_ATTRIBUTE_NAME);
 
		String xpath = getAttribute(node1,COMPONENT_ATTRIBUTE_XPATH);
		String xpathInput = getAttribute(node1,COMPONENT_ATTRIBUTE_XPATH_INPUT);
		String type = getAttribute(node1,COMPONENT_ATTRIBUTE_TYPE);
		String action = getAttribute(node1,COMPONENT_ATTRIBUTE_ACTION);
		String value = getAttribute(node1,COMPONENT_ATTRIBUTE_VALUE);
		String condition = getAttribute(node1,COMPONENT_ATTRIBUTE_CONDITION);
		String compareWith = getAttribute(node1,COMPONENT_ATTRIBUTE_COMPAREWITH);
		String saveTo = getAttribute(node1,COMPONENT_ATTRIBUTE_SAVETO);
		String duration = getAttribute(node1,COMPONENT_ATTRIBUTE_DURATION);
		String waitTime = getAttribute(node1,COMPONENT_ATTRIBUTE_WAITTIME);
		String valDescription = getAttribute(node1,COMPONENT_ATTRIBUTE_VAL_DESC);
		String valKey = getAttribute(node1,COMPONENT_ATTRIBUTE_VAL_KEY);	
		
		//edit by jagee
		String attrName = getAttribute(node1,COMPONENT_ATTRIBUTE_ATTRNAME);
	
		// Reading value from the Jmeter Variables
		Object valueObj = null;
		if(value!=null){
			valueObj = parseValue(value);
			System.out.println("@@@@@@@@@@@@@  value @@@@@@@@@@@@@@ "+valueObj);
			if(valueObj instanceof String){
				value = valueObj.toString();
			}
		}
		Object compareWithObj = null;
		if(compareWith!=null){
			compareWithObj = parseValue(compareWith);
			System.out.println("######### comparewith ##########  "+compareWithObj);
			if(compareWithObj instanceof String){
				compareWith = compareWithObj.toString();
			}
		}
		
		Object xpathInputObj = null;
		if(xpathInput!=null){
			xpathInputObj = parseValue(xpathInput);
			System.out.println("########### Xpath ###############   "+xpathInputObj);
			if(xpathInputObj instanceof String){
				xpathInput = xpathInputObj.toString();
			}
		}
		
		

		String exp = "Xpath : %s  Type : %s  Action : %s  Value : %s ";
		System.out.println(String.format(exp, xpath, type, action,value));
		if (componentName.equalsIgnoreCase(COMPONENT_NAME_TIMER)) {
			Thread.sleep(Long.parseLong(value.trim()) * 1000);
		} else if (xpath != null && action != null) {
			xpath = ResourceObjects.getObjectValue(xpath,xpathInput);			
			if (action.equalsIgnoreCase(COMPONENT_ACTION_ENABLE)) {
				handleEnable(xpath,saveTo);
			} else if (action.equalsIgnoreCase(COMPONENT_ACTION_DISABLE)) {
				handleDisable(xpath);
			} else if (action.equalsIgnoreCase(COMPONENT_ACTION_CLICK)) {
				handleClick(xpath);	
			} else if (action.equalsIgnoreCase(COMPONENT_ACTION_ENTERVALUE)) {
				handleEnter(xpath, type, value, componentName);
			} else if (action.equalsIgnoreCase(COMPONENT_ACTION_READVALUE)) {
				handleRead(xpath, componentName, saveTo,compareWith);
			} else if (action.equalsIgnoreCase(COMPONENT_ACTION_VALIDATE)) {
				handleValidate(xpath, compareWith, condition,componentName, saveTo, valDescription,valKey);
			} 

		} else if (action != null) {
			 if (action.equalsIgnoreCase(COMPONENT_ACTION_VALIDATE_VALUES)) {
				handleValidateValues(value, compareWith, condition, valDescription,valKey);
			} 
	}
	
	
	}

	
	
	

		public void handleAlert() {
			    try {	
			    	WebDriverWait wait = new WebDriverWait(driver, 2);
			        wait.until(ExpectedConditions.alertIsPresent());
			        Alert alert = driver.switchTo().alert();
			        doGenerateSampleResultData(" Alert detected ::: "+alert.getText());
			        alert.accept();
			    } catch (Exception e) {
			    	pageExecutionStatus  = false;
				//	setErrorMsg("Error while Handling Alert " + e.getMessage());
					doGenerateSampleResultData("Error while Handling Alert : "+e.getMessage());
					e.printStackTrace();
			    }
			}

		



	private void getValue(String xpath,String saveTo,String attrName,String compareWith,String valDesc, String valKey,String condition,String type) throws Exception {

		try{
			String value = null;
			if(attrName!=null){
				try{
					value = driver.findElement(By.xpath(xpath)).getAttribute(attrName);
					doGenerateSampleResultData("Read value from the UI : " + value);
					jmeterVariables.put(saveTo, value);	
				}catch(Exception e){
					jmeterVariables.put(saveTo,"noelement");
				}
			
			}else {
				value = driver.findElement(By.xpath(xpath)).getText();				
				if(type!=null && type.equalsIgnoreCase(COMPONENT_ACTION_STRING)){
					jmeterVariables.put(saveTo, value);
				}else{
					int count = Integer.parseInt(value)-1;
					jmeterVariables.put(saveTo, count+"");
				}
			}
			

//			if(compareWith != null ) {
//				if(value.equalsIgnoreCase(compareWith)){
//					doGenerateSampleResultData("Expected : "+compareWith);
//					doGenerateSampleResultData("Actual : "+value);
//					doGenerateSampleResultData("Value matched");
//				} else {
//					doGenerateSampleResultData("Expected : "+compareWith);
//					doGenerateSampleResultData("Actual : "+value);
//					doGenerateSampleResultData("Value not matched");
//					pageExecutionStatus  = false;
//					setErrorMsg("Value not matches. Fail");
//					throw (new AutomationException(getErrorMsg()));
//				}
//			}
			if(valDesc!=null && condition == null){
				doGenerateSampleResultData(valDesc, compareWith, value, valKey);
			}else if(valDesc!=null && condition.equalsIgnoreCase(VALIDATE_COND_CONTAINS)) {
				doGenerateSampleResultData(valDesc, compareWith, value, valKey, ResultValidatorConditionType.CONTAINS);
			} 
		}catch (Exception e){
			e.printStackTrace();
			pageExecutionStatus  = false;
			setErrorMsg("Error while getting value. " + e);
			doGenerateSampleResultData("Error while getting value"+e);
			throw (new AutomationException(getErrorMsg()));
		}
	}
	
	public void handleEnable(String xpath,String saveTo) throws Exception {
		WebElement element = driver.findElement(By.xpath(xpath));
		if(!element.isSelected()) {
			element.click();
		}
		if (saveTo!=null)
		jmeterVariables.put(saveTo, "enabled");
	}

	public void handleDisable(String xpath) throws Exception {
		WebElement element = driver.findElement(By.xpath(xpath));
		if(element.isSelected()) {
			element.click();
		}
	}

	public void handleRead(String xpath, String componentName, String saveTo, String compareWith) throws Exception {
		String value = driver.findElement(By.xpath(xpath)).getText();
		doGenerateSampleResultData("Read value from the UI : " + value);

		if(saveTo != null ){
			jmeterVariables.put(saveTo, value);
			//doGenerateSampleResultData("Value " + value + " saved to Jmeter Variable " + saveTo);
			System.out.println("Value " + value + " saved to Jmeter Variable " + saveTo);
		}

		if(compareWith != null ) {
			if(value.equalsIgnoreCase(compareWith)){
				doGenerateSampleResultData("Expected : "+compareWith);
				doGenerateSampleResultData("Actual : "+value);
				doGenerateSampleResultData("Value matched");
			} else {
				doGenerateSampleResultData("Expected : "+compareWith);
				doGenerateSampleResultData("Actual : "+value);
				doGenerateSampleResultData("Value not matched");
				pageExecutionStatus  = false;
				setErrorMsg("Value not matches. Fail");
				throw (new AutomationException(getErrorMsg()));
			}
		}
	}

	public void handleValidate(String xpath, String compareWith, String condition, String componentName, String saveTo, String valDesc, String valKey) throws Exception {
		
			String value = driver.findElement(By.xpath(xpath)).getText();
			doGenerateSampleResultData("Read value from the UI : " + value);

			if(saveTo != null ){
				jmeterVariables.put(saveTo, value);				
				doGenerateSampleResultData("Value " + value + " saved to " + saveTo);
			}
			if(condition == null) {
				doGenerateSampleResultData(valDesc, compareWith, value, valKey);
			} else if(condition.equalsIgnoreCase(VALIDATE_COND_CONTAINS)) {
				System.out.println(" contains #####");
				doGenerateSampleResultData(valDesc, compareWith, value, valKey,ResultValidatorConditionType.CONTAINS);
			}
			//doGenerateSampleResultData(valDesc, compareWith, value, valKey);
			if(compareWith != null ) {
				if(value.equalsIgnoreCase(compareWith)){
					doGenerateSampleResultData("Expected : "+compareWith);
					doGenerateSampleResultData("Actual : "+value);
					doGenerateSampleResultData("Value matched");
				} else {
					doGenerateSampleResultData("Expected : "+compareWith);
					doGenerateSampleResultData("Actual : "+value);
					doGenerateSampleResultData("Value not matched");
					pageExecutionStatus  = false;
					setErrorMsg("Value not matches. Fail");
					throw (new AutomationException(getErrorMsg()));
				}

			}
		
	}

	public void handleValidateValues(String value, String compareWith, String condition, String valDesc, String valKey) throws Exception {
		
		if(condition == null) {
			doGenerateSampleResultData(valDesc, compareWith, value, valKey);
		} else if(condition.equalsIgnoreCase(VALIDATE_COND_CONTAINS)) {
			doGenerateSampleResultData(valDesc, compareWith, value, valKey, ResultValidatorConditionType.CONTAINS);
		} else if(condition.equalsIgnoreCase(VALIDATE_COND_NOT_EQUALS)) {
			doGenerateSampleResultData(valDesc, compareWith, value, valKey, ResultValidatorConditionType.NOT_EQUAL);
		} else if (condition.equalsIgnoreCase(VALIDATE_COND_GREATER_THAN)) {
			doGenerateSampleResultData(valDesc, compareWith, value, valKey, ResultValidatorConditionType.GREATER_THAN);
		} else if (condition.equalsIgnoreCase(VALIDATE_COND_LESSER_THAN)) {
			doGenerateSampleResultData(valDesc, compareWith, value, valKey, ResultValidatorConditionType.LESSER_THAN);
		}
//		if(compareWith != null ) {
//			if(processText(compareWith, value, condition)){
//				doGenerateSampleResultData("Expected : "+compareWith);
//				doGenerateSampleResultData("Actual : "+value);
//				doGenerateSampleResultData("Value matched");
//			} else {
//				doGenerateSampleResultData("Expected : "+compareWith);
//				doGenerateSampleResultData("Actual : "+value);
//				doGenerateSampleResultData("Value not matched");
//				pageExecutionStatus  = false;
//				setErrorMsg("Value not matches. Fail");
//				throw (new AutomationException(getErrorMsg()));
//			}
//
//		}
	}
	



	public boolean processText(String expected, String actual, String condition) throws Exception {
		boolean success = false;

		if(condition == null) {
			success = actual.equalsIgnoreCase(expected);
		} else if(condition.equalsIgnoreCase(VALIDATE_COND_CONTAINS)) {
			success = actual.contains(expected);
		} else if(condition.equalsIgnoreCase(VALIDATE_COND_EQUALS)) {
			success = actual.equalsIgnoreCase(expected);
		}
		return success;
	}

	public void handleClick(String xpath) throws Exception{
		try{
			doGenerateSampleResultData("#############################################################################");
			driver.findElement(By.xpath(xpath)).click();
			doGenerateSampleResultData(" Element clicked.");
		}catch(Exception e){
			doGenerateSampleResultData("Element disabled (or) not found");
			takeScreenShotMethod_Driver(getClass().toString());
			setErrorMsg(e.getMessage());
			throw (new AutomationException(getErrorMsg()));
		}
	}

	public void handleEnter(String xpath, String type, String value, String componentName) throws Exception {

		if(componentName.equalsIgnoreCase(COMPONENT_NAME_TEXTBOX)) {

			enterValueInTextBox(driver.findElement(By.xpath(xpath)), value);

		}else if(componentName.equalsIgnoreCase(COMPONENT_NAME_SELECT)) {

			if(type.equalsIgnoreCase(COMPONENT_SELECT_REGULAR)) {
				selectBox_Regular(driver.findElement(By.xpath(xpath)), value);

			}
		}
	}


	public void selectBox_Regular(WebElement element, String value) throws Exception {
		try {
			Thread.sleep(200);
			new Select(element).selectByVisibleText(value);
			doGenerateSampleResultData("Option is chosen : " + value);
		} catch (Exception e) {
			e.printStackTrace();
			pageExecutionStatus  = false;
			takeScreenShotMethod_Driver(getClass().toString());
			setErrorMsg("Failed to select value in Select Box : " + value + " , " + e.getMessage());
			throw (new AutomationException(getErrorMsg()));
		}
	}

	
	public void enterValueInTextBox(WebElement element, String value) throws Exception {
		try {
			element.clear();
			value = value.replaceAll("\\(", Keys.chord(Keys.SHIFT,"9"));
			element.sendKeys(value);
			doGenerateSampleResultData("Entered value in Textbox : " + value);
		} catch (Exception e) {
			e.printStackTrace();
			pageExecutionStatus  = false;
			takeScreenShotMethod_Driver(getClass().toString());
			setErrorMsg("Failed to enter value in Text Box : " + value + " , " + e.getMessage());
			throw (new AutomationException(getErrorMsg()));
		}
	}

	@Override
	public void populateArguments() {
		// TODO Auto-generated method stub

	}
}
