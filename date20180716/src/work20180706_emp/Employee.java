package work20180706_emp;
//员工父类
public class Employee {
	//成员属性
	private String ID;
	private String name;
	private String position;
	private int holiday;
	private double salary;
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public int getHoliday() {
		return holiday;
	}
	public void setHoliday(int holiday) {
		this.holiday = holiday;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	//构造方法无参
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	//有参构造
	public Employee(String iD, String name, String position, int holiday, double salary) {
		super();
		ID = iD;
		this.name = name;
		this.position = position;
		this.holiday = holiday;
		this.salary = salary;
	}
	//工资计算方法
	public double sumSalary()
	{
		return salary;
	}
	//display
	public String display()
	{
		return "员工信息 [员工编号=" + ID + ", 员工姓名=" + name + ", 员工职务=" + position + ", 请假天数=" + holiday + ", 基本工资="
				+ salary + "]";
	}
	@Override
	public String toString() {
		return "Employee [ID=" + ID + ", name=" + name + ", position=" + position + ", holiday=" + holiday + ", salary="
				+ salary + "]";
	}
	
	
	
	
}
