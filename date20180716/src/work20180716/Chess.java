package work20180716;

import java.util.List;

public class Chess {
	private int num;//个数
	private String color;//颜色
	private List list;
	
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public List getList() {
		return list;
	}
	public void setList(List list) {
		this.list = list;
	}
	
	
	
	//有参构造
	public Chess(int num, String color) {
		super();
		this.num = num;
		this.color = color;
	}
	
	//无参
	public Chess() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//rule方法
	public void rule()
	{
		System.out.println("这是一条父类规则");
	}
	
	
	@Override
	public String toString() {
		return "Chess [num=" + num + ", color=" + color + "]";
	}
	
}
