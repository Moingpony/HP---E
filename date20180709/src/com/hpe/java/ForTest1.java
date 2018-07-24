package com.hpe.java;

public class ForTest1 {
	public static void main(String[] args) {
//		test1();
		test2();
	}
	
	//for循环嵌套
	
	public static void test1()
	{
		for (int i = 0; i < 3; i++) {
			
			
			
			for (int j = 0; j < 3; j++) {
				
				System.out.println("i:"+i+",j:"+j);
				
			}
			
			
		}
	}
	public static void test2()
	{
		//for循环嵌套--水仙花
		for (int a = 1; a <= 9; a++) {//百
			for (int b = 0; b <= 9; b++) {//十
				for (int c = 0; c <= 9; c++) {//个
					//计算数值
					int sum = a*100+b*10+c;
					int num = a*a*a+b*b*b+c*c*c;
					if (sum == num) {
						System.out.println(""+a+""+b+""+c);
					}	
				}	
			}	
		}
	}
	
	
}
