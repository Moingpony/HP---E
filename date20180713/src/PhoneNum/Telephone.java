package PhoneNum;

public class Telephone {

	private String name;
	private String sex;
	private int age;
	private String tel;
	private String qq;
	private String addr;
	public Telephone(String name, String sex, int age, String tel, String qq, String addr) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.tel = tel;
		this.qq = qq;
		this.addr = addr;
	}



	public Telephone() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() {
		return "添加信息: [姓名=" + name + ", 性别=" + sex + ", 年龄=" + age + ", 电话=" + tel + ", qq=" + qq + ", 地址="
				+ addr + "]";
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

	public String getTel() {
		return tel;
	}


	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}


	public String getAddr() {
		return addr;
	}


	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	
	
}
