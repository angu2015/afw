/**
 * 
 */
package com.sanity.utils;

/**
 * @author anponnus
 *
 */
public class PHATValidationHolder {

	/**
	 * 
	 */
	private String valName;
	private String validationDesc;
	private String expectedResult;
	private String actualResult;
	private String validationResult;
	private String snapShotLink;
	
	/**
	 * @return the validationDesc
	 */
	public String getValidationDesc() {
		return validationDesc;
	}

	/**
	 * @param validationDesc the validationDesc to set
	 */
	public void setValidationDesc(String validationDesc) {
		this.validationDesc = validationDesc;
	}

	/**
	 * @return the expectedResult
	 */
	public String getExpectedResult() {
		return expectedResult;
	}

	/**
	 * @param expectedResult the expectedResult to set
	 */
	public void setExpectedResult(String expectedResult) {
		this.expectedResult = expectedResult;
	}

	/**
	 * @return the actualResult
	 */
	public String getActualResult() {
		return actualResult;
	}

	/**
	 * @param actualResult the actualResult to set
	 */
	public void setActualResult(String actualResult) {
		this.actualResult = actualResult;
	}

	/**
	 * @return the validationResult
	 */
	public String getValidationResult() {
		return validationResult;
	}

	/**
	 * @param validationResult the validationResult to set
	 */
	public void setValidationResult(String validationResult) {
		this.validationResult = validationResult;
	}

	/**
	 * @return the snapShotLink
	 */
	public String getSnapShotLink() {
		return snapShotLink;
	}

	/**
	 * @param snapShotLink the snapShotLink to set
	 */
	public void setSnapShotLink(String snapShotLink) {
		this.snapShotLink = snapShotLink;
	}

	/**
	 * @return the valName
	 */
	public String getValName() {
		return valName;
	}

	/**
	 * @param valName the valName to set
	 */
	public void setValName(String valName, int valNumber) {
		this.valName = valName+" - "+valNumber;
	}

	public PHATValidationHolder() {
		// TODO Auto-generated constructor stub
	}
	
	public String getPHATValidationHolderAsXML(){
		
		StringBuilder valXML = new StringBuilder();
		valXML.append(PHResponseDataConstants.VALIDATION_OP_TAG);
		
		valXML.append(PHResponseDataConstants.VAL_NAME_OP_TAG);
		valXML.append(this.getValName());
		valXML.append(PHResponseDataConstants.VAL_NAME_CL_TAG);
		
		valXML.append(PHResponseDataConstants.VAL_DESC_OP_TAG);
		valXML.append(this.getValidationDesc());
		valXML.append(PHResponseDataConstants.VAL_DESC_CL_TAG);
		
		valXML.append(PHResponseDataConstants.VAL_EXP_RES_OP_TAG);
		valXML.append(this.getExpectedResult());
		valXML.append(PHResponseDataConstants.VAL_EXP_RES_CL_TAG);
		
		valXML.append(PHResponseDataConstants.VAL_ACT_RES_OP_TAG);
		valXML.append(this.getActualResult());
		valXML.append(PHResponseDataConstants.VAL_ACT_RES_CL_TAG);
		
		valXML.append(PHResponseDataConstants.VAL_RES_OP_TAG);
		valXML.append(this.getValidationResult());
		valXML.append(PHResponseDataConstants.VAL_RES_CL_TAG);
		
		valXML.append(PHResponseDataConstants.VALIDATION_CL_TAG);
		
		return valXML.toString();
	}

}
