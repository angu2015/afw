/**
 * 
 */
package com.sanity.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * This is the class which holds the complete response data of a test scripts.
 * this class will categorize the response data and format in terms of show it in HTLM Report.
 * 
 * @author anponnus
 *
 */
public class PHATResponseData {

	/**
	 * List of categorization as Params
	 * 
	 */
	
	private String stepDescription;
	private List<PHATValidationHolder> phatValHolderList = new ArrayList<PHATValidationHolder>();
	private PHATLogger logger;
	private String testStepSeverity;
	private String testCaseSeverity;
	private String testCaseDescription;
	
	
	public PHATResponseData() {
		// TODO Auto-generated constructor stub
	}


	/**
	 * @return the stepDescription
	 */
	public String getStepDescription() {
		return stepDescription;
	}


	/**
	 * @param stepDescription the stepDescription to set
	 */
	public void setStepDescription(String stepDescription) {
		this.stepDescription = stepDescription;
	}

	/**
	 * @return the logger
	 */
	public PHATLogger getLogger() {
		if(logger == null){
			logger = new PHATLogger();
		}
		return logger;
	}


	/**
	 * @param logger the logger to set
	 */
	public void setLogger(PHATLogger logger) {
		this.logger = logger;
	}


	/**
	 * @return the severity
	 */
	public String getStepSeverity() {
		return testStepSeverity;
	}


	/**
	 * @param severity the severity to set
	 */
	public void setStepSeverity(String severity) {
		this.testStepSeverity = severity;
	}


	/**
	 * @return the testCaseSeverity
	 */
	public String getTestCaseSeverity() {
		return testCaseSeverity;
	}


	/**
	 * @param testCaseSeverity the testCaseSeverity to set
	 */
	public void setTestCaseSeverity(String testCaseSeverity) {
		this.testCaseSeverity = testCaseSeverity;
	}


	/**
	 * @return the testCaseDescription
	 */
	public String getTestCaseDescription() {
		return testCaseDescription;
	}


	/**
	 * @param testCaseDescription the testCaseDescription to set
	 */
	public void setTestCaseDescription(String testCaseDescription) {
		this.testCaseDescription = testCaseDescription;
	}


	/**
	 * @return the phatValHolderList
	 */
	public List<PHATValidationHolder> getPhatValHolderList() {
		return phatValHolderList;
	}

	/**
	 * @return the phatValHolderList
	 */
	public void setPhatValHolderList(List<PHATValidationHolder> phatValHolderList) {
		this.phatValHolderList=phatValHolderList;
	}

	/**
	 * @param phatValHolder the phatValHolder to add
	 */
	public void addPhatValHolderToList(PHATValidationHolder phatValHolder) {
		this.phatValHolderList.add(phatValHolder);
	}
	
	public String getPHATValidationHolderListAsXML(){
		
		StringBuilder validationsStr = new StringBuilder();
		
		for (PHATValidationHolder phatValHol : this.phatValHolderList){
			validationsStr.append(phatValHol.getPHATValidationHolderAsXML());
		}
		
		return validationsStr.toString();
	}
	
	public String getPHATResponseDataAsXML(){
		
		StringBuilder phatResponseDataStr = new StringBuilder();
		
		//TESTCASE-DESCRIPTION
		phatResponseDataStr.append(PHResponseDataConstants.TESTCASE_DESCRIPTION_OP_TAG);		
		phatResponseDataStr.append(getTestCaseDescription());
		phatResponseDataStr.append(PHResponseDataConstants.TESTCASE_DESCRIPTION_CL_TAG);
		
		//TESTCASE-SEVERITY
		phatResponseDataStr.append(PHResponseDataConstants.TESTCASE_SEVERITY_OP_TAG);		
		phatResponseDataStr.append(getTestCaseSeverity());
		phatResponseDataStr.append(PHResponseDataConstants.TESTCASE_SEVERITY_CL_TAG);
		
		//VALIDATIONS
		phatResponseDataStr.append(PHResponseDataConstants.VALIDATIONS_OP_TAG);
		phatResponseDataStr.append(getPHATValidationHolderListAsXML());
		phatResponseDataStr.append(PHResponseDataConstants.VALIDATIONS_CL_TAG);
		
		//DEVELOPER-LOGS
		phatResponseDataStr.append(PHResponseDataConstants.DEV_LOGS_OP_TAG);
		phatResponseDataStr.append(getLogger().getDebugLog());
		phatResponseDataStr.append(PHResponseDataConstants.DEV_LOGS_CL_TAG);
		
		return phatResponseDataStr.toString();
	}
	
	public String getPHATResponseDataAsXMLForRegression(){
		
		StringBuilder phatResponseDataStr = new StringBuilder();
		
		//TESTCASE-DESCRIPTION
		phatResponseDataStr.append(PHResponseDataConstants.TESTCASE_DESCRIPTION_OP_TAG);		
		phatResponseDataStr.append(getTestCaseDescription());
		phatResponseDataStr.append(PHResponseDataConstants.TESTCASE_DESCRIPTION_CL_TAG);
		
		//TESTCASE-SEVERITY
		phatResponseDataStr.append(PHResponseDataConstants.TESTCASE_SEVERITY_OP_TAG);		
		phatResponseDataStr.append(getTestCaseSeverity());
		phatResponseDataStr.append(PHResponseDataConstants.TESTCASE_SEVERITY_CL_TAG);
		
		//STEP-DESCRIPTION
		phatResponseDataStr.append(PHResponseDataConstants.STEP_DESCRIPTION_OP_TAG);		
		phatResponseDataStr.append(getStepDescription());
		phatResponseDataStr.append(PHResponseDataConstants.STEP_DESCRIPTION_CL_TAG);
		
		//STEP-SEVERITY
		phatResponseDataStr.append(PHResponseDataConstants.STEP_SEVERITY_OP_TAG);		
		phatResponseDataStr.append(getStepSeverity());
		phatResponseDataStr.append(PHResponseDataConstants.STEP_SEVERITY_CL_TAG);
		
		//VALIDATIONS
		phatResponseDataStr.append(PHResponseDataConstants.VALIDATIONS_OP_TAG);
		phatResponseDataStr.append(getPHATValidationHolderListAsXML());
		phatResponseDataStr.append(PHResponseDataConstants.VALIDATIONS_CL_TAG);
		
		//DEVELOPER-LOGS
		phatResponseDataStr.append(PHResponseDataConstants.DEV_LOGS_OP_TAG);
		phatResponseDataStr.append(getLogger().getDebugLog());
		phatResponseDataStr.append(PHResponseDataConstants.DEV_LOGS_CL_TAG);
		
		return phatResponseDataStr.toString();
	}
	
	

}
