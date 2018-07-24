package com.hpe.java1;


//final 修饰符

//修饰什么?class \方法\属性\

//class :不能被继承(没有子类),可以实例化

//方法:不能被重写

//属性:


public  class Person {
	
	public final void eat()
	{
		System.out.println("eating");
	}
	
	
}
//String 不能被继承
/*class a extends String()
{
	
}*/
	//final修饰的方法不能被重写
/*class a extends Person
{
	public void eat()
	{
		System.out.println("eating");
	}
}
	*/



	
	
