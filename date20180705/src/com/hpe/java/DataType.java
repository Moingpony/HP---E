package com.hpe.java;

public class DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
		long b = 2;//自动类型转换
		
		float d= 4.4f;
		
		char e = '\n';
		
		double g = 41.1;
		
		float f = (float) g;
		
		int h = (int)(a+1.1);
		
		System.out.println('a'+1);
		String i = "2";
		//"2"+"1"
		System.out.println(i+a);
		
		int j = Integer.parseInt(i);//重点
		System.out.println(j+a);
		System.out.println('a'+1+"abc");
		System.out.println('a'+"abc"+1);
		System.out.println("abc"+'a'+1);
		
		String k = "11.11";
		
		double parseDouble = Double.parseDouble(k);
		System.out.println(parseDouble+1);
		System.out.println(parseDouble);
		
		//++在前，先自加后运算，++在后，先运算后自加。
		int m = 3;
		int n=m++;
		System.out.println(m);
		System.out.println(n);
		if (m++==4) {
			System.out.println("abc");
			
		}
		int r = 2;
		int s = 2;
		if (r>s && ++r==s) {
			System.out.println("abc");
		}
		System.out.println(r);
		
		//三元运算符
		
		int t = 3;
		int u =4;
		int v = (t>u)?t+3 : u+4;
		System.out.println(v);
		
		short aaa = 1;//窄化转化
		//byte、short、char转化int类型
		aaa += 1;//自动做了强制类型装换 aaa = (short)(aaa+1);
		
		
		
		
	}

}
