package com.wml.common.utils;

import java.util.Calendar;
import java.util.Date;

/** 
 * @author by WangMaoLin
 * @version 2020年2月28日 下午3:51:02 
 * 
 */

public class DateUtil {
	//返回指定月份的月末日期比如 2020-02-28 , 返回 2020-02-29 23:59:59
	public static Date getEndMonth(Date date){
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.add(Calendar.MONTH, 1);
		Date initMonth = getInitMonth(c.getTime());
		c.setTime(initMonth);
		c.add(Calendar.SECOND, -1);
		return c.getTime();
	}
	//返回指定日期的月初，比如 2020-02-28 , 返回 2020-02-01 00:00:00
	public static Date getInitMonth(Date date){
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		
		c.set(Calendar.DAY_OF_MONTH, 1);
		c.set(Calendar.HOUR_OF_DAY, 0);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		
		return c.getTime();
	}
	//在 min 和max之间的随机日期
	public static Date randomDate(Date min,Date max){
		long t1 = min.getTime();
		long t2 = max.getTime();
		if (t1>t2) {
			return null;
		}
		double d = Math.random();
		long x = (long) (d * (t2 - t1 + 1)+t1);
		return new Date(x);
	}
	//根据出生日期算年龄
	public static int getAgeByBirthday(Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		int y1 = c.get(Calendar.YEAR);
		c.setTime(new Date());
		int y2 = c.get(Calendar.YEAR);
		return y2-y1;
	}
}
