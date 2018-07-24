package com.hpe.java;

import org.junit.Test;

public class MultiArray {
	
	@Test
	public void test1()
	{
		int [][] arr = new int[5][];
		System.out.println(arr.length);
		arr[0] = new int[5];
		arr[1] = new int[5];
		arr[2] = new int[5];
		arr[3] = new int[5];
		arr[4] = new int[5];
		
		int[][] arr1 = new int[5][4];
		
	}
	
	public void test2()
	{
		int[][] arr = new int[3][];
		
		arr[0] = new int[3];
		arr[1] = new int[2];
		arr[3] = new int[3];
		
		System.out.println(arr.length);//4
		System.out.println(arr[2].length);
//		System.out.println(arr[3].length);
		
		//给二维数组中的第一个元素赋值
		
		arr[0][0] = 1;
		
		//静态初始化
		
		int[][] arr1 = {{1,2},{2,1,3},{3,2,1}};
		
		
		
	}
	@Test
	public void test3()
	{
		int[][] arr1 = {{1,2},{2,1,3},{3,2,1}};
		for (int i = 0; i < arr1.length; i++)
		{
//			arr[i]-->二维数组中指定位置的元素
			for (int j = 0; j < arr1[i].length; j++) 
			{
				System.out.println(arr1[i][j]);
			}
		}
		
		
	}
	
	@Test
	public void test4()
	{
		int[][] arr1 = {{1,2},{2,1,3},{3,2,1}};
		for (int[] arr2 : arr1) {
			for (int i : arr2) {
				System.out.println(i);
			}
		}
		
	}
	@Test
	public void test5()
	{
		
	}
	
	
	
	
}
