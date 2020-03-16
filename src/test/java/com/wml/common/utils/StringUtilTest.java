package com.wml.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 * @ClassName: StringUtilTest 
 * @Description: 字符串工具类
 * @author: 86157
 * @date: 2020年2月27日 下午2:51:11
 */

public class StringUtilTest {

	@Test
	public void testHasLength() {
		boolean flag = StringUtil.hasLength(" ");
		System.out.println(flag);
	}

	@Test
	public void testHasText() {
		boolean flag = StringUtil.hasText(" a ");
		System.out.println(flag);
	}

	@Test
	public void testRandomChineseString() {
		String str = StringUtil.randomChineseString();
		System.out.println(str);
	}

	@Test
	public void testGenerateChineseName() {
		String str = StringUtil.generateChineseName();
		System.out.println(str);
	}
	
	@Test
	public void testGetValue() {
		String value = StringUtil.getValue("八维教育学院", 4);
		System.out.println(value);
	}
	
	@Test
	public void testISNumber(){
		boolean number = StringUtil.isNumber("1212.1");
		System.out.println(number);
	}
	
	@Test
	public void testISPhone(){
		boolean number = StringUtil.isPhone("134564124351");
		System.out.println(number);
	}
	
	@Test
	public void testISEmail(){
		boolean number = StringUtil.isEmail("1047883374@qq.com");
		System.out.println(number);
	}
}
