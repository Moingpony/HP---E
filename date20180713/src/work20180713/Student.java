package work20180713;

public class Student {
	//成员变量
	
	private int sno;
	private String name;
	private String sex;
	private int age;
	private double sjava;
	
	//带参构造方法
	public Student(int sno, String name, String sex, int age, double sjava) {
		super();
		this.sno = sno;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.sjava = sjava;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

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

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSjava() {
		return sjava;
	}

	public void setSjava(double sjava) {
		this.sjava = sjava;
	}

	@Override
	public String toString() {
		return "Student [sno=" + sno + ", name=" + name + ", sex=" + sex + ", age=" + age + ", sjava=" + sjava + "]";
	}
	
	
	
	
}
