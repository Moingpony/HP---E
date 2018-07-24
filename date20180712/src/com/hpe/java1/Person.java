package com.hpe.java1;

//人类

//类的成员：属性、方法、内部类外部类、代码块

public class Person {
	
	//属性(成员变量)
	
	//访问修饰符：public protected 缺省 private
	
	int age;//设为private
	
	String name;
	
	String sex;
	
	//外部可以访问（设置age属性值）
	public void setAge(int age)
	{
		
		
		//加一些验证
		if (age>130||age<=0) {
			this.age = 1;
		}else {
			//设置age属性值
			this.age = age;
		}
	
	}
	
	public int getAge()
	{
		return age;
	}
	
	
	//方法
	
	//吃饭
	public void eat()
	{
		int a;
		System.out.println("eating");
	}
	
	public void sayHello()
	{
		System.out.println("你好，我的名字是"+name);
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + ", sex=" + sex + "]";
	}


	

	
}
