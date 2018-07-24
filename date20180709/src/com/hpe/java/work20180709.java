package com.hpe.java;

import java.util.Scanner;


public class work20180709 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		test1();
//		test2_1();
//		test2_2();
//		test3();
		
//		test3 方法2：
	/*	Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个整数：");
		int num = sc.nextInt();
		boolean res = isSuShu(num);
		if (res) {
			System.out.println(num+"是质数");
		}else {
			System.out.println(num+"不是质数");
		}
		*/
		
		
//		test4();
//		test5();
//		test6();
		test7();
//		test8();
//		test9();
	}
	//练习1
	
	public static void test1()
	{	
		int sum= 0;
		for (int i = 2; i <= 100; i+=2) {
			sum+=i;
		}
		System.out.println(sum);
	}
	
	//练习2第一种
	
	public static void test2_1()
	{
		
		
			for (int i = 1; i <= 9; i++) {
				for (int j = 1; j <= 9; j++) {
					int ml = i*j;
					
						System.out.print(i+"x"+j+"="+ml+"\t");

					
					
				}
				System.out.println();
			}
		}
	
	//练习2第二种
	
	public static void test2_2()
	{
		
			for (int i = 1; i <= 9; i++) {
				for (int j = 1; j <= i; j++) {
					int ml = i*j;
//					if (j<9) {
////						System.out.println('\t');
						System.out.print(j+"x"+i+"="+ml+"\t");
//					}
					
					
				}
				System.out.println();
			}
		}
	//练习3
	/*所谓素数（又叫质数）是指只能被1和它本身整除的数字，1除外。
	输入一个正整数，判断是否为素数。*/
	public static void test3()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个整数:");
		int a = sc.nextInt();
		int b = 0;
		int i = 0;
		if (a==2) {
			System.out.println(a+"是素数");
			
		}
		for (i = 2; i < a; i++){
			
			if (a%i == 0) {
				System.out.println(a+"不是素数");
				b=1;
				break;
			}
		}
			if (b==0) {
				System.out.println(a+"是素数");
				
			}
			
	}
	
	// 方法2：
	
	public static boolean isSuShu(int num)
	{
		//只能被1和它本身整除
		
		//从2-num-1，有一个数能整除，那么num就不是质数（返回false）
		if (num==1) {
			return false;
		}
	
		
		for (int i = 2; i <= num-1; i++) {
			//如果num%i==0,能整除，不是质数，return false；
			if (num%i==0) {
				return false;
			}
			
		}
		//是质数
		return true;
	}
	
	
//	练习4
	/*打印出100以内的质数，一行显示5个，（质数是只能被1跟自身整除的数，1不是质数）*/
	public static void test4()
	{
		int i;
		int j=0;
		int k=0;
		for (j = 0; j <= 100; j++) {
			i=2;
			while (i<j) {
				if (j%i==0) {
					break;
				}
				i++;				
			}
			if (i==j) {
				k++;
				System.out.print(i+"\t");
				if (k%5==0) {
					System.out.println();
					
				}	
			}
		}	
	}
	
	
	//练习5
	/*循环录入5个人的年龄，并计算平均年龄，
	如果录入的数据出现负数或者大于130的数，立即停止输出报错（无需打印平均年龄）*/
	public static void test5()
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
	public static void test6()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("请输入一个正整数n");
		int num=in.nextInt();
		int sum=1;
		for(int i=1;i<=num;i++){
			sum=sum*i;
		}
		System.out.println("sum="+sum);
	}
	
	public static void test7()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入高度(行):");
		int n1= sc.nextInt();
		for (int n = 1; n <= n1; n++) {
			for (int h = n1-n; h >= 0; h--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2*n-1; k++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
		/*for (int i = 1; i <= 5; i++) {
			for (int j = 5-i; j >= 0; j--) {
				System.out.print(" ");
				
			}
			for (int k = 1; k <= 2*i-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}*/
	}
	
	
	public static void test8()
	{
		int n=1;
		int k=0;
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 33; j++) {
				k = 100-j-i;
				if (k%3==0&&(5*i+3*j+k/3 ==100)) {
					System.out.print("买法:"+n++);
					System.out.println("公鸡"+i+"母鸡"+j+"小鸡"+k);
				}
				
			}
			
		}
		
		
	}
	
	public static void test9()
	{
		int a,b,c,d;
		System.out.println("回文数有:");
		for (a = 1000; a < 10000; a++) {
			b=a;
			d=0;
			while (b>0) {
				c= b%10;
				d=d*10+c;
				b=b/10;
			}
			if (a==d) {
				System.out.println(a+"\t");
			}
			
		}
		}
	
}
