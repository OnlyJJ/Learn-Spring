package com.xy.learn.common.utils;


public class UserIdUtil {
	
	/**
	 * 生成用户id
	 * @return
	 */
	public static String genUserId() {
		long time = System.currentTimeMillis();
		String timeStr = String.valueOf(time);
		return timeStr.substring(timeStr.length()-6, timeStr.length());
	}
	
}
