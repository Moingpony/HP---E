package com.hpe.java;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;



public class Practice0706 {

	public static void main(String[] args) {
//		test1();
//		test2();
//		test3();
//		test4();
//		test5();
//		test6();
//		test7();
		

	}
	//练习1
	public static void test1()
	{
		System.out.println("1 矩形  2 三角形 3 圆");
		System.out.println("请选择图形：");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		double s;
		
		switch (a) {
		case 1:
			System.out.println("请输入矩形的宽：");
			double x = sc.nextDouble();
			System.out.println("请输入矩形的高：");
			double y = sc.nextDouble();
			s = x*y;
			System.out.println("该矩形的面积为："+s);
			
			
			break;
		case 2:
			System.out.println("请输入三角形的底：");
			double x1 = sc.nextDouble();
			System.out.println("请输入三角形的高：");
			double y1 = sc.nextDouble();
			s = x1*y1/2;
			System.out.println("该三角形的面积为："+s);
			break;
		case 3:
			System.out.println("请输入原形的半径：");
			double x2 = sc.nextDouble();
			double PI = 3.14;
			
			s = x2*x2*PI;
			System.out.println("该原形的面积为："+s);
			break;
		default:
			break;
		}
		
	}
	//练习2
	public static void test2()
	{
		System.out.println("请输入算式（逐个输入）：");
		
		Scanner sc = new Scanner(System.in);
		double a1 = sc.nextDouble();
		sc.nextLine();
		char a0 = sc.nextLine().charAt(0);
//		sc.nextLine();
		double a2 = sc.nextDouble();
		double res = 0.0;
		switch (a0) {
		case '+':
			res = a1+a2;
		case '-':
			res = a1-a2;
			break;
		case '*':
			res = a1*a2;
			break;
		case '/':
			res = a1/a2;
			break;

		default:
			System.out.println("运算符输入错误");
			break;
		}
		
		System.out.println("res = "+res);
		
	}
	//练习3
	public static void test3()
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
			System.out.println("等级:E");
			break;
		case 6:
			System.out.println("等级:D");
			break;
		case 7:
			System.out.println("等级:C");
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
	//练习4
	public static void test4(){
		Date inTime = null;
		Date beTime = null;
		Date endTime = null;
		SimpleDateFormat date1 = new SimpleDateFormat("hh:mm");
		Scanner sc = new Scanner(System.in);
		System.out.println("输入打车时间（hh:mm）：");
		
		String time = sc.nextLine();
		try {
			inTime = date1.parse(time);
			beTime = date1.parse("06:00");
			endTime = date1.parse("21:00");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println("请输入乘车距离：");
		double km = sc.nextDouble();
		double money = 0.0;
		
		if(calendar(inTime,beTime,endTime))
		{
			if (km <= 2.0) {
				money = 6 + 1;
			}else {
				money = 6 + 1.5 * km + 1;
			}
		} else {
			if (km <= 2.0) {
				money = 7 + 1;
			}else {
				money = 7 + 1.5 * km + 1;
			}
		}
		System.out.println("本次打车的费用："+money);
		}
		
		
	
	private static boolean calendar(Date inTime, Date beTime, Date endTime) {
		Calendar input = Calendar.getInstance();
		input.setTime(inTime);
		Calendar begin = Calendar.getInstance();
		begin.setTime(beTime);
		Calendar end = Calendar.getInstance();
		end.setTime(endTime);
		if (input.after(begin)&&input.before(end)) {
			return true;
		}else {
		return false;
		}
	}
	//练习5
	public static void test5()
	{
		Scanner sc = new Scanner(System.in)	;
		System.out.println("请输入年份：");
		int year = sc.nextInt();
		int a = year%4;
		int b = year%100;
		int c = year%400;
		if(a==0&b!=0|c==0){
			System.out.println(year+"是闰年");
			}else{
			System.out.println(year+"不是闰年");
			}
		}
	//练习6
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
	//练习7
	public static void test7()
	{
		System.out.println("请输入一个浮点数：");
		Scanner sc = new Scanner(System.in);
		float a1 = sc.nextFloat();
		a1 = a1*10;
	    float a3 = a1%10;
		int a2 = 0;
		if(a3>=5){
			a2 = (int) ((a1/10)+1);			
		}else {
			a2 = (int) (a1/10);
		}
		
		System.out.println(a2);
	}
}
	
	

