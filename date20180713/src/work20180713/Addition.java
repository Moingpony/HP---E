package work20180713;

import java.util.Scanner;

import org.junit.Test;

public class Addition {
	
/*	练习3
 * 编写Addition类，该类中应包含一组实现两数相加运算的重载方法。
	实现加法运算的方法，应接受两个参数（即加数和被加数），方法将两个参数进行加法运算后，返回相加结果。
	考虑可能针对不同的数据类型进行计算，重载一组方法，包括整型、长整型、浮点型、双精度浮点型、还有字符串。
	在main方法中创建Addition类的实例，分别调用重载方法测试其效果。
	应将Addition类打入到包中，以com.hpepm.java为包名。*/
	//创建实例
	@Test
	public void test()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("输入两个整形:");
		int a = sc.nextInt();
		sc.nextLine();
		int b = sc.nextInt();
		add(a, b);
		System.out.println("输入两个长整形:");
		long c = sc.nextLong();
		sc.nextLine();
		long d = sc.nextLong();
		add(c, d);
		System.out.println("输入两个浮点形:");
		float e = sc.nextFloat();
		sc.nextLine();
		float f = sc.nextFloat();
		add(e, f);
		System.out.println("输入两个双精度浮点形:");
		double g = sc.nextDouble();
		sc.nextLine();
		double h = sc.nextDouble();
		add(g, h);
		System.out.println("输入两个字符串:");
		String i = sc.nextLine();
//		sc.nextLine();
		String j = sc.nextLine();
		add(i, j);
	}
	//整形
	public void add(int a,int b)
	{
		int c = a+b;
		System.out.println(c);
		
	}
	//长整型
	public void add(long a,long b)
	{
		long c = a+b;
		System.out.println(c);
		
	}
	//浮点型
	public void add(float a,float b)
	{
		float c = a+b;
		System.out.println(c);
		
	}
	//双精度
	public void add(double a,double b)
	{
		double c = a+b;
		System.out.println(c);
		
		
	}
	//字符串
	public void add(String a,String b)
	{
		String c = a+b;
		System.out.println(c);
		
		
	}
}
