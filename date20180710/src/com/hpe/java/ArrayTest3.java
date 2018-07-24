package com.hpe.java;

import java.util.Scanner;

import org.junit.Test;

public class ArrayTest3 {
	//单元测试
	/*@Test
	public void test1()
	{
		System.out.println(1);
	}
	public void test2()
	{
		System.out.println(2);
	}*/
	@Test
	public void test1()
	{
		int[] a = {1,2,5,6,3,4};
		
	/*	//0,3-->0+3=a.lendth-1
		int temp = a[0];
		a[0] = a[3];
		a[3] = temp;
		
		//1,2-->a.length-1
		temp = a[1];
		a[1] = a[2];
		a[2] = temp;
		*/
		//交换次数length/2
		for (int i = 0; i < a.length/2; i++) {
			//交换   i<-->a.length-1-i
			int temp = a[i];
			a[i] = a[a.length-1-i];
			a[a.length-1-i] = temp;
			
		}
		
		//调用show,a
		show(a);
		
		
		
	}
	//交换
	@Test
	public void test2()
	{
		int a = 1;
		int b = 2;
		System.out.println("a:"+a+"b:"+b);
		
		int temp = a;
		
		a=b;
		b=temp;
		temp=a;
		
		System.out.println("交换后:");
		System.out.println("a:"+a+"b:"+b);
		
		
	}
	@Test
	public void test3()
	{
		int[] a = {1,2,5,6,3,4,7};
		
		//交换次数length/2
		for (int begin = 0,end = a.length-1; begin < end; begin++,end--) {
			//交换
			int temp = a[begin];
			a[begin] = a[end];
			a[end] = temp;
			
		}
		//调用show,a
		show(a);
		
		
		
	}
	
	//方法:遍历数组中的元素
	//参数:数组
	//返回值:void
	
	public void show(int[] arr)
	{
		//遍历
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}
	
	//  数组元素查找(查找指定元素第一次在数组中出现的索引)
	
	@Test
	public void test4()
	{
		int[] a = new int[]{3,2,1,2,1,3};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入要查找的数值:");
		
		int num = sc.nextInt();
		
		int index = -1;//保存索引
		
		for (int i = 0; i < a.length; i++) {
			
			//判断我的num是否与数组中元素值相同,如果相等了,后面的无需比较了,结束for循环break;
			if(num==a[i])
			{
				index = i;
				break;
			}
			
		}
		System.out.println("索引是:"+index);
		
		
	}
	
	

}
