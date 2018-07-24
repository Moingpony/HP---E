package com.hpe.java;

public class OverLoadTest {
	//方法的重载：OverLoad
	//前提：在同一个类中，
	//允许出现多个同名的方法，但是方法参数的个数或者参数的类型不一致
	//与返回值无关
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double ad = add(1,1);
		int ad1 = add(1,2);
		System.out.println(ad1);

	}
	//两个int求和，并返回结果
	public static int add(int a,int b)
	{
		return a+b;
		
	}
	
	//两个double数求和，并返回结果
	
	public static double add(double a,double b)
	{
		return a+b;
	}
	
	

}
