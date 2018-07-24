package com.hpe.java;

public class ContinueTest {
	
	//结束当前这次循环,继续进行下一次循环

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		test1();
		test2();
	}
	public static void test1()
	{
		for (int i = 0; i < 3; i++) {
			if (i == 1) {
				continue;
			}
			
			System.out.println(i);
		}
	}
	public static void test2()
	{
		for (int i = 0; i < 3; i++) {
			if (i == 1) {
				continue;
			}
			for (int j = 0; j < 3; j++) {
			
				
				System.out.println("i:"+i+",j:"+j);
			}
		
		}
	}
	

}
