/**
 * 
 */
package com.sanity.utils;

/**
 * @author anponnus
 *
 */
public interface PHResponseDataConstants {
	
	static String TESTCASE_DESCRIPTION_OP_TAG = "<TESTCASE_DESCRIPTION>";
	static String TESTCASE_DESCRIPTION_CL_TAG = "</TESTCASE_DESCRIPTION>";
	
	static String TESTCASE_SEVERITY_OP_TAG = "<TESTCASE_SEVERITY>";
	static String TESTCASE_SEVERITY_CL_TAG = "</TESTCASE_SEVERITY>";
	
	static String STEP_DESCRIPTION_OP_TAG = "<STEP_DESCRIPTION>";
	static String STEP_DESCRIPTION_CL_TAG = "</STEP_DESCRIPTION>";
	
	static String STEP_SEVERITY_OP_TAG = "<STEP_SEVERITY>";
	static String STEP_SEVERITY_CL_TAG = "</STEP_SEVERITY>";
	
	static String VALIDATIONS_OP_TAG = "<VALIDATIONS>";
	static String VALIDATIONS_CL_TAG = "</VALIDATIONS>";
	
	static String VALIDATION_OP_TAG = "<VALIDATION>";
	static String VALIDATION_CL_TAG = "</VALIDATION>";
	
	static String VAL_NAME_OP_TAG = "<NAME>";
	static String VAL_NAME_CL_TAG = "</NAME>";
	
	static String VAL_DESC_OP_TAG = "<DESCRIPTION>";
	static String VAL_DESC_CL_TAG = "</DESCRIPTION>";
	
	static String VAL_EXP_RES_OP_TAG = "<EXPECTED_RESULT>";
	static String VAL_EXP_RES_CL_TAG = "</EXPECTED_RESULT>";
	
	static String VAL_ACT_RES_OP_TAG = "<ACTUAL_RESULT>";
	static String VAL_ACT_RES_CL_TAG = "</ACTUAL_RESULT>";
	
	static String VAL_RES_OP_TAG = "<VALIDATION_RESULT>";
	static String VAL_RES_CL_TAG = "</VALIDATION_RESULT>";	
	
	static String DEV_LOGS_OP_TAG = "<DEVELOPER_LOGS>";
	static String DEV_LOGS_CL_TAG = "</DEVELOPER_LOGS>";
	
	static String HYPER_LINK_FIRST_OP_TAG = "<a href=\"";
	static String HYPER_LINK_FIRST_CL_TAG = "\">";
	static String HYPER_LINK_CL_TAG = "</a>";
	static String HYPER_LINK_CL_TAG_WITH_SCREENSHOT = "\">Log</a>";
	
	static int INFO = 1;
	static int WARN = 2;
	static int DEBUG = 3;
	static int ERROR = 4;

}
