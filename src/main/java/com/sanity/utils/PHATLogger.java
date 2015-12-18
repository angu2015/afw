/**
 * 
 */
package com.sanity.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 * @author anponnus
 *
 */
public class PHATLogger {

	/**
	 * Logger for different log level
	 */
	
	private StringBuilder infoLog = new StringBuilder();
	private StringBuilder debugLog = new StringBuilder();
	private StringBuilder warnLog = new StringBuilder();
	private StringBuilder errLog = new StringBuilder();
	
	
	public PHATLogger() {
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * @return the infoLog
	 */
	public StringBuilder getInfoLog() {
		return infoLog;
	}


	/**
	 * @param infoLog the infoLog to set
	 */
	public void setInfoLog(String infoLog) {
		this.infoLog.append(infoLog);
		this.infoLog.append("\n");
	}


	/**
	 * @return the debugLog
	 */
	public String getDebugLog() {
		return debugLog.toString();
	}


	/**
	 * @param debugLog the debugLog to set
	 */
	public void setDebugLog(String debugLog) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss").withLocale(Locale.US);
		this.debugLog.append(LocalDateTime.now().format(formatter));
		this.debugLog.append(" ");
		this.debugLog.append(debugLog);
		this.debugLog.append("\n");
	}


	/**
	 * @return the warnLog
	 */
	public StringBuilder getWarnLog() {
		return warnLog;
	}


	/**
	 * @param warnLog the warnLog to set
	 */
	public void setWarnLog(String warnLog) {
		this.warnLog.append(warnLog);
		this.warnLog.append("\n");
	}


	/**
	 * @return the errLog
	 */
	public StringBuilder getErrLog() {
		return errLog;
	}


	/**
	 * @param errLog the errLog to set
	 */
	public void setErrLog(String errLog) {
		this.errLog.append(errLog);
		this.errLog.append("\n");
	}


}
