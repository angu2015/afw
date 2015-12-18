/**
 * 
 */
package com.sanity.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.jmeter.services.FileServer;

import com.sanity.utils.PHATValidationResult.ResultEnum;

/**
 * @author anponnus
 *
 */
public class PHATResultValidator {
	
	Map<String, Object> expValidatorMap = null;
	Map<String, Object> actualValidatorMap = null;
	
	public final String COMMA_SEPERATOR = ",";
	public final String COLLON_SEPERATOR = " : ";
	public final String JMETER_LOG_DIR_FROM_REPORT = "../jmeter/logs/";
	
	int conditionType = ResultValidatorConditionType.EQUAL;
	
	/**
	 * Empty constructor to initialize validator map
	 */
	public PHATResultValidator(int conditionType) {
		expValidatorMap = new HashMap<String, Object>();
		actualValidatorMap = new HashMap<String, Object>();
		this.conditionType = conditionType;
	}
	
	/**
	 * 
	 */
	private void reset(){
		expValidatorMap = new HashMap<String, Object>();
		actualValidatorMap = new HashMap<String, Object>();
	}
	
	/**
	 * @param validatorKey
	 * @param expectedMap
	 */
	public void addExpectedToValidator(String validatorKey, Map<String, String> expectedMap){
		this.expValidatorMap.put(validatorKey, expectedMap);
	}
	
	/**
	 * @param validatorKey
	 * @param actualMap
	 */
	public void addActualToValidator(String validatorKey, Map<String, String> actualMap){
		this.actualValidatorMap.put(validatorKey, actualMap);
	}
	
	/**
	 * @param validatorKey
	 * @param expectedMap
	 * @param actualMap
	 */
	public void addToValidator(String validatorKey, Map<String, String> expectedMap, Map<String, String> actualMap){
		this.expValidatorMap.put(validatorKey, expectedMap);
		this.actualValidatorMap.put(validatorKey, actualMap);
	}
	
	/**
	 * @param validatorKey
	 * @param expectedMap
	 * @param actualMap
	 */
	public void addToValidator(String validatorKey, Object expectedMap, Object actualMap){
		this.expValidatorMap.put(validatorKey, expectedMap);
		this.actualValidatorMap.put(validatorKey, actualMap);
	}
	
	/**
	 * @param validatorKey
	 * @param expected
	 */
	public void addExpToValidator(String validatorKey, String expected){
		this.expValidatorMap.put(validatorKey, expected);
	}
	
	/**
	 * @param validatorKey
	 * @param actual
	 */
	public void addActualToValidator(String validatorKey, String actual){
		this.actualValidatorMap.put(validatorKey, actual);
	}
	
	/**
	 * @param validatorKey
	 * @param expected
	 * @param actual
	 */
	public void addToValidator(String validatorKey, String expected, String actual){
		this.expValidatorMap.put(validatorKey, expected);
		this.actualValidatorMap.put(validatorKey, actual);
	}
	
	/**
	 * @param validatorKey
	 * @param expected
	 */
	public void addExpToValidator(String validatorKey, List<String> expected){
		this.expValidatorMap.put(validatorKey, expected);
	}
	
	/**
	 * @param validatorKey
	 * @param actual
	 */
	public void addActualToValidator(String validatorKey, List<String> actual){
		this.actualValidatorMap.put(validatorKey, actual);
	}
	
	/**
	 * @param validatorKey
	 * @param expected
	 * @param actual
	 */
	public void addToValidator(String validatorKey, List<String> expected, List<String> actual){
		this.expValidatorMap.put(validatorKey, expected);
		this.actualValidatorMap.put(validatorKey, actual);
	}
	
	
	
