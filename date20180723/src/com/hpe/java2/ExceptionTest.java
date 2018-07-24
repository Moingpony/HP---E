package com.hpe.java2;

import java.util.Scanner;

import org.junit.Test;

public class ExceptionTest {
	
	@Test
	public void test()
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		try {
			System.out.println(a/b);
			
		} catch (Exception e) {
			System.out.println("b不能为0");
		}
		
		
	}
}
