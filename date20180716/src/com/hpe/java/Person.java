package com.hpe.java;

public class Person {
	//属性私有化
	
//	this关键字 
//	1.this.属性名
//	2.this.方法名调用方法
//	3.this(..),在一个构造器中来调用本类中的其他构造器,只能出现在第一行

	
	private int age;
	
	private String sex;
	
	private String name;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person(int age, String sex, String name) {
		this(age,sex);
		this.name = name;
	}
	public Person(int age, String sex) {
		super();
		this.age = age;
		this.sex = sex;
		this.name = name;
	}


	public Person() {
		super();
		
		System.out.println("person无参.");
	}
	
//	学习	
	public void study()
	{
		System.out.println("studying");
	}
	

	@Override
	public String toString() {
		return "Person [age=" + age + ", sex=" + sex + ", name=" + name + "]";
	}
	
	

	
	
}
