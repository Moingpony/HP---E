package com.hpe.java;


//super关键字

//super.属性,调用父类的属性
//super.方法,调用父类的方法
//super(..),调用父类的构造函数
//如果子类的构造器中没有写super(..),默认会调用父类的无参构造器
//子类构造器中必然会调用父类构造器

public class Student extends Person {
	
	

	private String number = "10002";//学号
	
	
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	
	public Student(String number) {
		super();
		//显示初始化
		System.out.println("student 有参构造器");
		System.out.println(this.number);//1002
		
		this.number = number;
		System.out.println(this.number);//1001
	}
	@Override
	public void study() {
		// TODO Auto-generated method stub
		
		super.study();
		
		System.out.println("haohaoxuexi");
	}
	
	public Student(int age, String sex, String name, String number) {
		super(age, sex, name);
		this.number = number;
	}
	public Student(int age, String sex, String number) {
		super(age, sex);
		this.number = number;
	}
	
	

	
}

