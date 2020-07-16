package com.jilegeji.springbootlearning.common;

import java.io.File;
import java.io.IOException;

public class Demo_File {

	public static void main(String[] args) throws IOException {
		/*File file1 = new File("test.txt");
		System.out.println(file1.exists());*/
		
		/*String parent = "C:\\Data\\Eclipse Mars\\workspace\\default\\test";
		String child = "test.txt";
		File file2 = new File(parent,child);
		System.out.println(file2.exists());*/
		
		
		
		File parentFile = new File("C:\\Data\\Eclipse Mars\\workspace\\default\\test");
			new File(parentFile,"yyz").mkdirs();
		File source = new File(parentFile,"yyz\\yyz.txt");
		source.createNewFile();
		//System.out.println(source.renameTo(new File(parentFile,"jilegeji\\jilegeji.txt")));
	}

}
