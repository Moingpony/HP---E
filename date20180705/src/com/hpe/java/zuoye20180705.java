package com.hpe.java;

import java.util.Scanner;

public class zuoye20180705 {
	public static void main(String[] args) {
//		String str1 = "4";
//		String str2 = 3.5f + "";
//		System.out .println(3+4+"Hello!");
//		System.out.println("Hello!"+3+4);
//		System.out.println('a'+1+"Hello!");
//		System.out.println("Hello"+'a'+1);
//		
//		
//		short  s = 5;
//		s = (short) (s-2);
//		System.out.println(s);
//	    byte b = 3;
//		b = (byte)(b+4);
//		System.out.println(b);
//		
//	    char c = 'a';
//		int  i = 5;
//		double d = .314;
//		double result = c+i+d;
//		System.out.println(result);
		
//		byte b = 5;
//		short s = 3;
//		short t = (short) (s + b);
//		System.out.println(t);
//		String str = "12";
//		int x = Integer.parseInt(str);
//		int y = 10;
//		System.out.println(x+y);
		
//		ppt第一题：
//		String name = "李祥瑞";
//		char sex = '男';
//		int age = 21;
//		String subject = "java语言编程基础以及应用";
//		System.out.println("我的名字是："+name);
//		System.out.println("性别为："+sex);
//		System.out.println("年龄为："+age);
//		System.out.println("所学的课程是："+subject);

//		第二题：
		
		double price_1 = 245;
		double price_2 = 570;
		double price_3 = 320;
//		
//		int cont_1 = 2;
//		int cont_2 = 1;
//		int cont_3 = 1;
//		
//		double discount = 0.8;
//		
//		double finalPay = (price_1*cont_1+price_2*cont_2+price_3*cont_3)*discount;
//		System.out.println("消费总金额:"+finalPay);
		
//		第三题：
		
		Scanner input = new Scanner(System.in);
		System.out.println("请输入折扣：");
		double discount = input.nextDouble();
		
		double p_1 = price_1*discount;
		double p_2 = price_2*discount;
		double p_3 = price_3*discount;
		
		double a=100;
		char shirtPriceDisBool = p_1<a?'是':'否';
		char shoePriceDisBool = p_1<a?'是':'否';
		char padPriceDisBool = p_1<a?'是':'否';
		
		System.out.println("T恤折扣价是否低于100?"+shirtPriceDisBool);
		System.out.println("网球鞋折扣价低于100吗？"+shoePriceDisBool);
		System.out.println("网球拍折扣价低于100吗？"+padPriceDisBool);
	

	}

}
