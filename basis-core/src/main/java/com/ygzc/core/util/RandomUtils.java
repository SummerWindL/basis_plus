package com.ygzc.core.util;

import java.util.Random;

/**
 * @author yanl.fu
 *
 */
public class RandomUtils {

	/**
	 * 短信校验码随机数
	 */
	public static String generateNum() {
		String num = "";  
	    for (int i = 0 ; i < 6 ; i ++) {  
	        num = num + String.valueOf((int) Math.floor(Math.random() * 9 + 1));  
	    }  
	    return num;
	}
}
