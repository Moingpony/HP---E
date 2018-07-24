package com.hpe.java;

import java.util.Scanner;

import javax.swing.text.html.CSS;

public class IfTest {
	public static void main(String[] args) {
		
//		test1();
//		test2();
//		test3();
//		test4();
//		test5();
//		test6();
//		test7();
		test8();
		
		
	}
	public static void test1()
	{
		//接收控制台输入的整数，如果大于0，就打印*大于0
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个整数：");
		
		//接收控制台输入的整数并保存
		
		String str_num = sc.nextLine();
		int num = Integer.parseInt(str_num);
		
		//如果num 大于0,就打印num>0;
		
		if (num>0) {
			System.out.println(num+"大于0");
		}
		
		
		
		
	}
	public static void test2() 
	{
		//从控制台输入两个整数，如果相等打印相等，都这打印不相等
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数：");
		
		int num1 = sc.nextInt();
		
		System.out.println("请输入第二个数：");
		
		int num2 = sc.nextInt();
		/*
		if (num1 == num2) {
			System.out.println("相等");
			
			
		}else {
			System.out.println("不相等");
			
		}*/
		String res = (num1==num2)?"相等":"不相等";
		System.out.println(res);
		
		System.out.println("结束");
		
	}
	public static void test3()
	{
		//if-else if-else
		
		//从控制台输入两个整数，并保存a,b//如果a>b,打印a大于b，如果a=b就打印a=b,否则打印a<b：
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入第一个数：");
		
		int a = sc.nextInt();
		
		System.out.println("请输入第二个数：");
		
		int b = sc.nextInt();
		
		if (a>b) {
			System.out.println(a+">"+b);			
		}else if (a==b) {
			System.out.println(a+"=="+b);			
		}else {
			System.out.println(a+"<"+b);
		}
		System.out.println("结束");
	}
	public static void test4()
	{
		//if-else if-else
		
		//从控制台输入两个整数，并保存a,b//如果a>b,打印a大于b，如果a=b就打印a=b,否则打印a<b：
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入一个数：");
		
		int a = sc.nextInt();
		
		if (a>=80&a<=100) {
			System.out.println("成绩优秀");			
		}else if (a>=60&a<=80) {
			System.out.println("成绩合格");			
		}else if (a<60) {
			System.out.println("成绩不合格");			
		}else {
			System.out.println("输入不正确");
		}
		System.out.println("结束");
	}
	public static void test5()
	{
		//if嵌套
		
		//从控制台输入两个整数
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入第一个数：");
		
		int a = sc.nextInt();
		
		System.out.println("请输入第二个数：");
		
		int b = sc.nextInt();
		
		if (a>=b) {
			//a大于或等于b
			if (a>b) {
				//a>b
				System.out.println(a+">"+b);				
				
			}else {
				//a=b
				System.out.println(a+"="+b);
				
			}		
					
		}else {
			//a<b
			System.out.println(a+"<"+b);
		}
		System.out.println("结束");
	}
	public static void test6()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个整数：");
		int num1 = sc.nextInt();
		System.out.println("请输入第二个整数：");
		int num2 = sc.nextInt();
		System.out.println("请输入第三个整数：");
		int num3 = sc.nextInt();
		
		if (num1>num2) {
			//num1  num2
			if (num3>num1) {
				//3 1 2
				System.out.println(num3+"\n"+num2+"\n"+num1);
							
			}
			else if (num3<num2) {
				//1 2 3
				
				System.out.println(num1+"\n"+num2+"\n"+num3);
				
			}else {
				//1 3 2 
				System.out.println(num1+"\n"+num3+"\n"+num2);
			}		
		}else{
			//num2  num1
			if (num3<num1) {
				//2 1 3				
				System.out.println(num2+"\n"+num1+"\n"+num3);				
			}else if (num3>num2) {
				//3 2 1
				System.out.println(num3+"\n"+num2+"\n"+num1);
				
			}else{
				//2 3 1
				System.out.println(num2+"\n"+num3+"\n"+num1);
			}
		}
	}
	public static void test7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入一个整数：");
		
		int a = sc.nextInt();
		
		int x = 100;
		switch (a) {
		case 1:
			x+=5;			
			break;
		case 2:
			x+=10;
			break;
		case 3:
			x+=16;
			break;
		case 4:
			x+=34;
			break;

		default:
			x+=100;
			break;
		}
		System.out.println(x);		
	}
	public static void test8()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个成绩:");
		float score = sc.nextFloat();
		int score_1 = (int) (score/10);
		switch (score_1) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("等级:D");
			break;
		case 6:
			System.out.println("等级:C");
			break;
		case 7:
			System.out.println("等级:B");
			break;
		case 8:
			System.out.println("等级:B");
			break;
		case 9:
			System.out.println("等级:A");
			break;
		default:
			break;
		}
		System.out.println(score_1);
	}

}
