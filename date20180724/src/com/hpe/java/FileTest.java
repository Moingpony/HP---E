package com.hpe.java;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

//File与平台无关的文件或者文件夹
/*File能新建.删除.重命名文件或者目录,但File 不能访问文件内容本身.
如果需要访问文件本身,则需要使用输入/输出流*/
public class FileTest {
	
	@Test
	public void test1()
	{
		
		//相对路径和绝对路径
		//相对路径:相对于当前工程的路径
		//绝对路径:带着盘符的
		File file = new File("D:\\1.txt");
	
		File file1 = new File("D:\\1");
		
		//getName()
		
		String name = file.getName();
		
		System.out.println(name);
		
		System.out.println(file1.getName());
		
		File file2 = new File("2.txt");
	}
	
	@Test
	public void test2()
	{
		File file = new File("D:\\1.txt");
		File file1 = new File("D:\\1");
		System.out.println(file.getName());
		System.out.println(file.getPath());
		System.out.println(file.getAbsolutePath());//String
		System.out.println(file.getAbsoluteFile());//File
		System.out.println(file.getParent());
		
		System.out.println("---------------------");
		
		System.out.println(file1.getName());
		System.out.println(file1.getPath());
		System.out.println(file1.getAbsolutePath());//String
		System.out.println(file1.getAbsoluteFile());//File
		System.out.println(file1.getParent());
		System.out.println("---------------------");
		
		File file2 = new File("2.txt");
		System.out.println(file2.getName());
		System.out.println(file2.getPath());
		System.out.println(file2.getAbsolutePath());//String
		System.out.println(file2.getAbsoluteFile());//File
		
		
		//剪切重命名 :file.renameTo
		//file必须存在,file2不存在
		File file3 = new File("D:\\2.txt");
		
		System.out.println(file.renameTo(file3));
		
		File file4 = new File("D:\\3.txt");
		
		System.out.println(file.exists());
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		
		long lastModified = file.lastModified();
		System.out.println(lastModified);
		
		
	}
	
	
	@Test
	public void test3() throws IOException
	{
		File file = new File("D:\\11.txt");
		
		if (!file.exists()) {
			
			//创建
			
			file.createNewFile();		
			
		}
		File file1 = new File("D:\\2");
		
		if (!file1.exists()) {
			
			//创建目录
			file1.mkdir();
			
		}
		File file2 = new File("D:/Program Files");
		String[] list = file2.list();
		
		for (String string : list) {
			System.out.println(string);
	}
	}

}
