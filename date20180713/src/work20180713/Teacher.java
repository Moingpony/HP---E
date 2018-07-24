package work20180713;

public class Teacher extends Student1{
	
	private int major;
	//构造方法继承
	public Teacher(String name, int age, String sex, int major) {
		super(name, age, sex, major);
		this.major = major;
	}

	public int getMajor() {
		return major;
	}

	public void setMajor(int major) {
		this.major = major;
	}

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
