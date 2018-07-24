package com.hpe.java;

import java.sql.Date;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test2();
	}
	public static void test1()
	{
		//数组声明:格式:类型 数组名[] 或者 []数组名
		int a[];
		int[] b;
		
		Date[] c;
		
	}
	public static void test2()
	{
		//动态初始化-->在初始化时只指定数组的长度(数组中元素个数)
		//由系统来分配初始值
		int[] a = new int[5];
		
		System.err.println(a.toString());
		
		//获取数组的长度(数组中元素的个数) length属性
		System.out.println(a.length);//5
		//使用数组名[下标]得到指定位置的元素,下标的取值范围:0-数组长度-1-->0-数组名.length-1
		int a0 = a[0];
		
		System.out.println(a0);//0
		System.out.println(a[4]);
		
		
	}
}

