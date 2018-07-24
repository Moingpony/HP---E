package com.hpe.java;



public class ArrayForEachTest {
	public static void main(String[] args) {
//		test1();
//		test3();
//		test4();
		test5();
		
		
	}
	
	//数组遍历
	
	//方式一:for循环
	
	public static void test1()
	{
		int[] a ={2,4,3,1,8,9};
		
		//for循环遍历
		//0--a.length-1
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
	//使用增强for循环(foreach)遍历
	
	public static void test2()
	{
		int[] a = {2,3,4,1,7,0};
	
		//for(类型  变量名 : 数组名)
		for(int i : a)
		{
			System.out.println(i);
			
			}
	}
	
	//遍历String[] 数组
	//统一重命名:alt+shift+r
	public static void test3()
	{
		String[] strArray = {"a","b","c","d"};
		for (int i = 0; i < strArray.length; i++) {
			System.out.print(strArray[i]);
		}
		System.out.println();
	}
	public static void test4()
	{
		String[] strArray = {"a","b","c","d"};
		for (String i : strArray) {
			System.out.print(i);
		}
	}
	public static void test5()
	{
		//创建一个数组,数组中的元素都是Person类的对象,怎么声明
		
		//左边:Person是数组中元素的类型
		//[]:一维数组
		//arr:数组名
		//右边:同左边
		//3:数组中元素的个数
		Person[] arr = new Person[3];//数组中存放的元素都是
		
//		arr[0] = new Person(11,"zhangsan");
		
		Person p1 = new Person(11,"zhangsan");
		arr[0] = p1;
		
		Person p2 = new Person(12,"lisi");
		arr[1] = p2;
		
		Person p3 = new Person(1,"wangwu");
		arr[2] = p3;
		
		//如何得到数组中所有Person对象的名字
		
		//得到所有的对象-->所有名字
		for (int i = 0; i < arr.length; i++) {
			Person person = arr[i];
			
			System.out.println(person.getName()+"!");
		}
		
		//
		for (Person person : arr) {
			System.out.println(person.getName());
			
		}
	}
	
}
