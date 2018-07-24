package com.hpe.java1;

public class Dog extends Animal {


	//继承
	
	//如何实现继承：extends
	//写法：A extends B,
	//A 叫 子类、派生类SubClass
	
	//B 叫父类、基类、SuperClass
	
	
	//会继承什么东西
	
	
	//子类特有的属性
	
	private String type;//种类

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
	//子类特有的方法
	
	public void watchDoor()
	{
		System.out.println("看门..");
	}
	
	//子类可以重写父类的方法，来表现自己的行为。当调用重写的方法时，调用的是子类重写后的方法（对父类实现覆盖或隐藏）
	//重写：override,overwrite
	//前提：子类继承父类，方法名一致，参数一致（参数的个数以及类型都一致）
	//@override 修饰的方法必须是一个重写的方法
	
	public void shout(int a)
	{
		System.out.println("wang!");
	}
	
}
