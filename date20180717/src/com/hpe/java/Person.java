package com.hpe.java;

//多态:同一种事物的多种表现形态

//java中多态性主要体现在以下两个方面

//1.方法的重载和方法的重写

//2.对象的多态性

public class Person {
	
	private int age;  //非静态变量、非static变量、实例变量
	
	//static关键字，修饰符
	//1.属性 2.方法 3.类 4.代码块
	
	//修饰属性：静态变量 、static变量、类变量
	
//	静态方法:
	static int legs;
	//代码块：初始化的工作
	
	{
		System.out.println("非静态代码块");
		age = 1;
	}
	
	//静态代码块
	//随着类的加载而加载，且只会执行一次，通常在其中完成给静态变量赋值的工作
	static
	{
		System.out.println("静态代码块");
		legs = 15;
		
	}
	
	
	public void eat()
	{
		System.out.println("eating");
	}




	public int getAge() {
		return age;
	}




	public void setAge(int age) {
		this.age = age;
	}




	public static int getLegs() {
		return legs;
	}




	public static void setLegs(int legs) {
		Person.legs = legs;
	}
	
	public static void staticTest()
	{
		//非静态方法调用
//		age = 12;
		legs = 12;
		
	}
	public static void staticTest2()
	{
		
	}
	public void noStaticTest()
	{
		eat();//非
		age = 1;//非
		legs = 20;
		staticTest2();
	}
	
	
	
}
