package com.hpe.java;

public class ArrayTest {

	public static void main(String[] args) {
//		test1();
//		test2();
//		test3();
		test4();
		
		
	}
	//问题
	public static void test1()
	{
		int[] a = new int[5];
		
		//如何取到数组中第一个元素
		
		System.out.println(a[0]);
		
		System.out.println(a[a.length-1]);
		
		int[] b = new int[6];
		
		//==,可以比较基本数据类型,也可以比较引用数据类型
		//比较基本数值类型时比较的是数值是否相等,比较引用数据类型时比较的是地址值
		
		System.err.println(a==b);//false
		System.out.println(a[0]==b[0]);//true
		
		b = a;
		System.out.println(a == b);//true
		
		b[0] = 1;
		
	}
	public static void test2()
	{
		//静态初始化:初始化的时候,指定数组中元素的值,由系统决定数组的长度
		
		
		int[] a = new int[]{1,2,3};//静态初始化
		
		//简写
		
		int[] b = {1,2,3};//静态初始化的简写(使用较多)
		
		int[] c;
		c = new int[3];
		
		int[] d;
		d = new int[]{1,2,3};
		
		
	}
	public static void test3()
	{
		//1
		int[] a = {1,2,3};
		int[] b = {1,2,3};
		
		System.out.println(a==b);
		
		//2
		int[] c = new int[3];
		c = new int[4];
		
		System.out.println(c[3]);
		
		//3
		/*int[] d = new int[4];
		d = new String[5];*/
		
		//4
		/*
		int[] e = new int[3];
		a[1] = 1.0;*/
		
		
	}
	//常见异常:数组下标越界:ArrayIndexOutOfBoundException/空指针异常:NullPointerException
	public static void test4()
	{	
		//默认初始化
		//byte short int long --- 0
		//float double --- 0.0
		//boolean --- false
		//char --- 空格
		//引用: null
		
		/*int[] a = null;
		
		System.out.println(a.length);*/ //null.length
		
		//三层架构
		
		boolean[] bb = new boolean[4];
		System.out.println(bb[1]);
		
		String[] b = new String[3];
		System.out.println(b[1]);
		b[1].trim();
		
	}
	
}
