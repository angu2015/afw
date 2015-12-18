package com.automation.framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.MissingResourceException;
import java.util.Properties;

public class ResourceObjects {

	public static Properties props = new Properties();

	/*	static {
		try {
			InputStream is = new FileInputStream(new File("C:/Users/karukaru.PARTNERS/Desktop/Regression/xpaths.properties"));
			props.load(is);

			props.list(System.out);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}*/

	public static boolean initialize(String filePath) {
		boolean success = false;

		try {
			InputStream is = new FileInputStream(new File(filePath));
			props.load(is);
			success = true;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return success;
	}

	public static String getObjectValue(String key, String xpathInput) {
		String retValue = '!' + key + '!';
		try {
			retValue = props.getProperty(key);
			if(xpathInput != null) {
				System.out.println("XPATH Inputs : " + xpathInput);
				Object[] additionalInfo = xpathInput.split(",");
				retValue = String.format(retValue, additionalInfo);
				/*if(additionalInfo.length == 1) {
					retValue = String.format(retValue, additionalInfo[0]);
				} else if(additionalInfo.length == 2) {
					retValue =  String.format(retValue, additionalInfo[0], additionalInfo[1]);
				} else if(additionalInfo.length == 3) {
					retValue =  String.format(retValue, additionalInfo[0], additionalInfo[1], additionalInfo[2]);
				}*/
			}
		} catch (MissingResourceException e) {
			//return '!' + key + '!';
		}
		System.out.println(retValue);
		return retValue;
	}

	public static String getObjectValue(String key) {
		String retValue = '!' + key + '!';
		try {
			retValue = props.getProperty(key);
		} catch (MissingResourceException e) {
			//return '!' + key + '!';
		}
		System.out.println(retValue);
		return retValue;
	}
}
