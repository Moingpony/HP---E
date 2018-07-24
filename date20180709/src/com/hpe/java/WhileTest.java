package com.hpe.java;

import java.util.Scanner;

import com.sun.webkit.dom.WheelEventImpl;

public class WhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		test2();
//		test3();
//		test4();
//		test5();
//		test6();
		test7();
		
	}
	//课文打印十遍--顺序
	public static void test1(){
		
		System.out.println("锄禾日当午，汗滴禾下土");
	}
	
	public static void test2()
	{
		//1.条件--什么时候执行循环体
		//1.1次数小于10次
		int count  = 0;//次数
		
		while (count<10) {
			//循环体
			//2.循环体内容
			//2.1打印课文
			System.out.println("锄禾日当午，汗滴禾下土"+(count+1));
			//2.2次数+1
			count++;
			
			
		}
		
	}
	//从控制台输入打印的次数-while
	public static void test3()
	{
		System.out.println("请输入打印次数：");
		Scanner sc = new Scanner(System.in);
		int sumCount = sc.nextInt();//总次数
		int count = 0;
		while (count<sumCount) {
			//循环体
			//2.循环体内容
			//2.1打印课文
			System.out.println("锄禾日当午，汗滴禾下土"+(count+1));
			//2.2次数+1
			count++;
		
	}
	}
	public static void test4()
	{
		//打印100以内被4整除的的所有shu
		int a = 1;
		while (a<=100)
		{
			a++;
			if (a%4 == 0) {
				System.out.println(a);
				
			}
			
		}
		
	}
//	求婚问题
	public static void test5()
	{
		Scanner sc = new Scanner(System.in);
		String answer;
		do {
			//求婚
			System.out.println("嫁给我吧，同意输入y，不同意输入n：");
			//接受控制台输入的内容
			answer = sc.nextLine();
			//判断answer是否是合法，y或n
			
			//输入的answer，既不是Y也不是N
			
			while (!"y".equals(answer)&&!"n".equals(answer)) {
				
				
				//打印输出有误
				System.out.println("输入有误，请重新输入");
				
				//重新输入
				answer = sc.nextLine();
			}
			
		} while ("n".equals(answer));//输入的是n接着执行循环体
		//求婚成功
		System.out.println("求婚成功");
	}
	
	public static void test6()
	{
		Scanner sc = new Scanner(System.in);
		String answer;
		boolean flag = true;//标志位
		do {
			System.out.println("嫁给我吧，同意输 入y，不同意输入n：");
			answer = sc.nextLine();
			
			//如果输入的是y，将flag设置为false--》结束do-while循环
			if ("y".equals(answer)) {
				
				flag = false;
			}
					
			
		} while (flag);
		//求婚成功
		System.out.println("求婚成功");
	}
	public static void test7()
	{
		System.out.println("请输入用户名：");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.println("请输入密码：");
		String pwd = sc.nextLine();
		boolean flag = true;
		do {
			if("admin".equals(name)&&"pwd".equals(pwd)){
				flag = false;
			}else {
				System.out.println("账号或密码错误，请重新输入！");
				System.out.println("请输入用户名：");
				name = sc.nextLine();
				System.out.println("请输入密码：");
				pwd = sc.nextLine();
			}
		} while (flag);
		System.out.println("登录成功！");
		
		
	}
	
	
	
}
