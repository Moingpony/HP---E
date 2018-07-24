package work20180713;

//生成3个学生实例，调用学生实例的showInfo方法,属性包含姓名，年龄，性别，学号
/*思路：
1.创建一个学生类，
2.在main去实例化（创建）三个学生对象。
3.调用对象的showInfo方法，也就是说打印学生的信息
*/
public class Student1 {

	//成员变量
	private String name;
	private int age;
	private String sex;
	private int sno;
	
	public Student1(String name, int age, String sex, int sno) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.sno = sno;
	}

	public Student1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String showInfo(String name, int age, String sex, int sno)
	{
		return "name=" + name + ", age=" + age + ", sex=" + sex + ", sno=" + sno;
	}
	
	@Override
	public String toString() {
		return "Student1 [name=" + name + ", age=" + age + ", sex=" + sex + ", sno=" + sno + "]";
	}
	
	
	
	
	
}
