package com.hpe.work20180712;

import java.util.Scanner;

import org.junit.Test;

public class work20180712 {
	
	
	//1）求和
	@Test
	public void test1()
	{
		System.out.println("请输入两个数：");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.nextLine();
		int b = sc.nextInt();
		int add = add(a,b);
		System.out.println(add);
	}
	public int add(int a,int b)
	{

		int c = a+b;
		return c;
		
	}
	
	//2）判断相等
	@Test
	public void test2()
	{
		System.out.println("请输入两个数：");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.nextLine();
		int b = sc.nextInt();
		xiangdeng(a, b);
		
		
	}
	public void xiangdeng(int a,int b)
	{
		if (a==b) {
			System.out.println(a+"与"+b+"相等");
		}else {
			System.out.println(a+"与"+b+"不相等");
		}
		
	}
	
	//3）比较两个数的较大值
	@Test
	public void test3()
	{
		System.out.println("请输入两个数：");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.nextLine();
		int b = sc.nextInt();
		max1(a, b);
	}
	public void max1(int a,int b)
	{
		if (a>b) {
			System.out.println("较大的数是："+a);
		}else {
			int temp = 0;
			temp = a;
			a=b;
			b=temp;
			System.out.println("较大的数是："+a);
		}
	}
	
	//4)打印m*n  *型矩阵
	
	
	@Test
	public void test4()
	{
		System.out.println("请输入两个数：");
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		sc.nextLine();
		int n = sc.nextInt();
		print_1(m, n);
		
	}
	public void print_1(int m,int n)
	{
		for (int i = 0; i < m; i++) {
			System.out.println();
			for (int j = 0; j < n; j++) {
				System.out.print("*");
			}
		}
		
	}
	
	//打印n*n乘法表
	@Test
	public void test5()
	{
		System.out.println("请输入n：");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		n_n(n);
		
	}
	public void n_n(int n)
	{
		for (int i = 1; i <= n; i++) {
			System.out.println();
			for (int j = 1; j <= i; j++) {
				int k = i*j;
				System.out.print(i+"*"+j+"="+i*j+" ");
			}
		}
	}
	//calculate重载
	@Test
	public void test6()
	{
		System.out.println("请输入一个数：");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		calculate(a);
		System.out.println("请输入两个数：");
		int b = sc.nextInt();
		
		int c = sc.nextInt();
		calculate(b, c);
		sc.nextLine();
		System.out.println("请输入一个字符串：");
		String a1 = sc.nextLine();
		calculate(a1);
		
	}
	public void calculate(int a)
	{
		int b = a*a;
		System.out.println("平方："+b);
		
		
	}
	public void calculate(int a,int b)
	{
		int c = a*b;
		System.out.println("相乘："+c);
		
	}
	public void calculate(String a)
	{
		System.out.println(a);
		
		
	}
	
	@Test
	public void test7()
	{
		System.out.println("请输入两个数：");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.nextLine();
		int b = sc.nextInt();
		max_1(a, b);
		double c = sc.nextDouble();
		sc.nextLine();
		double d = sc.nextDouble();
		max_1(c, d);

		System.out.println("请输入第一个数:");
		
		double e = sc.nextDouble();
		
		System.out.println("请输入第二个数:");
		
		double f = sc.nextDouble();
		
		System.out.println("请输入第三个数:");
		
		double g = sc.nextDouble();
		
		max1_1(e, f, g);
		
		
	}
	public void max_1(int a,int b)
	{
		if (a>b) {
		System.out.println("较大的数是："+a);
	}else {
		
		System.out.println("较大的数是："+b);
		
	}
	if (a==b) {
		System.out.println("一样大！");
		}
		
		
	}
	public void max_1(double a,double b)
	{
		if (a>b) {
			System.out.println("较大的数是："+a);
		}else {
			
			System.out.println("较大的数是："+b);
			
		}
		if (a==b) {
			System.out.println("一样大！");
			}
			
		
		
		
	}
	public void max1_1(double a,double b,double c)
	{
		//如果a比b大,交换a跟b
				if (a>b) {
					double temp=a;
					a=b;
					b=temp;
				}
				
				//如果b比c大,交换c跟b   c最大
				if (b>c) {
					double temp=b;
					b=c;
					c=temp;
				}
				
				//如果a比b大,交换a跟b
				if (a>b) {
					double temp=a;
					a=b;
					b=temp;
				}
				System.out.println("最大值是："+c);
		
		
	}

}

