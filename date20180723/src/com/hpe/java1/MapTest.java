package com.hpe.java1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap.KeySetView;

import org.junit.Test;

public class MapTest {
	
	//Map接口，map存放的都是键值对 key-value（根据键去找值）
	//key不允许重复，value可以重复
	//key和value都必须是引用类型的数据
	//HashMap
	
	//建议使用String作为键key
	
	@Test
	public void test1()
	{
		
		Map map = new HashMap<>();
		
		map.put("aaa", "AAA");
		
		map.put("bbb", "BBB");
		
		map.put("ccc", "CCC");
		
		map.put("aaa","DDD");
		
		map.put("ddd", "DDD");
		
		Person p1 = new Person();
		Person p2 = new Person();
		
		map.put(p1, "SSS");
		
		map.put(p2, "XXX");
		
		System.out.println(map);
		
		
		//删除（根据键来删除键值对）remove（Object key）,返回值是要删除的键所对应的值
		Object removeRes = map.remove("aaa");
		System.out.println(removeRes);
		
		System.out.println(map);
		
		//查找Object get(Object key),根据指定的键来查找这个键所对应的值
		
		Object object = map.get("bbb");
		
		System.out.println(object);
		
		//判断map集合中是否存在此键，boolean containsKey(Object key)
		
		System.out.println(map.containsKey("aaa"));//false
		
		//判断map集合中是否存在此值，boolean containsValue(Object value)
		
		System.out.println(map.containsKey("BBB"));
		
		//map中元素（键值对）的个数 int size()
		
		System.out.println(map.size());
		
		//boolean isEmpty()
		
		System.out.println(map.isEmpty());
		
		
		
		
		
	}
	
	@Test
	public void test2()
	{
		Map map = new HashMap<>();
		
		map.put("aaa", "AAA");
		
		map.put("bbb", "BBB");
		
		map.put("ccc", "CCC");
	
		map.put("ddd", "DDD");
		
		//遍历所有的键
		
		//使用keySet（），得到所有的键构成的集合
		
		Set kSet = map.keySet();
		
		for (Object object : kSet) {
			System.out.println(object+"!");
		}
		
//		二
		
		Iterator iterator = kSet.iterator();
		
		while (iterator.hasNext()) {
			Object obj = iterator.next();
			System.out.println(obj+"@");
		}
		
	}

	
	
	@Test
	public void test3()
	{
		
		
		Map map = new HashMap<>();
		
		map.put("aaa", "AAA");
		
		map.put("bbb", "BBB");
		
		map.put("ccc", "CCC");
		
		
		map.put("ddd", "DDD");
		
		//遍历所有的值
		//values(),可以得到所有制构成的一个Collection集合
		
		Collection values = map.values();
		
		//一
		for (Object object : values) {
			System.out.println(object+"!");
		}
		//二
		
		Iterator iterator =values.iterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next()+"$");
		}
		
		
		//三  遍历所有的值 -->遍历所有的键(根据键去找值)
		
		//1.得到所有键构成的集合
		
	
		
		
		
		//2.遍历集合得到所有的键,同时得到所有的值
		
		Set ketset = map.keySet();
		
		for (Object obj : ketset) {
			
			//根据键找到值
			
			Object object = map.get(obj);
			
			System.out.println(object+"%");
			
			
		
			
		}
		
		
	
		Iterator iterator2 = ketset.iterator();
		
		while (iterator.hasNext()) {
			System.out.println(map.get(iterator2.next())+"!");
		}
		
			
		
	}
		

	
	
	//key--->value
	
	@Test
	
	public void test4()
	{
		
		Map map = new HashMap<>();
		
		map.put("aaa", "AAA");
		
		map.put("bbb", "BBB");
		
		map.put("ccc", "CCC");
		
		
		map.put("ddd", "DDD");
		
		Set keys = map.keySet();

		for (Object key : keys) {
			
			//根据键找值

			System.out.println(key+"--->"+map.get(key));
		}
		
		Iterator iterator = keys.iterator();
		
		while (iterator.hasNext()) {
			Object key = iterator.next();
			Object value = map.get(key);
		}
		
		//entrySet Set
		
		Set entrySet = map.entrySet();  //Entry集合
		
		for(Object obj:entrySet)
		{
			Map.Entry entry =(Entry) obj;
			Object key = entry.getKey();
			Object value = entry.getValue();
			
			System.out.println(key+"--->"+value);
		}
		
		
		
		
	}
	
	//Map表示对象
	//Map表示对象集合
	
	@Test
	public void test5()
	{
		Person p1 = new Person(11, "zhangsan");
		
		//Map表示对象（age 11,name zhangsan）
		
		Map map = new HashMap<>();
		
		map.put("age", 11);
		map.put("name", "zhangsan");
		
		
	}
	
	@Test
	
	public void test6()
	{
		Person p1 = new Person(11, "zhangsan");
		Person p2 = new Person(12, "lisi");
		Person p3 = new Person(13, "wangwu");
		
		List list  = new ArrayList();
		list.add(p1);
		list.add(p3);
		list.add(p3);
		
		//Map表示对象（age 11,name zhangsan）
		
		Map map1 = new HashMap<>();
		
		map1.put("age", 11);
		map1.put("name", "zhangsan");
		
		Map map2 = new HashMap<>();
		
		map2.put("age", 12);
		map2.put("name", "lisi");
		
		Map map3 = new HashMap<>();
		
		map3.put("age", 13);
		map3.put("name", "wangwu");
		
		
		
		List<Map> list1 = new ArrayList<>();
		list1.add(map1);
		list1.add(map2);
		list1.add(map3);
		
	}
	
	
	
	
	

	
	
}
