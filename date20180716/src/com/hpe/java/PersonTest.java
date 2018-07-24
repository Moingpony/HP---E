package com.hpe.java;

import java.sql.Date;

import org.junit.Test;

public class PersonTest {
	
	//import:如果要使用非本包的类,需要import进来
	
	
	@Test
	public void test()
	{
		//创建Person类的对象
		Person p1 = new Person();
		
		
		Person p2 = new Person(11, "男", "张三");
		
		
		
	}
	
	@Test
	public void test1()
	{
		Student s1 = new Student("10001");
	}
	
	@Test
	public void test2()
	{
		
		Person p1 = new Person();
		p1.study();
		
		//全类名  ---->带着包名的类名就是全类名(全限定名)
		com.hpe.java1.Person p2 = new com.hpe.java1.Person();
		
		//Date
		
		Date date = new Date(2);
		java.util.Date date1 = new java.util.Date();
		
		
		
		//web.xml  Servlet  --全类名
	}
	
	
}
