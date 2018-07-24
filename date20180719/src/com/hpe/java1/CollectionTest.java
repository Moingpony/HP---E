package com.hpe.java1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.junit.Test;

public class CollectionTest {
	
	@Test
	public void test()
	{
		
		Collection col = new ArrayList<>();//多态
		
		//使用add(Object)
		
		col.add("abc");
		col.add(1);
		col.add("bcd");
		col.add("abc");
		System.out.println(col);
		
		Collection col1 = new ArrayList<>();
		col1.add("aaa");
		col1.add("aaa");
		
		//addAll(Collection)
		
		col.addAll(col1);
		
		System.out.println(col);
		
		//clear()清空集合里的元素
		
//		col.clear();
		
		System.out.println(col);
		
		//isEmpty
		System.out.println(col.isEmpty());
		
		
		//remove(Object)
		
		System.out.println(col.remove("aaa"));
		System.out.println(col);
		
		//size()集合中元素的个数
		//length数:数组中
		//length():字符串的长度
		
		int count = col.size();
		System.out.println(count);
		
		
	}
	
	@Test
	public void test2()
	{
		
		Collection col = new ArrayList<>();
		
		col.add("123");
		col.add("abc");
		col.add(1);
		col.add("bcd");
		
		
		//如何遍历
		
		//方式一：增强for循环
		for (Object object : col) {
			System.out.println(object);
		}
		//方式二：使用迭代器Iterator
		
		//1.得到迭代器
		//如何得到迭代器，集合调用iterator()就得到当前集合的迭代器
		
		Iterator iterator = col.iterator();
		
		
		
		//2.迭代（遍历）
		
		
		while (iterator.hasNext()) {
			
			//到下一个元素
			Object object = iterator.next();
			System.out.println(object+"@");
			
			
			
		}
		
		
		
		
		
	}
	

}
