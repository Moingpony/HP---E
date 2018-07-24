package com.hpe.java;

import java.io.FileInputStream;
import java.util.Date;
import java.util.Scanner;

import org.junit.Test;

public class CommenEception {
	
	@Test
	public void test1()
	{
		
		int a = 10;
		int b = 0;
		System.out.println(a/b);  //算数异常   java.lang.ArithmeticExcetion
		
		
		
	}
	
	@Test
	public void test2()
	{
		int[] arr = new int[3];
		System.out.println(arr[3]);//数组下标越界异常  java.lang.ArrayIndexOutOfBoundsException
	}
	
	@Test
	public void test3()
	{
		/*String str = null;
		
		str.trim();*/
		
		String[] arr = new String[5];
		System.out.println(arr[0].trim());//空指针异常  java.lang.NullPointerException
		
	}
	
	@Test
	public void test4()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("输入一个数字:");
		
		int num = sc.nextInt();
		
		System.out.println(num);//java.util.InputMissmatchException
		
	}
	
	@Test
	public void test5()
	{
		Object obj = "11";//多态
		
		Date date = (Date) obj;//类型转换异常 java.lang.ClassCastException
		
		
	}
	
	@Test
	public void test6()
	{
		//io
		//FileInputStream
		try {
			FileInputStream fis = new FileInputStream("111.txt");
		} catch (Exception e) {
			// TODO: handle exception
		}
	
		
		
		
	}
	
}
