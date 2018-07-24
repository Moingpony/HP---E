package com.hpe.java;

import org.junit.Test;

public class StringTest {
	
	
	
	
	//数组的长度---》数组.length属性
	
	//字符串的长度  --》字符串.length()方法
	
	@Test
	
	public void test1()
	{
		String str1 = "abc";
		String str2 = "abc";
		
		String str3 = new String("abc");
		
		System.out.println(str1.equals(str2));//true
		System.out.println(str1.equals(str3));//true
		
		System.out.println(str1==str2);//true
		
		System.out.println(str1==str3);//false
		
		//字符串是常量，它的值在创建之后就不能更改了
		
		str1+="def";
		System.out.println(str1);//abcdef
		System.out.println(str2);//abc
		System.out.println(str1==str2);//false
		
		//String是长度不了变的字符序列，不要频繁的对其进行字符串的拼接
		
		
		//如果需要频繁的对字符串进行拼接，建议使用StringBuffer
		//StringBuffer是长度可变的字符序列
		
		StringBuffer sb = new StringBuffer();
		
		//通过append方法来拼接字符串
		sb.append("abc");//扩容
		sb.append("def").append("ghi").append(1);
		System.out.println(sb);
		
		
		//String  Vs  StringBuffer
		
		//Sting是长度不可变的字符序列
		
		//StringBuffer是长度可变的字符序列（扩容）
		
//		StringBuffer vs String builder
		
		
	}
	
	@Test
	public void test3()
	{
		String str1 = "abcdef";
		
		System.out.println(str1.startsWith("def"));//false
		
		int compareRes = str1.compareTo("aBcc");
		
		System.out.println(compareRes);
		
		
		
		String str2 = str1.replace('b', 'B');
		System.out.println(str2);
		
		String str3 = str1.replaceAll("ef", "EF");
		System.out.println(str3);
		
		String str4 = "abc";
		String str5 = "def";
		String str6 = str4.concat(str5);
		System.out.println(str6);
		System.out.println(str6.indexOf("ab"));
		System.out.println(str6.indexOf('a'));
		System.out.println(str6.lastIndexOf("f"));
		
		
		String str7 = "abcabc";
		System.out.println(str7.indexOf("a", 0));
		String str8 = str7.substring(2);
		System.out.println(str8);
		
		String str9 = str7.substring(3, 5);//不包含后面的索引的数
		System.out.println(str9);
		
		String str10 = "   a   aa  b  c   ";
		
		String str11 = str10.trim();
		System.out.println(str11);
		
		String str12 = "a,b,c,d,e,f";
		
		String[] str13 = str12.split(",");
		
		for (String str : str13) {
			System.out.print(str);
		}
		
		System.out.println();
		char c = str12.charAt(2);
		System.out.println(c);
		
		
		
		
		
		
		
		
		
		
	}

}
