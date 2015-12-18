/**
 * 
 */
package com.sanity.utils;

import java.text.MessageFormat;
import java.util.MissingResourceException;

import org.apache.jmeter.util.JMeterUtils;

/**
 * Jmeter will loads the Message Resource bundle.
 * Reading the Message property with key via JMeter Utils library.
 * This wrapper class will format/replace the given list of parameters with the corresponding message value.
 * @author anponnus
 *
 */
public class PHATMessageFormatter {
		
	public static String getMessage(String key) {
        try {
            return JMeterUtils.getProperty(key);
        } catch (MissingResourceException e) {
            return '!' + key + '!';
        }
    }
    public static String getMessage(String key, Object... params  ) {
        try {
            return MessageFormat.format(JMeterUtils.getProperty(key), params);
        } catch (MissingResourceException e) {
            return '!' + key + '!';
        }
    }

}
