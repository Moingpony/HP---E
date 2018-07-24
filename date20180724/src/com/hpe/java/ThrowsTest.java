package com.hpe.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

public class ThrowsTest {

	@Test
	
	public void test1()
	{
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("111.txt");
	
		
		int a;
		try {
			while ((a=fis.read())!=-1) {
				System.out.println((char)a);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if (fis!=null) {
					fis.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	
	} 
	//thows抛出异常:在方法后写
	
	public void test2() throws IOException
	{
		FileInputStream fis = new FileInputStream("111.txt");
		int a;
		while ((a=fis.read())!=-1) {
			System.out.println((char)a);
		}
		
	}
	public void test3() throws IOException
	{
		test2();
	}
	public void test4() throws IOException
	{
		test3();
	}
	

}
