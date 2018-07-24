package com.hpe.java;

public class MethodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 2;
		int j = 4;
		MethodTest m = new MethodTest();
		int a = m.intSum(i, j);
		System.out.println(a);
	}
	//方法:计算两个int类型的数据的和,并返回
	//参数:2个 int类型
	//返回值:int 
	
	public int intSum(int a,int b)
	{
		//功能
		//1.求和
		int sum = a+b;
		//2.返回和
		return b;
	}

}
