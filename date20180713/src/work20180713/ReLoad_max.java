package work20180713;

import org.junit.Test;

//练习5

/*定义3个重载方法max，
第一个方法求两个int值中的最大值，
第2个方法求三个int值中的最大值，
第3个方法求四个int值中的最大值，
并分别调用三个方法*/
public class ReLoad_max {
	@Test
	public void test()
	{
		int a = max(3, 4);
		System.out.println("最大值是:"+a);
		int b= max(3, 6, 5);
		System.out.println("最大值是:"+b);
		int c =max(6, 4, 8, 1);
		System.out.println("最大值是:"+c);
		
	}
	
/*	public void max(int a,int b)
	{
		if (a>b) {
			System.out.println("最大值是:"+a);
		}else if (a<b) {
			System.out.println("最大值是:"+b);
		}else {
			System.out.println("相等!");
		}
		
	}
	public void max(int a,int b, int c)
	{
		int max;
		max = a>b?a:b;
		max = c>max?c:max;
		System.out.println("最大值是:"+max);
		
	}*/
	public int max(int a,int b)
	{
		
		if (a>b) {
			return a;
		}else {
			return b;
		}
	}
	
	public int max(int a,int b,int c)
	{
		
		if (max(a,b)>c) {
			return max(a,b);
		}else {
			return c;
		}
	}
	
	public int max(int a,int b,int c,int d)
	{
		
		if (max(a,b,c)>d) {
			return max(a,b,c);
		}else {
			return d;
		}
		
	}
}



