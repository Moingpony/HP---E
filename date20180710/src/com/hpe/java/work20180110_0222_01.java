package com.hpe.java;

import java.util.Scanner;

import org.junit.Test;

public class work20180110_0222_01 {
	
	//练习1
	
	@Test
	public void test()
	{
		//最大值
		int[] a = {4,2,0,-1,-8,23,9};
		int max1 = new work20180110_0222_01().getMax(a);
		System.out.println("最大值:"+max1);
		
		//最小值
		int min1 = new work20180110_0222_01().getMin(a);
		System.out.println("最小值:"+min1);
		
		//平均值
		float aver1 = new work20180110_0222_01().getAver(a);
		System.out.println("平均值:"+aver1);
		
		//总和
		int sum1 = new work20180110_0222_01().getSum(a);
		System.out.println("总和:"+sum1);
		
		
		//复制
		int[] b = new int[7];
		Copy(a,b);
		
		
		//反转
		resort(a);
		//调用show,a
		show(a);
		
		
	}
	
//最大值
	public int getMax(int[] arr)
	{
		//求数组中的最大值
		
		int max = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			if (arr[i]>max) {
				
				max = arr[i];
				
			}
		}
		return max;
		
	}
	//最小值
	public int getMin(int[] arr)
	{
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i]<min) {
				
				min = arr[i];
				
			}
		}
		return min;
	}
	//求平均值
	public float getAver(int[] arr)
	{
		
		
		float sum=(float) 0.0;
		float aver;
		int i;
		for (i = 0; i < arr.length; i++) {
			sum+=arr[i];
		
		}
		aver = sum/i;
//		System.out.println(add);
		return aver;
		
	}
	
	//求和
	public int getSum(int[] arr)
	{
		
		
		int sum=0;
		int i;
		for (i = 0; i < arr.length; i++) {
			sum+=arr[i];
		}

		return sum;
		
	}
	//复制
	public void Copy(int[] a,int[] b)
	{
		for (int i = 0; i < b.length; i++) {
			b[i] = a[i];
			
		}
		System.out.println("复制后:");
		show(b);
		if (a.length>b.length) {
			System.out.println("长度不一致!");		
			
		}
	}
	//反转
	public void resort(int[] a)
	{
		for (int i = 0; i < a.length/2; i++) {
			//交换   i<-->a.length-1-i
			int temp = a[i];
			a[i] = a[a.length-1-i];
			a[a.length-1-i] = temp;
			
		}
		
	}

	//遍历
	public void show(int[] arr)
	{
		//遍历
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	
	//练习2
	
	@Test
	public void test1()
	{
		System.out.println("请输入年龄:");
		int[] a1 = new int[5];
		input(a1);
		for (int i = 0; i < a1.length-1; i++) {//选出几个最大值 length-1
			
			for (int j = 0; j < a1.length-1-i; j++) {//比较(length-1-i)次
				//相邻的比较,如果左边的比右边的大,就交换位置
				
				if (a1[j]>a1[j+1]) {
					int temp = a1[j];
					a1[j] = a1[j+1];
					a1[j+1] = temp;
					
				}
			}
			
		}
		
		for (int i : a1) {
			System.out.print(i+" ");
		}
		
		
		
		
	}
	
	//练习3
	
	
	@Test
	public void test2()
	{
		System.out.println("输入10个数:");
		int[] a = new int[10];
		input(a);
		//元素之和
		int sum1 = new work20180110_0222_01().getSum(a);
		System.out.println("总和:"+sum1);
		//平均值
		float aver1 = new work20180110_0222_01().getAver(a);
		System.out.println("平均值:"+aver1);
		//最大值
		int max1 = new work20180110_0222_01().getMax(a);
		System.out.println("最大值:"+max1);
		
		//最小值
		int min1 = new work20180110_0222_01().getMin(a);
		System.out.println("最小值:"+min1);
		
		
	}
		

	//循环输入存进数组	
	public void input(int[] arr)
	{
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
	}
	
	//练习4
	@Test
	public void test4()
	{
		int[] a = {4,0,5,8,2,0,6,8,3};
		int[] b = cut(a);
		show(b);
	}
	public int[] cut(int[] a)
	{
		
		int count = 0;
		int num = 0;
		for (int i : a) {
			if (i==0) {
				count++;
			}
		}
		int[] b = new int[a.length-count];
		for (int i = 0,j=0; i < a.length; i++) {
			if (a[i]!= num) {
				b[j++] = a[i];				
			}
		}return b;
		
	}
	
	//第5题
	@Test
	public void test5()
	{
		int[] a ={1,7,9,11,13,15,17,19};
		int[] b ={2,4,6,8,10};
		int len1 = a.length;
		int len2 = b.length;
		int len3 = a.length+b.length;
		int[] c = new int[len3];
		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}
		for (int j = 0; j < b.length; j++) {
			c[a.length+j] = b[j];
		}
		for (int k = 0; k < c.length; k++) {
			System.out.print(c[k]+" ");
		}
			
		
	}
	
	//第6题
	@Test
	public void test6()
	{
		int[] a = new int[20];
		a[1] = 1;
		a[2] = 2;
		System.out.print(" "+a[1]);
		System.out.print(" "+a[2]);
		for (int i = 3; i < 20; i++) {
			a[i] = a[i-1]+a[i-2];
			System.out.print(" "+a[i]);
			
		}
	}
	
	@Test
	public void test7()
	{
		System.out.println("请输入打分:");
		int[] a = new int[10];
		input(a);
		double ave = ma(a);
		System.out.println("平均分是:"+ave);
		
	}
	public double ma(int[] b)
	{
		for (int i = 0; i < b.length-1; i++) {
			for (int j = 0; j < b.length-1-i; j++) {
				if (b[j]>b[j+1]) {
					int temp = b[j+1];
					b[j+1] = b[j];
					b[j] = temp;
					
				}
			}
		}
		double sum = 0;
		for (int i = 1; i < b.length-1; i++) {
			sum+=b[i];
		}
		double ave = sum/(b.length-2);
		return ave;
	}
	
	@Test
	public void test8()
	{
		int[] a = {1,2,3,1,0};
		repeat(a);
		
	}
	//检查元素重复
	public void repeat(int[] a)
	{
		boolean flag = true;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]==a[j]) {
					flag = false;
					System.out.println("重复的值为:"+a[i]);
					break;
					
				}
				}
			}
		if (flag) {
			System.out.println("没有重复值!");
		}else {
			System.out.println("有重复值!");
		}
			
	}
	
	//第9题
	
	
	
		
		
		
		
		
	
	

	
}
