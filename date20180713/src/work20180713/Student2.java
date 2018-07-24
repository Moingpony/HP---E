package work20180713;

import java.util.Arrays;

public class Student2 {
	/*练习7
	建立一个学生类，其中成员变量为学号、姓名、及三门课的成绩（数组），
	另建立一个包含主方法的类，定义2个学生类的对象*/
	private int sno;
	private String name;
	private int[] schengji;
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int[] getSchengji() {
		return schengji;
	}
	public void setSchengji(int[] schengji) {
		this.schengji = schengji;
	}
	
	
	public Student2(int sno, String name, int[] schengji) {
		super();
		this.sno = sno;
		this.name = name;
		this.schengji = schengji;
	}
	
	
	public Student2() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student2 [sno=" + sno + ", name=" + name + ", schengji=" + Arrays.toString(schengji) + "]";
	}
	
	
	
}
