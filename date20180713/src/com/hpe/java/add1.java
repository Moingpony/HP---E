package com.hpe.java;

import java.util.Scanner;

import org.junit.Test;

public class add1 {
	
	
	@Test
	public void test()
	{
		Scanner sc = new Scanner(System.in);
		double double1 = sc.nextDouble();
		sc.nextLine();
		double double2 = sc.nextDouble();
		sc.nextLine();
		double double3 = sc.nextDouble();
		add(double1, double2, double3);
		
	}
	public void add(double a,double b,double c){
		double d = a+b+c;
		System.out.println(d);
	}

}
