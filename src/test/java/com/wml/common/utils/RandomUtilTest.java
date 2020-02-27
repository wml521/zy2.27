package com.wml.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;


public class RandomUtilTest {

	@Test
	public void testRandom() {
		int i = RandomUtil.random(0, 3);
		System.out.println(i);
	}

	@Test
	public void testSubRandom() {
		int[] array = RandomUtil.subRandom(1, 10, 3);
		for (int i : array) {
			System.out.println(i);
		}
	}

	@Test
	public void testRandomCharacter() {
		char c = RandomUtil.randomCharacter();
		System.out.println(c);
	}

	@Test
	public void testRandomString() {
		String str = RandomUtil.randomString(4);
		System.out.println(str);
	}

}
