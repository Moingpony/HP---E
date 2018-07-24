package com.hpe.java;

import java.util.Scanner;

public class BreakTest {

	public static void main(String[] args) {
//		test1();
		test2();

	}
	public static void test1()
	{
		for (int i = 0; i < 3; i++) {
			if (i==1) {
				break;
			}
			for (int j = 0; j < 3; j++) {
				/*if (j==1) {
					break;
				}*/
				
				System.out.println("i:"+i+",j:"+j);
			}
			
		/*	System.out.println(i);
			break;*/
		}
		System.out.println("结束");
	}
	public static void test2()
	{
		int age = 0;//年龄
		int age1 = 0;//总年龄
		int i;//人数
		Scanner sc = new Scanner(System.in);
		for (i = 1; i < 6; i++) {
			
			System.out.println("请输入第"+(i)+"位年龄:");
			age = sc.nextInt();	
			//判断年龄
			if (age<0||age>130) {
				//结束整个for循环
				
				break;				
			}
			age1+=age;
			
			
		}
		//是否打印平均年龄-->5个年龄没问题
		if(i == 6){
		System.out.println("平均年龄是"+age1/5);
		}
		else {
			System.out.println("输入有误!");
			
		}
		
	}
	public static void test3()
	{
		int age = 0;//年龄
		int age1 = 0;//总年龄
		int i;//人数
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		for (i = 1; i < 6; i++) {
			
			System.out.println("请输入第"+(i)+"位年龄:");
			age = sc.nextInt();	
			//判断年龄
			if (age<0||age>130) {
				//结束整个for循环
				flag = false;
				break;				
			}else {
				age1+=age;
			}					
		}
		//判断什么时候打印平均年龄,什么时候打印有误
		if (flag) {
			System.out.println("平均年龄是"+age1/5);
		}else {
			System.out.println("输入有误!");
		}
		
	}
	

}
