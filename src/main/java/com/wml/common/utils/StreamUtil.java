package com.wml.common.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/** 
 * @author by WangMaoLin
 * @version 2020年3月1日 上午9:24:58 
 * 
 */

public class StreamUtil {
	//读取InputStream放入集合
	public static List<String> read(InputStream InputStream) throws IOException{
		ArrayList<String> list = new ArrayList<String>();
		BufferedReader reader = new BufferedReader(new InputStreamReader(InputStream));
		String line = "";
		while((line=reader.readLine())!=null){
			list.add(line);
		}
		return list;
	}
	//根据文件地址读取文件放入集合
	public static List<String> read(String filePath) throws IOException{
		FileInputStream fileInputStream = new FileInputStream(filePath);
		return read(fileInputStream);
	}
	//读取文件内容放入集合
	public static List<String> read(File file) throws IOException{
		FileInputStream fileInputStream = new FileInputStream(file);
		return read(fileInputStream);
	}
}
