package com.hpe.java;

import java.util.Scanner;

import org.junit.Test;

public class ExceptionTest2 {

	@Test
	public void test1()
	{
		System.out.println(10/0);
	}
	
	@Test
	public void test2()
	{
		test1();
	}
	
	@Test
	public void test3()
	{
		test2();
	}
	
	@Test
	public void test4()
	{
		Scanner sc = new Scanner(System.in);
		int c = 0;
		try {
			System.out.println("请输入被除数:");
			 
			int a = sc.nextInt();
			
			
			System.out.println("请输入除数:");
			 
			int b = sc.nextInt();
			
			c = a/b;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			
		}
		
	}
	
	
	
}
