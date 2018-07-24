package com.hpe.java;

public class ArrayTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		test1();
		
		int[] a= {1,2,34,5,6};
		int max1 = new ArrayTest2().getMax(a);
		System.out.println(max1);
		
		int[] b= {1,2020,34,5,6};
		int min2 = new ArrayTest2().getMin(b);
		System.out.println(min2);
		
		
		
		
	}
	
	//数组最值问题
	public static void test1()
	{
		int[] a = {-2,-1,-8,-9,-5};//静态初始化
		
		
		
		//获取数组a中的最大元素并打印
		
		int max = a[0];//保存最大元素的变量,初始化假设最大的是a[0]
		int min = a[0];//保存最小元素的变量,初始化假设最大的是a[0]
		
		//遍历数组中的所有元素,跟max作比较,如果比max还大,那么就将这个值赋给max
		//遍历数组中的所有元素,跟min作比较,如果比min还小,那么就将这个值赋给min
		
		for (int i = 1; i < a.length; i++) {
			if (a[i]>max) {
				max = a[i];
			}
			if (a[i]<min) {
				min = a[i];
			}
		}
		//max是数组中元素的最大值
		//min是数组中元素的最小值
		System.out.println("max:"+max+"\t"+"min:"+min);
		
	}
	//{1,2,3,4,5}
	//方法,求数组中最大值
	//1.参数:数组类型
	//2.功能:求数组中元素的最大值
	//3.返回值:int
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