	/**
	 * 
	 * when the validate calls it will validate the complete result and update the JTL with result 
	 * and get ready for the next validation.
	 * @return
	 */
	public PHATValidationResult validate() {
		PHATValidationResult result = null;

		for (Iterator<String> iterator = expValidatorMap.keySet().iterator(); iterator.hasNext();) {
			String valKey = iterator.next();
			try{
				if(actualValidatorMap.get(valKey) != null){
					
					if(expValidatorMap.get(valKey) != null && expValidatorMap.get(valKey) instanceof String) {
						
						if(ResultValidatorConditionType.CONTAINS == conditionType) {
							result = stringContains(valKey, expValidatorMap.get(valKey), actualValidatorMap.get(valKey));
							
						} else if (ResultValidatorConditionType.GREATER_THAN == conditionType || 
								ResultValidatorConditionType.LESSER_THAN == conditionType) {
							result = relationalIntComp(valKey, expValidatorMap.get(valKey), actualValidatorMap.get(valKey), conditionType);
							
						} else {
							result = singleValidation(valKey, expValidatorMap.get(valKey), actualValidatorMap.get(valKey), true);
						}
						
					}else {
						if(actualValidatorMap.get(valKey) instanceof String){//when actual value had error message it will be String. 								
							result = generateFailureResult(valKey, getReasonOnFailure(actualValidatorMap.get(valKey).toString()));
							
						}else if(expValidatorMap.get(valKey) != null && expValidatorMap.get(valKey) instanceof List){
							boolean isListOfList = verifyMapContainsListOfList((List<Object>)expValidatorMap.get(valKey));
							
							if(isListOfList){
								result = listOfListValidation(valKey, (List<List<String>>)expValidatorMap.get(valKey), (List<List<String>>)actualValidatorMap.get(valKey));
							}else{
								result = listValidation(valKey, (List<String>)expValidatorMap.get(valKey), (List<String>)actualValidatorMap.get(valKey));
							}
							
						}else if(expValidatorMap.get(valKey) != null && expValidatorMap.get(valKey) instanceof Map){
							result = multipleValidation(valKey, (Map<String, String>)expValidatorMap.get(valKey), (Map<String, String>)actualValidatorMap.get(valKey));
							
						}else{
							result = generateFailureResult(valKey, getReasonOnFailure(PHATMessageConstants.DATAMODEL_LOAD_FAILURE));
						}
					}
				}else{
					result = generateFailureResult(valKey, getReasonOnFailure(PHATMessageConstants.SELENIUM_ELEMENT_LOAD_ERROR));
				}
				printPHATResultMsg(result);
				
			}catch(Exception ex){					
				result = generateFailureResult(valKey, getReasonOnFailure(actualValidatorMap.get(valKey).toString()));
			}
		}			

		reset();
		return result;
	}
	
	private PHATValidationResult relationalIntComp(String valKey,
			Object expVal, Object actVal, int conditionType2) throws Exception {
		
		PHATValidationResult result = new PHATValidationResult();
		result.setValidationKey(valKey);
		
		if (expVal instanceof String && 
				actVal instanceof String) {
			
			int expValInt = Integer.parseInt((String)expVal);
			int actValint = Integer.parseInt((String)actVal);

			if(conditionType == ResultValidatorConditionType.GREATER_THAN) {
				
				if (actValint > expValInt) {
					result.setValidationResult(Boolean.TRUE);
				} else {
					result.setValidationResult(Boolean.FALSE);
					result.setValidationMsg(getReasonOnFailure(actVal.toString() + 
							" is less than the expected val: "+ expVal.toString()));
				}
				
			} else if(conditionType == ResultValidatorConditionType.LESSER_THAN) {
				if (actValint < expValInt) {
					result.setValidationResult(Boolean.TRUE);
				} else {
					result.setValidationResult(Boolean.FALSE);
					result.setValidationMsg(getReasonOnFailure(actVal.toString() + 
							" is greater than the expected val: "+ expVal.toString()));
				}
			}
		}
		return result;
	}

	private PHATValidationResult stringContains(String valKey, Object expVal, Object actualVal){
		
		PHATValidationResult result = new PHATValidationResult();
		result.setValidationKey(valKey);
		if(expVal != null ){
			if(actualVal != null){
				if(actualVal.toString().contains(expVal.toString())){
					result.setValidationResult(Boolean.TRUE);
					//result.setValidationMsg(ResultEnum.SUCCESS.toString());
				}else{
					result.setValidationResult(Boolean.FALSE);
					result.setValidationMsg(ResultEnum.CONTAINS_FAILED.toString());
					result.setValidationMsg(getReasonOnFailure(actualVal.toString()));
				}				
			}else{
				result.setValidationResult(Boolean.FALSE);
				result.setValidationMsg(ResultEnum.CONTAINS_FAILED.toString());
				result.setValidationMsg(getReasonOnFailure(actualVal.toString()));			
			}			
		}else if(actualVal != null){
			result.setValidationResult(Boolean.FALSE);
			result.setValidationMsg(ResultEnum.CONTAINS_FAILED.toString());
			result.setValidationMsg(getReasonOnFailure(actualVal.toString()));
		}		
		return result;
	}
	
	/**
	 * @param valKey
	 * @param errMsg
	 * @return
	 */
	private PHATValidationResult generateFailureResult(String valKey, String errMsg){
		PHATValidationResult failureResult = new PHATValidationResult();
		failureResult.setValidationKey(valKey);
		failureResult.setValidationResult(Boolean.FALSE);
		failureResult.setValidationMsg("Failed : ");
		failureResult.setValidationMsg(ResultEnum.MISMATCH.toString());
		failureResult.setValidationMsg(" \n Reason : "+PHATMessageFormatter.getMessage(errMsg));
		return failureResult;
	}
	
