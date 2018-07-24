package com.hpe.java3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class InterfaceTest {
	
	
	//java只支持单继承，一个子类只能有一个父类，一个父类可以有多个子类
	
	//接口中只能定义抽象方法、常量
	//接口中定义的抽象方法可以理解为功能，具体的实现交给实现类去完成
	//interface A{}
	
	//使用类去实现接口使用的关键字 implements：class B implements A{}
	
	//一个类去实现一个接口，那么这个类叫做实现类。这个类就有了接口中所定义的功能。
//	具体如何实现功能在实现类中完成（重写/实现接口中定义的抽象方法）
	
	//接口没有构造器，不能实例化
	
	@Test
	public void test()
	{
		
		Dog dog = new Dog();
		dog.bite();
		dog.watchDoor();
		dog.shout();
		
		Animal animal  = new Dog();
		
		animal.shout();
		
		//向下转型
		/*Dog dog1 = (Dog) animal;
		dog1.bite();*/
		((Dog)animal).bite();
		
		//接口的多态性
//		接口的引用指向实现类
		System.out.println("---------------");
		IWhatchDoor whatchDoor = new Dog();//接口的多态性
		whatchDoor.watchDoor();
		((IBite)whatchDoor).bite();
		
		List list = new ArrayList<>();//多态
		
		//解耦
		
		
		Map map = new HashMap<>();
		
	}
	
	
	
	
}
