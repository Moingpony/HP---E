package com.hpe.java;

import org.junit.Test;

public class ArrayTest4 {
	
	@Test
	public void test1()
	{
		int[] a = new int[]{1,2,3,4,5};
		//遍历a中的元素
		show(a);//1 2 3 4 5
		//调用a中的方法,将a作为参数
		test(a);
		//遍历a中的元素
		show(a);
	}
	
	//方法:
	//功能:将传递过来的int[]中的元素+1
	
	public void test(int[] arr)
	{
		//将数组中元素+1
		
		for (int i = 0; i < arr.length; i++) {
			
			arr[i]+=1;
			
			
		}
		//arr = new int[]{5,4,3,2,1};
		
	}
	public void show(int[] arr)
	{
		//遍历
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	

}
