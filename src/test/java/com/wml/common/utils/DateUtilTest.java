package com.wml.common.utils;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;




import org.junit.Test;

/** 
 * @author by WangMaoLin
 * @version 2020年2月28日 下午3:58:37 
 * 
 */

public class DateUtilTest {

	@Test
	public void testGetEndMonth() {
		Date date = DateUtil.getEndMonth(new Date());
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(simpleDateFormat.format(date));
	}

	@Test
	public void testGetInitMonth() {
		Date date = DateUtil.getInitMonth(new Date());
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(simpleDateFormat.format(date));
	}

	@Test
	public void testRandomDate() {
		Calendar c = Calendar.getInstance();
		c.set(2010, 0, 1);
		Date date = DateUtil.randomDate(c.getTime(), new Date());
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(simpleDateFormat.format(date));
	}

	@Test
	public void testGetAgeByBirthday() {
		Calendar c = Calendar.getInstance();
		c.set(2000, 0, 1);
		int i = DateUtil.getAgeByBirthday(c.getTime());
		System.out.println("年龄是"+i);
	}

}
