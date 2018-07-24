package com.hpe.java;

import java.util.Arrays;

public class MethodTest1 {
	//方法参数传递：值传递
	//参数是基本数据类型：传递的是数值
	//参数是引用数据类型：传递的是地址值

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 6;
		System.out.println(a+" "+b);
		swap(a, b);
		System.out.println();
		int[] arr = {1,2,3,4,5};
		//打印arr中所有元素
		show(arr);
		//调用intArrayPlus
		intArrayPlus(arr);
		System.out.println();
		//打印Arr中所有元素
		show(arr);
		System.out.println();
		int[] a1 = {1,3,5,7,9};
		int[] b1 = {2,4,6,8,10};
		int[] c = combine(a1, b1);
		String c1 = Arrays.toString(c);
//		show(c);
		System.out.println(c1);
		
	}
	
	//交换两个int数据
	
	public static void swap(int a, int b)
	{
		int temp;
		temp = a;
		a=b;
		b=temp;
		System.out.print(a+" "+b);
	}
	//方法：将传过来的int[]。将其中的元素都+1
	
	public static int[] intArrayPlus(int[] arr)
	{
		//将数组中所有元素的值+1
		for (int i = 0; i < arr.length; i++) {
			
			arr[i]+=1;
			
		}
		return arr;
		
	}
	public static void show(int[] arr)
	{
		for (int i : arr) {
			System.out.print(i+" ");
		}
		
	}
	
	
	//给出两个数组，升序排列
	
	//方法：将两个int[]合并，并升序，返回这个新数组
	public static int[] combine(int[] a,int[] b)
	{
		///定义一个新数组，将a,b的元素放入新数组
		int[] c = new int[a.length+b.length];
		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}
		for (int i = 0; i < b.length;i++) {
			c[a.length+i] = b[i];
		}
		//对新数组升序排序
		sort(c);
		//返回新数组
		return c;
		
	}
	public static void sort(int[] a)
	{
		for (int i = 0; i < a.length-1; i++) {
			for (int j = 0; j < a.length-1-i; j++) {
				if (a[j]>a[j+1]) {
					
					int temp1 = a[j];
					a[j]=a[j+1];
					a[j+1] = temp1;
					
					
				}
				
			}
		}
		
	}

	

}
