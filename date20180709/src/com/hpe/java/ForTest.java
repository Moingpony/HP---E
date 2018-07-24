package com.hpe.java;

import java.util.Scanner;

public class ForTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		test1();
//		test2();
//		test3();
//		test4();
//		test5();
		test6();
		
		
		
	}
	//打印10遍我爱你--while
	public static void test1()
	{
		int count = 0;
		while(count<10)
		{
			System.out.println("我爱你");
			
			count++;
			
		}
	}
	//打印10遍我爱你--for
	public static void test2()
	{
//		int count = 0;//次数
		
		for (int count = 0; count < 10; count++) {
			System.out.println("我爱你");
		}
	}
	//死循环
	public static void test3()
	{
//		int count = 0;//次数
		
		for (int count = 0;; count++) {
			System.out.println("我爱你");
		}
	}
	public static void test4()
	{
			
			for (int num = 100; num <= 999; num++) {
				int a = num/100 % 10;
				int b = num/10 % 10;
				int c = num%10;
				int sum = a*a*a+b*b*b+c*c*c;
				if (sum == num) {
					System.out.println(num);
					sum++;
				}	
			}
		}
	/*public static void test5()
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int x = 0;
		int y = 0;
		while(num!=0)
		{
			if(num<0)
			{
				System.out.println("负数");
				x++;
				System.out.println(x);
			}else {
				System.out.println("正数");
				y++;
				System.out.println(y);
			}
		}
		System.out.println("结束");
	}
	*/
		
	public static void test6()
	{
		for (int i = 1; i <= 9; i++) {
			for (int j = 0; j <= i; j++) {
				int ml = i*j;
//				if (j<9) {
////					System.out.println('\t');
					System.out.print(i+"*"+j+"="+ml+"\t");
//				}
				
				
			}
			System.out.println();
		}
	}
	}
	
