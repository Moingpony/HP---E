package com.hpe.java;

import java.util.Scanner;

public class Practice20180709 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		test1();
//		test2();
//		test3();
//		test4();
//		test5();
//		test6();
//		test7();
//		test8();
//		test9();
		test10();
	}
	
//	   练习1
	/*输入数量不确定的正数和负数（一次输入一个），
	然后打印正数和负数的个数，当输入0时，程序停止*/

	public static void test1()
	{
		int count1 = 0;
		int count2 = 0;
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		while (a!=0) {
			if (a>0) {
				count1++;
				
			}else {
				count2++;
			}
			a= sc.nextInt();
		}
		  System.out.println("正数的个数为" + count1 + "," + "负数的个数为" + count2);
	}
	//练习2
	
	public static void test2()
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
	public static void test3()
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
	public static void test4()
	{
//		Scanner sc = new Scanner(System.in)	;
//		System.out.println("请输入年份：");
		int year =0;
		
		for (year = 1900; year <= 2050; year++) {
			
		int a = year%4;
		int b = year%100;
		int c = year%400;
		if(a==0&b!=0|c==0){
			System.out.println(year);
			}
//		else{
//			System.out.println(year+"");
//			}
		}
	}
	public static void test5()
	{
			boolean flag = true;
			while (flag) {
				
			
			System.out.println("**************");
			System.out.println("1.管理员 2.顾客 3.退出");
			System.out.println("**************");
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入选择登陆");
			int num = sc.nextInt();
			switch (num) {
			case 1:
				System.out.println("管理员登陆省略");
				break;
	        case 2:
	        	System.out.println("顾客登陆省略");
				break;
	         case 3:
	        	 System.out.println("退出");
	        	 System.out.println("退出成功");
	        	 flag=false;
		     break;

			default:
				System.out.println("输入错误,请重新输入!");
				break;
			}
			}
	}
	public static void test6()
	{
		boolean flag=true;
		while (flag) {
		System.out.println("1 矩形  2 三角形 3 圆 4 退出");
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
		case 4:
			flag = false;
			System.out.println("退出成功!");
			break;
		default:
			System.out.println("输入错误,请重新输入!");
			break;
		}
		
		}
	
	}
	public static void test7()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("输入一组数据:");
	    String number = "";
	    int max = 0;
	    do
	    {
	        number = sc.next();
	        try
	        {
	            max = Integer.parseInt(number) >= max ? Integer.parseInt(number) : max;
	        }catch(java.lang.NumberFormatException e)
	        {
	            System.out.println("非法输入");
	        }
	    }while(!number.toString().toLowerCase().equals("end"));
	    System.out.println("Max = "+max);
	}
	
	
	
	public static void test9()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入一个正数:");
		int num = sc.nextInt();
		
		int count = 0;
		
		while (num>0) {
			
			//循环除2,,如果不能整除就会出现1,计数变量++
			
			if (num% 2!= 0) {
				count++;
			}
			
			//下一次就是商作为被除数
			num = num/2;
		}
		System.out.println(count);
		
		
	}
	public static void test10()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入一个正数:");
		int num = sc.nextInt();
		
		int i = 2;//除数
		
		
		
		while (num>1) {
			
			//如果num能被i整除,输出i,num=num/i;
			
			if (num%i == 0) {
				
				System.out.print(i+" ");
				num/=i;
			}else {
				//否则 i++
				i++;
			}
			
		}
	}
	
	
	
	
}

	

	
