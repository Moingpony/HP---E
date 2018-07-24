package com.hpe.java;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import com.hpe.java1.Person;

public class setTest {
	
	//set：srt存放的元素是无序的，不可重复的
	
	@Test
	public void test()
	{
		Set set = new HashSet<>();
		
		set.add("abc");
		set.add("bcd");
		set.add("cde");
		set.add("def");
		
		Person p1 = new Person();
		Person p2 = new Person();
		
		set.add(p1);
		set.add(p2);
		
		//调用equals方法
		
		System.out.println(set);
		
		//两种遍历 foreach  迭代器
		
	}
	

}
