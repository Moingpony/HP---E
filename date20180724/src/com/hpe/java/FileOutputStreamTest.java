package com.hpe.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.Test;

public class FileOutputStreamTest {
	
	@Test
	public void test1()
	{
		//向hello1.txt中写入abc
		
		
		//FileOutputStream  输出流/字节流/节点流
		FileOutputStream fos = null;
		try {
			File file = new File("hello.txt");
			
			 fos = new FileOutputStream(file);
			
			String str = "abc";
			
			byte[] bytes = str.getBytes();
			
			fos.write(bytes);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if (fos!=null) {
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	}

	@Test
	public void test2()
	{
		//向hello1.txt中写入abc
		
		
		//FileOutputStream  输出流/字节流/节点流
		FileOutputStream fos = null;
		try {
		
			
			 fos = new FileOutputStream("a.txt",true);//true,追加
			
			String str = "abc";
			
			byte[] bytes = str.getBytes();
			
			fos.write(bytes);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if (fos!=null) {
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	}


}
