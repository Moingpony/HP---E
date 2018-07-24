package com.hpe.java;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.junit.Test;

public class ExceptionTest {
	
	//捕获异常:1.try-catch-finally  2.向上抛出,使用throws
	//try-catch-finally
	//try-->可能会出现异常的代码
	//catch-->处理异常的代码
	//finally-->必然会执行代码
	

	@Test
	public void test1()
	{
		int a = 10;
		int b = 0;
		
		try {
			int c = a/b; //jvm创建了异常类的对象(ArithmeticException类的对象) 
			System.out.println(2);//不打印
		
		} catch (Exception e) {
			//e==ArithmeticException;接收对象,多态
			
			System.out.println(1);//打印
		}
		System.out.println(3);//打印
		
	}
	
	@Test
	public void test2()
	{
		Scanner sc = new Scanner(System.in);
		int c = 0;
		try {
			System.out.println("请输入被除数:");
			 
			int a = sc.nextInt();
			
			
			System.out.println("请输入除数:");
			 
			int b = sc.nextInt();
			
			c = a/b;
			
			
		} catch (InputMismatchException e) {
			System.out.println("输入不匹配");
		}
		catch (ArithmeticException e) {
			System.out.println("除数不能为0");
		}
		System.out.println(c);
	
	}
}
