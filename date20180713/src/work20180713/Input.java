package work20180713;

import java.util.Scanner;

import org.junit.Test;

public class Input {
	
	/*第9题
	编写一个程序，从键盘接收十个整数，并输出其中的最小值，
	要求，将计算功能定义在一个类中，由主类负责接收输入，
	在用数组的方式传递给实现计算的类的方法，在输出结果*/
	@Test
	public void test()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("输入10个整数:");
		
		int i;
		int[] a = new int[10];
		
		for (i = 0; i < 10; i++) {
			a[i] = sc.nextInt();
		}
		min(a);
	}
	public void min(int[] a)
	{
		for (int i = 0; i < a.length-1; i++) {
			for (int j = 0; j < a.length-1-i; j++) {
				if (a[j]>a[j+1]) {
					int temp;
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
				
			}
		}
		System.out.println("最小值是:"+a[0]);
		
	}
	
}
