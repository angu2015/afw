/**
 * 
 */
package com.sanity.utils;

/**
 * @author anponnus
 *
 */
public class PHATValidationResult {
		
	boolean validationResult = Boolean.FALSE;
	String validationKey = null;
	public static enum ResultEnum {
		SUCCESS (0, "Success"), FAILED(1, "Failed"), MISSING (2, "Missing"), EXCESS(3, "Excess"), MISMATCH(4, "Not MATCHED"), COUNT_MISMATCH(5, "Count Mis-Match"),
		EXP_EMPTY (6, "Expected value is empty"), ACT_EMPTY (6, "Actual value is empty"), CONTAINS_FAILED (7, "Actual Value List does not contains the Expected Value."), 
		NOT_CONTAINS_FAILED (8, "Expected Value should not present in the Actual Value List"),MATCH(9, "MATCHED");
		private final int index;
		private final String resultMsg;
		
		ResultEnum(int index, String resultMsg){
			this.index = index;
			this.resultMsg = resultMsg;
		}
		
		public String toString(){
			return resultMsg;			
		}
	}
	StringBuilder validationMsg = new StringBuilder();
	

	/**
	 * 
	 */
	public PHATValidationResult() {
		// TODO Auto-generated constructor stub
	}


	/**
	 * @return the validationResult
	 */
	public boolean isPassed() {
		return validationResult;
	}


	/**
	 * @param validationResult the validationResult to set
	 */
	public void setValidationResult(boolean validationResult) {
		this.validationResult = validationResult;
		if(validationResult){
			this.setValidationMsg(ResultEnum.SUCCESS.toString());
		}else{
			this.setValidationMsg(ResultEnum.FAILED.toString()+" : ");
		}
	}


	/**
	 * @return the validationKey
	 */
	public String getValidationKey() {
		return validationKey;
	}


	/**
	 * @param validationKey the validationKey to set
	 */
	public void setValidationKey(String validationKey) {
		this.validationKey = validationKey;
	}


	/**
	 * @return the validationMsg
	 */
	public String getValidationMsg() {
		return validationMsg.toString();
	}


	/**
	 * @param validationMsg the validationMsg to set
	 */
	public void setValidationMsg(String validationMsg) {
		if(!this.validationMsg.toString().isEmpty()){
			this.validationMsg.append(" ");
		}
		this.validationMsg.append(validationMsg);
	}

}
