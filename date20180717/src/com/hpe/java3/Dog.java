package com.hpe.java3;


//既有继承父类，也有实现接口，顺序：先写继承，再写实现接口。

//实现类去实现接口，就必须实现接口中的抽象方法，否则这个类就是个抽象类

//java中类是单继承，接口是多继承（一个类  可以实现多个接口）,如果有多个接口，再用,隔开。

public class Dog extends Animal implements IWhatchDoor,IBite{

	@Override
	public void shout() {
		
		System.out.println("wangwangwang!");
	}

	@Override
	public void watchDoor() {
		System.out.println("狗看门");
	}

	@Override
	public void bite() {
		
		System.out.println("狗咬人");
		
	}
	
	
	
	
	
	
}
