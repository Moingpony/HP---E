package com.hpe.java1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import org.junit.Test;

public class HashMapTest {
	
	@Test
	public void test()
	{

		Person p1 = new Person(11, "zhangsan");
		Person p2 = new Person(12, "lisi");
		Person p3 = new Person(13, "wangwu");
		
		Map<String, Person> map = new HashMap<>();
		
		map.put(p1.getName(), p1);
		map.put(p2.getName(), p2);
		map.put(p3.getName(), p3);
		
		showMap(map);
		
		
		//删除  从控制台输入一个名字，删除，如果存在就删除，如果不存在就打印无此人
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入删除人的名字：");
		
		String name = sc.nextLine();
		
		
		if (map.containsKey(name)) {
			
			//删除
			map.remove(name);
			System.out.println("删除成功");
			
		}
		else {
			System.out.println("无此人");
		}
		showMap(map);
		
		
//		修改，从控制台输入一个名字，完成修改，如果有就输入新的信息，如果没有就打印无此人
	/*	System.out.println("请输入修改人的名字：");
		
		name = sc.nextLine();
		
		if (map.containsKey(name)) {
			//修改
			
			//方式一：删除键值对再添加一个新的键值对
			
			map.remove(name);//删
			
			System.out.println("请输入新的名字：");
			
			String newName = sc.nextLine();
			
			System.out.println("请输入新的年龄：");
			
			int newAge = sc.nextInt();
			//添加
			map.put(newName, new Person(newAge,newName));
			
			System.out.println("修改成功");
			
			showMap(map);
			
			
		}
		else {
			System.out.println("无此人");
		}*/
		
		//方式二：
		
		
	/*	System.out.println("请输入新的年龄：");
		
		int newAge = sc.nextInt();
		map.put(name, new Person(newAge,name));
*/
		System.out.println("请输入新的年龄：");
		
		int newAge = sc.nextInt();
		
		map.get(name);
		Person person = map.get(name);
		person.setAge(newAge);

		
		
	}

	//打印map中的所有values
	public void showMap(Map<String, Person> map)
	{
		
	/*	
		Collection<Person> values = map.values();
		
		for (Person person : values) {
			System.out.println(person.getName()+"!");
		}
		*/
		
	/*	
		Set<String> keys = map.keySet();
		
		for (String key : keys) {
			System.out.println(map.get(key).getName()+"#");
		}*/
		
		Set<Entry<String,Person>> entrys = map.entrySet();
		
		for (Entry<String, Person> entry : entrys) {
			
			System.out.println(entry.getValue().getName()+"$");
			
		}
		
		
	}
	

}
