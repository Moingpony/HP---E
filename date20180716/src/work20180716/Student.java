package work20180716;

public class Student extends Person{

	private int sno;

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public Student(String name, int age, String sex, int sno) {
		super(name, age, sex);
		this.sno = sno;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String showInfo() {
		// TODO Auto-generated method stub
		return "Student [name=" + getName() + ", age=" + getAge() + ", sex=" + getSex() +",sno ="+sno+"]";
	}


	
	
}
