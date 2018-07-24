package com.hpe.java;

import org.junit.Test;

public class ObjectTest {
	
	
/*	Object类的特点：
	1.Object类没有父类，所有类都是Object的子类
	2.所有类都继承了Object类的方法，比如toString()*/
	@Test
	public void test()
	{
		//Object类是所有类的父类，不是直接继承就是间接继承
		//所有类都继承了Object方法
		Person p1 = new Person();
		
		//toString  如果不重写，调用的就是object类的toString
		
		System.out.println(p1);//com.hpe.java.Person@1698c449
//		System.out.println(p1.toString());
		
		
		String str = new String("str");
		//String类已经重写了Object的toString()方法
		System.out.println(str);
		
	}
	
	
	@Test
	public void test2()
	{
		String str1 = new String("123");
		String str2 = new String("123");
		
		System.out.println(str1.equals(str2));
		
		Person p1 = new Person();
		Person p2 = new Person();
		
		System.out.println(p1.equals(p2));
		
//		System.out.println(1.equals(1));
		
		
		//==既可以比较基本及数据类型，也可以比较引用数据类型
		//比较基本类型时比较数值是否一致
//		比较引用数据类型时比较的是地址值是否一致
		
		
		//equals只能比较引用数据类型，比较的是地址值是否一致,但有些类会重写Object的equals用于比较内容是否一致，比如String
		int a =1;
		int b = 1;
		System.out.println(a==b);
		System.out.println(p1==p2);
	}
	
}
