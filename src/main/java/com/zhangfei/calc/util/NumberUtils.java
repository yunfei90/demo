/**
 * 
 */
package com.zhangfei.calc.util;

/**
 * @author zhangyunfei
 *
 */
public class NumberUtils {

	
	/**
	 * double 转换为字符串
	 * @param number
	 * @return
	 */
	public static String double2String(Double number) {
		
		if (number == null) return null;
		
		String str = number.toString();
		
		if (str.endsWith(".0")) {
			return str.substring(0, str.length() - 2);
		} else {
			return str;
		}
		
		
	}
	
}
