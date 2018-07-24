package com.hpe.java;

import java.util.Date;


//快捷键
//1.提示快捷键 ALT+/
//2.单行注释快捷键（添加和取消）：Ctrl+/
//3.多行注释快捷键  Ctrl+shift+/  /*....*/
//4.取消多行注释快捷键  Ctrl+shift+\
//5.文档注释 /**
/**
 *
 * @author shary
 *
 */
//6.调整格式：Ctrl+shift+f
//7.删除快捷键:Ctrl+d
//8.换行快捷键:shift+Enter
//9.上下移动 Alt+方向键（上或下）
//10.向上向下复制 ：Ctrl+Alt+方向键（上或下）
//11.搜索类或接口: Ctrl+shift+t
//12.查看类的成员:ctrl+o
//13.导入或取消类的快捷键：Ctrl+shift+o



public class HelloJava {
	int a=1;//成员变量

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.out.println("HelloJava!");
		System.out.println("HelloWorld!");


	}
	public static void  method1() {
		//定义变量的格式：类型 变量名=初始值
		int b = 1;	//局部变量
		Date date = new Date();

	}
	public static void  method2() {
		//变量作用范围：仅在大括号内有效
		//a = 100;

	}
	//变量分类
	//1.按声明位置不同：局部变量和成员变量
	// 局部变量：方法中，代码块中。
	// 成员变量：类的内部，方法的外部
	//2.按数据类型划分：基本数据类型变量、引用数据类型变量
	// 

}
