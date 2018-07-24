package com.hpe.java1;

public class Animal {
	private int age;
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
	public Animal(int age, String sex) {
		super();
		this.age = age;
		this.sex = sex;
	}
	
	public Animal() {
		super();
	}
	
	
	//方法：叫
	
	public void shout()
	{
		System.out.println("wangwangwang");
	}
	
	@Override
	public String toString() {
		return "Animal [age=" + age + ", sex=" + sex + "]";
	}
	
	public void show()
	{
		this.shout();
	}
	
}
	
