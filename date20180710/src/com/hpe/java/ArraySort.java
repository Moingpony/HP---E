package com.hpe.java;

import java.util.Scanner;

import org.junit.Test;

public class ArraySort {
	
	//冒泡排序    选择排序,快速排序,折半排序
	@Test
	public void test1()
	{
		int[] arr = {4,1,3,6,2,5};
		for (int i = 0; i < arr.length-1; i++) {//选出几个最大值 length-1
			
			for (int j = 0; j < arr.length-1-i; j++) {//比较(length-1-i)次
				//相邻的比较,如果左边的比右边的大,就交换位置
				
				if (arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					
				}
			}
			
		}
		
		for (int i : arr) {
			System.out.println(i+" ");
		}
		
	}
	
	
	
	
	
//	从控制台输入三个数,从小到大排列
	@Test
	public void test()
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入第一个数:");
		
		int a = sc.nextInt();
		
		System.out.println("请输入第二个数:");
		
		int b = sc.nextInt();
		
		System.out.println("请输入第三个数:");
		
		int c = sc.nextInt();
		
		
		
		//如果a比b大,交换a跟b
		if (a>b) {
			int temp=a;
			a=b;
			b=temp;
		}
		
		//如果b比c大,交换c跟b   c最大
		if (b>c) {
			int temp=b;
			b=c;
			c=temp;
		}
		
		//如果a比b大,交换a跟b
		if (a>b) {
			int temp=a;
			a=b;
			b=temp;
		}
		// a b c 
		System.out.println(a+" "+b+" "+c);
		
	}

}
