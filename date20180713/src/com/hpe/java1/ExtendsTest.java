package com.hpe.java1;

import org.junit.Test;

public class ExtendsTest {
	
	//java只支持单继承，不支持多继承
	
	//一个类只能有一个父类，但一个类可以有多个子类
	
	@Test
	public void test()
	{
		Dog dog = new Dog();
		
		dog.setAge(10);;
		System.out.println(dog.getAge());
		
		dog.watchDoor();
		dog.shout();
	
	}
}
