package com.hpe.java;

import java.util.Arrays;

import org.junit.Test;

public class ArraySort {
	
	@Test
	public void test1()
	{
		int[] arr = {3,1,0,5,2};
		
		//从小大
		
		for (int i = 0; i < arr.length-1; i++) //选出几个最小的 arr.length-1
		{
			//定义一个变量保存最小的索引
			int minIndex = i;			
			for (int j = i+1; j < arr.length; j++)//j-->要比较的元素的索引 
			{
				//将最小的元素与当前元素进行比较,
//				--如果最小的元素大于当前元素,那么这个元素的索引应该复制给minIndex
				
				if (arr[minIndex]>arr[j]) {
					
					minIndex = j;
					
					
				}
			}
			//minIndex,当前这次最小的索引,将他与i所对应的元素交换
			
			if (arr[minIndex]!=i) {
		
			
			int temp  =arr[minIndex];
			
			arr[minIndex] = arr[i];
			
			arr[i] = temp;
			
			}
			
			
		}
		
		for (int x : arr) {
			System.out.println(x);
		}
		
	}
	@Test
	public void test2()
	{
		int[] arr  = {5,1,3,7,0};
		
		Arrays.sort(arr);
		for (int x : arr) {
			System.out.println(x);
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
