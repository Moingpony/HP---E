package com.hpe.java;

import org.junit.Test;

public class StaticTest {

	
	//static 修饰的属性：静态变量或者类变量，所有对象共享一份，独一份  一个对其进行修改，其他的也受影响
	//类变量随着类的加载而产生，实例变量随着对象的创建而创建
	//先加载类  在创建对象-->类变量的加载要早于对象
	
	//类变量可以使用类名.属性名的方式设置值(访问权限允许)
	
	//不能使用类名.的方式去访问实例变量
	
	
	//静态方法也是随着类的加载而加载,早于对象的创建
	
	//(先有的不可以调用后有的,后有的可以调用先有的)
	//在静态方法中不能调用非静态的属性\方法,只能调用静态的属性\方法
	//在非静态方法中,可以调用静态的属性\方法以及非静态的属性\方法
	
	
	//在静态方法中能不能出现this.super
	
	@Test
	public void test()
	{
		Person p1 = new Person();
		
		p1.setAge(10);
		
		Person p2 = new Person();
		
		p2.setAge(20);
		
		System.out.println(p1.getAge());//10
		System.out.println(p2.getAge());//20
		
		
		//每个对象都有自己的一套副本，互不干扰
//		p1.setLegs(2);
		Person.setLegs(2);
//		p2.setLegs(4);
		Person.setLegs(4);
		System.out.println(p1.getLegs());//4
		System.out.println(p2.getLegs());//4
		
		Person.legs = 10;
		
		System.out.println(Person.legs);//类变量跟类相关,直接类调用
		
		
		
	}
	
	
	@Test
	public void test2()
	{
		
		Person p1 = new Person();
		
		//静态的方法，使用类名.方法名的方式去调用静态方法
		Person.staticTest();
		//非静态方法，只能用对象名.方法名来调用
		
		
		
	}
	
	@Test
	public void test3()
	{
		Person p1 = new Person();
		Person p2 = new Person();
		
	}
	
	
	
}
