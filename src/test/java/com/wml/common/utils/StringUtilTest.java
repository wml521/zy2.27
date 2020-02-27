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

}
