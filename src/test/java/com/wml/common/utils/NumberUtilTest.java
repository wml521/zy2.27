package com.wml.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;

/** 
 * @author by WangMaoLin
 * @version 2020年3月9日 上午10:10:55 
 * 
 */

public class NumberUtilTest {

	@Test
	public void test() {
		int percent = NumberUtil.getPercent(55, 68);
		System.out.println(percent);
	}

}
