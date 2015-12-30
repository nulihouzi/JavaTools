package com.eclipse.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 时间转换小工具<br>
 * <p>使用场景：
 * <p>做数据迁移时，原库中时间字段以long型存储（GMT时间格式的秒数），新库中需保存date类型数据。
 * 
 * @author Miracle
 */
public class TimeConverter {
	private static SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	public static void main(String[] args) throws ParseException {
		// Note: 定义long型对象时，如果对象值超出了int类型的取值范围，需在数字后增加L或l以规避编译期错误
		long seconds = 1451047608028L;
		convert(seconds);
		
		Date date = formatter.parse("2015-10-9 10:56:00");
		convert(date);
	}
	
	/**
	 * 转换时间数据
	 * 
	 * @param seconds GMT时间格式的秒数
	 * @return Date对象
	 */
	private static Date convert(long seconds) {
		long milliseconds = seconds * 1000;
		Date date = new Date(milliseconds);
		System.out.println("转换后的时间为：" + formatter.format(date));
		
		return date;
	}
	
	/**
	 * 转换时间数据
	 * 
	 * @param date Date对象
	 * @return GMT时间格式的毫秒数
	 */
	private static long convert(Date date) {
		if (date == null) {
			return 0l;
		}
		
		return date.getTime();
	}
}