	/**
	 * @param actualStr
	 * @return
	 */
	private String getReasonOnFailure(String actualStr){
		String reason = "";
		if(actualStr.contains("Reason :")){
			reason = actualStr.substring(actualStr.indexOf("Reason :"), actualStr.length());
		}
		reason= reason +" "+ getScreenShotLink();
		return reason;
	}
	
	/**
	 * @return
	 */
	private String getScreenShotLink() {
		StringBuilder screenShotLink = new StringBuilder();
		String scriptName = FileServer.getFileServer().getScriptName();
		String fileName = JMETER_LOG_DIR_FROM_REPORT+scriptName.substring(0,scriptName.indexOf("."))+"/";		
		
		screenShotLink.append(PHResponseDataConstants.HYPER_LINK_FIRST_OP_TAG);
		screenShotLink.append(fileName);
		screenShotLink.append(PHResponseDataConstants.HYPER_LINK_CL_TAG_WITH_SCREENSHOT);
		
		return screenShotLink.toString();
	}

	/**
	 * @param list
	 * @return
	 */
	private boolean verifyMapContainsListOfList(List<Object> list) {
		boolean isListOfList = Boolean.FALSE;
		for(Object validationObj : list){
			if(validationObj instanceof List){
				isListOfList = Boolean.TRUE;				
			}
			break;
		}
		return isListOfList;
	}

	/**
	 * @param valKey
	 * @param expVal
	 * @param actualVal
	 * @return
	 */
	private PHATValidationResult singleValidation(String valKey, Object expVal, Object actualVal, boolean isDirect) {
		PHATValidationResult result = new PHATValidationResult();
		result.setValidationKey(valKey);
		if(expVal != null ){
			if(actualVal != null){
				if(expVal.toString().equalsIgnoreCase(actualVal.toString())){
					if(conditionType == ResultValidatorConditionType.EQUAL){
						result.setValidationResult(Boolean.TRUE);
					}else if(conditionType == ResultValidatorConditionType.NOT_EQUAL){
						result.setValidationResult(Boolean.FALSE);
						result.setValidationMsg(ResultEnum.MATCH.toString());
						result.setValidationMsg(getReasonOnFailure(actualVal.toString()));
					}
					
					//if(isDirect){
					//	result.setValidationMsg(ResultEnum.SUCCESS.toString());
					//}					
				}else{
					if(conditionType == ResultValidatorConditionType.EQUAL){
						result.setValidationResult(Boolean.FALSE);
						result.setValidationMsg(ResultEnum.MISMATCH.toString());
						result.setValidationMsg(getReasonOnFailure(actualVal.toString()));
					}else if(conditionType == ResultValidatorConditionType.NOT_EQUAL){
						result.setValidationResult(Boolean.TRUE);
					}					
				}				
			}else{
				result.setValidationResult(Boolean.FALSE);
				if(!isDirect){
					result.setValidationMsg(ResultEnum.MISSING.toString());
				}				
			}			
		}else if(actualVal != null){
			result.setValidationResult(Boolean.FALSE);
			result.setValidationMsg(ResultEnum.EXCESS.toString());
		}		
		return result;
		
	}
	
	/**
	 * @param valKey
	 * @param expectedMap
	 * @param actualMap
	 * @return
	 */
	private PHATValidationResult multipleValidation(String valKey, Map<String, String> expectedMap, Map<String, String> actualMap) {
		
		PHATValidationResult result = new PHATValidationResult();		
		result.setValidationResult(Boolean.TRUE);
		StringBuilder missingStr = new StringBuilder();
		StringBuilder excessStr = new StringBuilder();
		
		for (Iterator<String> iterator = expectedMap.keySet().iterator(); iterator.hasNext();) {
			PHATValidationResult itrResult = new PHATValidationResult();
			String validationKey = iterator.next();
			if(expectedMap.get(validationKey) != null && expectedMap.get(validationKey) instanceof String) {
				itrResult = singleValidation(validationKey, expectedMap.get(validationKey), actualMap.get(validationKey), false);	
				if(!itrResult.isPassed()){
					result.setValidationResult(Boolean.FALSE);
					if(itrResult.getValidationMsg().contains(ResultEnum.MISSING.toString())){
						if(!missingStr.toString().isEmpty()){
							missingStr.append(COMMA_SEPERATOR);
						}
						missingStr.append(expectedMap.get(validationKey).toString());
					}else if(itrResult.getValidationMsg().contains(ResultEnum.EXCESS.toString())){
						if(!excessStr.toString().isEmpty()){
							excessStr.append(COMMA_SEPERATOR);
						}
						excessStr.append(actualMap.get(validationKey).toString());
					}
				}
			}
		}
		
		if(result.isPassed()){
			result.setValidationMsg(ResultEnum.SUCCESS.toString());
		}else{
			StringBuilder failureMsgStr = new StringBuilder();
			failureMsgStr.append(ResultEnum.FAILED.toString()+COLLON_SEPERATOR);
			if(!missingStr.toString().isEmpty()){
				failureMsgStr.append("Missing [ "+missingStr.toString()+" ] ");
			}
			if(!excessStr.toString().isEmpty()){
				failureMsgStr.append("Excess ["+excessStr.toString()+" ]");
			}	
			
			result.setValidationMsg(failureMsgStr.toString());
		}		
		return result;		
	}
	
