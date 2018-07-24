package com.hpe.java;

import org.junit.Test;

public class PersonTest {
	
	//构造器(构造函数/Constructor)
	//构造器的作用是什么？--》用于创建对象
	
	//构造器特点：
	//1.名字与类名一致
	
	//2.无返回值，无返回值类型（无void）

	
	//注意：
	//如果类中，没有写构造函数，那么系统会提供一个默认的无参的构造函数供我们调用
	//一旦在类中，自定义了构造函数，那么系统就不会提供默认的无参的构造函数了
	@Test
	public void test()
	{
		Person p = new Person();
		
		//打印p的age属性值
		
		p.getAge();
		System.out.println(p.getAge());//1
		
		//创建Person对象，并完成属性的赋值
		
		Person p1 = new Person(); //age = 10, name  = zhangsan ;sex = 男
		
		p1.setAge(10);
		p1.setName("zhangsan");
		p1.setSex("男");
		
		
		//希望：在创建对象的同时，就给属性设置想要的属性值
		
		Person p2 = new Person(11, "lisi", "女");
		System.out.println(p2);
		
		//this说明
		
		Person p3 = new Person();
		p3.setAge(10);
		
		
		
		
	}
	
	
	//创建类，添加类的成员的步骤
	//1.创建类
	//2.添加private属性
	//3.提供public的get/set方法
	//4.添加有参，无参构造器
	
	
	
}
