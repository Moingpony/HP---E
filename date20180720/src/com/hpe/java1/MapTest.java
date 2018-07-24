package com.hpe.java1;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class MapTest {
	
	//Map接口，map存放的都是键值对 key-value
	//key不允许重复，value可以重复
	//key和value都必须是引用类型的数据
	//HashMap
	
	//建议使用String作为键
	
	@Test
	public void test1()
	{
		
		Map map = new HashMap<>();
		
		map.put("aaa", "AAA");
		
		map.put("bbb", "BBB");
		
		map.put("ccc", "CCC");
		
		map.put("aaa","DDD");
		
		map.put("ddd", "DDD");
		
		System.out.println(map);
		
		
	}

}
