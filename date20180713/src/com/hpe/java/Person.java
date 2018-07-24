package com.hpe.java;

public class Person {
	private int age;
	private String name;
	private String sex;
	
	
	
	
	
	//构造函数
	
	public Person()
	{
		System.out.println("自定义的无参构造函数");
		
		age = 1;
		
	}
	
	//写构造函数--》有参
	
/*	public Person(int age,String name,String sex)
	{
		//给age属性赋值
		
		this.age = age;
		
		
		//给name属性赋值
		
		this.name = name;
		
		//给sex属性赋值
		this.sex = sex;
		
	}*/
	
	
	//this：代表当前对象，谁调用方法，谁就是当前对象
	
	public Person(int age, String name, String sex) {
		super();
		this.age = age;
		this.name = name;
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + ", sex=" + sex + "]";
	}
	
	
	
}
