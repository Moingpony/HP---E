package work20180713;

import java.util.Scanner;

import org.junit.Test;

public class TestCylider {
	
	
	//第一个题测试
	
	@Test
	public void cylinder()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("输入半径和高:");
		double d1 = sc.nextDouble();
		sc.nextLine();
		double d2 = sc.nextDouble();
		Cylinder c = new Cylinder(d1, d2);
	 
		double volume = c.findVolume();
		
		System.out.println("圆柱体的体积:"+volume);
	}
	
	//练习1测试
	@Test
	public void testCircle1()
	{
		Circle1 c = new Circle1();
		 c.setRadius(3);
		 c.show();
		
	}
	@Test
	public void testCylinder()
	{
		System.out.println("输入半径和高:");
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		sc.nextLine();
		double h = sc.nextDouble();
		Cylinder1 c1 = new Cylinder1(r, h);
		Circle1 c = new Circle1();
		c.setRadius(r);
		c.show();
		c1.showVolume();;
	}
	
	
	
}
