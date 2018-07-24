package com.hpe.java;

import org.junit.Test;

public class IntegerTest {
	
	@Test
	public void test1()
	{
		//八种基本数据类型对应的其引用类（包装类、封装类）
		
		//byte short int long float double char boolean
		//Byte Short Intefer Long FLoat Double Characten Boolean
		
		int a=1;
		
		Integer b = new Integer(2);
		
		System.out.println(b);
		
		b=a;//基本数据类型转换给他所对应的包装类型（自动的装箱）Integer.valueOF(a);
		
		Integer c = new Integer(3);
		int d = c;//将包装类型转换为其所对应的基本数据类型（自动的拆箱）c.intValue;
		
		Person p = new Person();
		
		p.equals(1);//自动装箱
		p.equals(Integer.valueOf(1));
		
		
		
	}
	
	@Test
	public void test2()
	{
		//如何将一个String的数值转换为Int类型的数据
		
		String str = "1";
		
		int a = Integer.parseInt(str);
		
			
	}

	
	@Test
	public void test3()
	{
		//如何将一个int的数值转换为其所对应的字符串
		
		
		int a = 1;
		//1.使用String中的toString（...）方法
		
		String str1 = String.valueOf(a);
		
		//2.使用其包装类的toString方法
		
		String str2 = Integer.toString(1);
		
		//3.字符串拼接
		
		String str3 = a+"";
//		String str4 =Integer.valueOf(a).toString()+"";
		
		
		
		
		
	}
	
}