	/**
	 * @param valKey
	 * @param expValList
	 * @param actualValList
	 * @return
	 */
	private PHATValidationResult listValidation(String valKey, List<String> expValList,
			List<String> actualValList) {
		PHATValidationResult result = new PHATValidationResult();
		result.setValidationKey(valKey);
		if(expValList != null && !expValList.isEmpty()){
			if(actualValList != null && (!actualValList.isEmpty() || conditionType == ResultValidatorConditionType.NOT_CONTAINS)){
					String missingStr = "";
					boolean isContains = Boolean.FALSE;
					if(conditionType == ResultValidatorConditionType.NOT_CONTAINS){
						isContains = compareListNotContainsList(expValList, actualValList);
						if(!isContains){
							result.setValidationResult(Boolean.TRUE);
						//	result.setValidationMsg(ResultEnum.SUCCESS.toString());
						}else{						
							result.setValidationResult(Boolean.FALSE);						
							result.setValidationMsg(" Should not contains - "+expValList);
						}
					}else{
						if(conditionType != ResultValidatorConditionType.INV_CONTAINS){
							missingStr = compareListsAndGetMissingStr(expValList, actualValList);
						}
						
						String excessStr = "";
						if(conditionType == ResultValidatorConditionType.EQUAL || conditionType == ResultValidatorConditionType.INV_CONTAINS){
							excessStr = compareListsAndGetMissingStr(actualValList, expValList);
						}
						if(missingStr.isEmpty() && excessStr.isEmpty()){
							result.setValidationResult(Boolean.TRUE);
							//result.setValidationMsg(ResultEnum.SUCCESS.toString());
						}else{						
							result.setValidationResult(Boolean.FALSE);						
							result.setValidationMsg(formFailureMessage(missingStr, excessStr));
						}		
					}				
										
			}else{
				result.setValidationResult(Boolean.FALSE);
				result.setValidationMsg(ResultEnum.ACT_EMPTY.toString());
			}			
		}else if(actualValList != null){
			result.setValidationResult(Boolean.FALSE);
			result.setValidationMsg(ResultEnum.EXP_EMPTY.toString());
		}		
		return result;
	}
	
	/**
	 * @param valKey
	 * @param expValList
	 * @param actualValList
	 * @return
	 */
	private PHATValidationResult listOfListValidation(String valKey, List<List<String>> expValList,
			List<List<String>> actualValList) {
		PHATValidationResult result = new PHATValidationResult();
		result.setValidationKey(valKey);
		if(expValList != null && !expValList.isEmpty()){
			if(actualValList != null && !actualValList.isEmpty()){
				boolean isContains = Boolean.FALSE;
				if(conditionType == ResultValidatorConditionType.NOT_CONTAINS){
					isContains = compareListOfListNotContainsListOfList(expValList, actualValList);
					if(!isContains){
						result.setValidationResult(Boolean.TRUE);
					//	result.setValidationMsg(ResultEnum.SUCCESS.toString());
					}else{						
						result.setValidationResult(Boolean.FALSE);						
						result.setValidationMsg(" Should not contains - "+expValList);
					}
				}else{
					String missingStr = compareListsOfListAndGetMissingStr(expValList, actualValList);
					String excessStr = "";
					if(conditionType == ResultValidatorConditionType.EQUAL){
						excessStr = compareListsOfListAndGetMissingStr(actualValList, expValList);
					}
					
					if(missingStr.isEmpty() && excessStr.isEmpty()){
						result.setValidationResult(Boolean.TRUE);
						//result.setValidationMsg(ResultEnum.SUCCESS.toString());
					}else{						
						result.setValidationResult(Boolean.FALSE);						
						result.setValidationMsg(formFailureMessage(missingStr, excessStr));
					}	
				}
			}else{
				result.setValidationResult(Boolean.FALSE);
				result.setValidationMsg(ResultEnum.ACT_EMPTY.toString());
			}			
		}else if(actualValList != null){
			result.setValidationResult(Boolean.FALSE);
			result.setValidationMsg(ResultEnum.EXP_EMPTY.toString());
		}		
		return result;
	}
	
