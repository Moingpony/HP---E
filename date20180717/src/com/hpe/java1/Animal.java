package com.hpe.java1;


//抽象类：使用abstract修饰

//特点：可以被继承，不能实例化（与final类相反）
//抽象类中包含什么？？抽象类也是个类，普通类里面有的抽象类里面也都有抽象类中可以包含抽象方法

//抽象方法：使用关键字abstract修饰的方法，只有方法的声明（定义），没有功能

//抽象类与抽象方法的关系：抽象类不一定包含抽象方法，包含抽象方法的类一定是抽象类。

//为什么要定义抽象方法：子类继承抽象类，就必须重写抽象类的抽象方法，否则这个类就是抽象类


public abstract class Animal {
	
	//属性
	private int age;
	
	public Animal(int age, String sex) {
		super();
		this.age = age;
		this.sex = sex;
	}




	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}




	private String sex;

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

	
	
	
	//抽象方法:只有方法的定义，没有具体的功能
	public abstract void shout();

	
	
	
	
	
	
	
	
	
	
	
	

	
}
