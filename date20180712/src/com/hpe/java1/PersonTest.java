package com.hpe.java1;


public class PersonTest {

	public static void main(String[] args) {
		
		//如何创建Person类的对象--》new+构造器（构造方法）
		
		Person p = new Person();
		
		//如何得到属性值--》对象名.属性的方式
		
		int age = p.age;
		String name = p.name;
		String sex = p.sex;
		System.out.println(age+" "+name+" "+sex);
		
		//设置age属性值
		p.setAge(10);
		System.out.println(p.age+" "+p.name+" "+p.sex);
		p.eat();//对象.方法名的方式调用方式
		Person p1 = new Person();
		
		p1.age = 1;
		System.out.println(p1.age+" "+p1.name+" "+p1.sex+"!");
		System.out.println(p.age+" "+p.name+" "+p.sex+"@");
	
	}

}
