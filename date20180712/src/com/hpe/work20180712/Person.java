package com.hpe.work20180712;

public class Person {
	public String name;
	public int age;
	public int sex;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public void study()
	{
		System.out.println("studying");
		
	}
	public void showAge()
	{
		System.out.println(age);
	}
	public void addAge(int i)
	{
		this.age = age+i;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", sex=" + sex + "]";
	}
	
	
}