	/**
	 * @param missingStr
	 * @param excessStr
	 * @return
	 */
	private String formFailureMessage(String missingStr, String excessStr){
		StringBuilder failureMsgStr = new StringBuilder();
		failureMsgStr.append(ResultEnum.FAILED.toString()+COLLON_SEPERATOR);
		if(!missingStr.toString().isEmpty()){
			failureMsgStr.append("Missing [ "+missingStr.toString()+" ] ");
		}
		if(!excessStr.toString().isEmpty()){
			failureMsgStr.append("Excess ["+excessStr.toString()+" ]");
		}	
		return failureMsgStr.toString();
	}
	
	 /**
	 * @param list1
	 * @param list2
	 * @return
	 */
	private String compareListsAndGetMissingStr(List<String> list1, List<String> list2){
		 StringBuilder missingStr = new StringBuilder();
			for(String expValue : list1){
				if(!list2.contains(expValue.trim())){
					if(!missingStr.toString().isEmpty()){
						missingStr.append(COMMA_SEPERATOR);
					}
					missingStr.append(expValue);
				}
			}
			
			return missingStr.toString();
	 }
	 
	 /**
	 * @param list1
	 * @param list2
	 * @return
	 */
	private String compareListsOfListAndGetMissingStr(List<List<String>> list1, List<List<String>> list2){
		 StringBuilder missingStr = new StringBuilder();		 
			for(List<String> expValue : list1){
				boolean isContains = Boolean.FALSE;
				for(List<String> actValue : list2){					
					if(actValue.toString().equalsIgnoreCase(expValue.toString())){
						isContains = Boolean.TRUE;
						break;
					}
				}
				if(!isContains){
					if(!missingStr.toString().isEmpty()){
						missingStr.append(COMMA_SEPERATOR);
					}
					missingStr.append(expValue.toString());
				}
			}			
			return missingStr.toString();
	 }
	
	private boolean compareListNotContainsList(List<String> list1, List<String> list2){
		 boolean isContains = Boolean.FALSE;
			for(String expValue : list1){
				if(list2.contains(expValue.trim())){
					isContains = Boolean.TRUE;
				}
			}
			
			return isContains;
	 }
	
	private boolean compareListOfListNotContainsListOfList(List<List<String>> list1, List<List<String>> list2){
		boolean isContains = Boolean.FALSE;
		for(List<String> expValue : list1){
			
			for(List<String> actValue : list2){					
				if(actValue.toString().equalsIgnoreCase(expValue.toString())){
					isContains = Boolean.TRUE;
					break;
				}
			}
		}
			
			return isContains;
	 }
	
	/**
	 * @param result
	 */
	private void printPHATResultMsg(PHATValidationResult result){
		System.out.println("Expected Map : "+expValidatorMap.get(result.validationKey));
		System.out.println("Actual Map : "+actualValidatorMap.get(result.validationKey));
		System.out.println("Validation Result : "+result.getValidationMsg());
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PHATResultValidator phatResVal = new PHATResultValidator(ResultValidatorConditionType.EQUAL);
		
		phatResVal.addToValidator("CountCheck", "5", "4");
		
		phatResVal.addExpToValidator("CountCheck2", "5");
		
		phatResVal.addToValidator("Properties", new ArrayList<String>(Arrays.asList("2","4","6","8","12")), new ArrayList<String>(Arrays.asList("2","4","6","8","12")));
		
		phatResVal.addToValidator("Properties2", new ArrayList<String>(Arrays.asList("5","10","12","15","22")), new ArrayList<String>(Arrays.asList("5","16","17","15","22")));
		
		Map<String, String> expMap = new HashMap<String, String>();
		expMap.put("DLA Status","Normal");
		expMap.put("Model Name","DLPP");
		expMap.put("OUI","F45FD4");
		
		Map<String, String> actMap = new HashMap<String, String>();
		actMap.put("DLA Status","Normal");
		actMap.put("Model Name","DLPP");
		actMap.put("OUI","F45FD4");
		
		phatResVal.addToValidator("Properties List", expMap, actMap);
		
		phatResVal.validate();

	}

}
