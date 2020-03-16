package com.wml.common.utils;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.junit.Test;

/** 
 * @author by WangMaoLin
 * @version 2020年3月1日 上午9:33:53 
 * 
 */

public class StreamUtilTest {

	@Test
	public void testReadInputStream() throws IOException {
		List<String> list = StreamUtil.read(new File("d:\\data.txt"));
		for (String string : list) {
			System.out.println(string);
		}
	}

	@Test
	public void testReadString() {
		
	}

	@Test
	public void testReadFile() {
		
	}

}
