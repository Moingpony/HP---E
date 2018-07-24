package com.hpe.java;

import java.util.Scanner;

import org.junit.Test;

public class homework20180711 {
	
	@Test
	public void test1()
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("输入一个正整数:");
		int num = sc.nextInt();
		zhishu(num);
		
		
	}
	//求质数因子
	public void zhishu(int a)
	{
		int i = 2;
		System.out.print(a+"=");
		while (a>1) {
			if (a%i == 0) {
				
				a/=i;
				if (a<2) {
					System.out.println(i);
				}else {
					System.out.print(i+"*");
				}
			
			
				
			}else {
				i++;
				
			}
		}
		
	}
	@Test
	public void test2()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("输入a:");
		int a = sc.nextInt();
	
		System.out.println("输入个数:");
		int n = sc.nextInt();
		add1(a,n);
		
	}
	
	public void add1(int a,int n)
	{
		int sum = 0;
		int b = 0;
		for (int i = 0; i <= n; i++) {
			
			
			b+=a;
			a=a*10;
			sum+=b;
			if (i==n) {
				System.out.print(b+"=");
			}else {
				System.out.print(b+"+");
			}
			
		
		}
		System.out.println(sum);
		
	}
	
	@Test
	public void test3()
	{
		homework20180711 test3 = new homework20180711();
		int[] a = test3.input();
		test3.print(a);
		
		
	}
	
	public int[] input()
	{
		int[] a = new int[7];
		
		for (int i = 0; i < 7; i++) {
			System.out.println("请输入第"+(i+1)+"个数:");
			Scanner sc = new Scanner(System.in);
			a[i] = sc.nextInt();
			
		}
		return a;	
		
	}
	public void print(int[] a)
	{
		for (int i = 0; i < a.length; i++) {
			for (int j = 1; j <= a[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	@Test
	public void test4()
	{
		System.out.println("1-1000完数有:");
		wanshu();
		
	}
	public void wanshu()
	{
		for (int i = 1; i < 1000; i++) {
			int sum = 0;
			for (int j = 1; j <i/2+1; j++) {
				if (i%j==0) {
					sum+=j;
				}
			}
			if (sum==i) {
				System.out.println(i+" ");
			}
		}
		
	}
	
	
	@Test
	public void test5()
	{
		
		int count = 0;
		
		for (int i = 1; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				for (int k = 0; k < 4; k++) {
					count++;
					System.out.println(i*100+j*10+k);
				}
				
			}
			
		}System.out.println("个数:"+count);
		
	}
	
	@Test
	public void test6()
	{
		int cen = 11;
		for (int i = 0; i <= cen; i++) {
			if (i<=(cen+1)/2) {
				for (int j = (cen+1)/2-i; j >0 ; j--) {
					System.out.print(" ");
					
				}
				for (int k = 1; k <= 2*i-1; k++) {
					System.out.print("*");
				}
			}
			else {
				for (int m = 1; m <= i-(cen+1)/2; m++) {
					System.out.print(" ");
				}
				for (int n = (cen-i)*2+1; n > 0; n--) {
					System.out.print("*");
				}
			}
			System.out.println();
			
		}
	}
	
	//分桃最少问题
	@Test
	public void test7()
	{

		
		int sum = 1;
		for (int i = 0; i < 5; i++) {
			sum=sum*5+1;
			
		}
		System.out.println(sum);
}
	
	//数组逆序输出
	
	@Test
	public void test_1()
	{
		int[] a = {1,2,3,4,5,6,7,8,9};
		for (int i = a.length-1; i >=0 ;i--) {
			
			System.out.print(a[i]+" ");
			
		}
		
	}
	
	//取整数a右端开始的4-7位
	
	@Test
	public void test_2()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("输入一个7-9位的整数:");
		String num = sc.nextInt()+" ";
		char[] str = new char[num.length()];
		for (int i = 0; i < num.length(); i++) {
			str[i] = num.charAt(i);
		}
		
		
		for (int i = str.length-4; i > str.length-8; i--) {
			System.out.print(str[i]+" ");
		}
		
	}
	
	//杨辉三角
	
	@Test
	public void test_3()
	{
		int[][] a = new int[10][10];
		
		a [0] = new int[]{1};
		
		for (int i = 1; i < 10; i++) {
			a[i] = new int[i+1];
			for (int j = 0; j < i+1; j++) {
				if (j==0||j==i) {
					a[i][j]=1;
					
				}else {
					a[i][j] = a[i-1][j]+a[i-1][j-1];
					
				}
				
			}
			
		}
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10-i-1; j++) {
				System.out.print("  ");
			}
			for (int j = 0; j <= i; j++) {
			
				String arr = ""+a[i][j];
				if (arr.length()==1) {
					arr = "" +arr+" ";
					
			}
				if (arr.length()==2) {
					arr = " "+arr;
				}
				System.out.print(arr+" ");
			
			}
			System.out.println();
		}
	}
	
	//最大最小元素交换
	
	
	@Test
	public void test_4()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("输入一个10个元素:");
		int[] a = new int[10];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		int b = new homework20180711().getMax(a);
		int c = new homework20180711().getMin(a);
		for (int i = 0; i < a.length; i++) {
			if (b==a[i]) {
				int temp = a[i];
				a[i] = a[0];
				a[0] = temp;
				/*int temp = a[a.length-1];
				a[a.length-1] = a[i];
				a[i] = temp;*/
			}
		}
		for (int i = 0; i < a.length; i++) {
			if (c==a[i]) {
				int temp = a[a.length-1];
				a[a.length-1] = a[i];
				a[i] = temp;
			}
		}
		show(a);
		
	}
	public int getMax(int[] arr)
	{
		//求数组中的最大值
		
		int max = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			if (arr[i]>max) {
				
				max = arr[i];
				
			}
		}
		return max;
		
	}
	
	public int getMin(int[] arr)
	{
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i]<min) {
				
				min = arr[i];
				
				
			}
		}
		return min;
	}
	public void show(int[] arr)
	{
		//遍历
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	
	//移动位置
	
	
	@Test
	public void test_5()
	{
		int n = 10;
		int[] a = new int[n];
		Scanner s = new Scanner(System.in);
		System.out.println("请输入10个整数：");
		for(int i=0; i<n; i++) {
		 a[i] = s.nextInt();
		}
		 System.out.print("你输入的数组为：");
		   for(int i=0; i<n; i++) {
		     System.out.print(a[i] + " ");
		   }
		   System.out.print("\n请输入向后移动的位数：");
		   int m = s.nextInt();
		   int[] b = new int[m];
		   for(int i=0; i<m; i++) {
			   b[i] = a[n-m+i];
		   }
		   for(int i=n-1; i>=m; i--) {
			   a[i] = a[i-m];
		   }
		   for(int i=0; i<m; i++) {
			   a[i] = b[i];
		   }
		System.out.print("位移后的数组是：");
		   for(int i=0; i<n; i++) {
		    System.out.print(a[i] + " ");
		   }
		  
		}
	@Test
	public void test8()
	{
		Scanner in = new Scanner(System.in);
		int[] a = new int[10];
		int num;
		int sum = 0,max = a[0],min = a[0];
		double aver = 0.0;
		System.out.println("10:");
		for (int i = 0; i < a.length; i++) {
			num=in.nextInt();
		
			a[i]=num;
			System.out.println(a[i]);
			System.out.println(num);
			if(a[i]<min) {
				System.out.println(a[i]);
				min = a[i];
				
			}
		}
		System.out.println(min);
	}

}

	
	
	
	


