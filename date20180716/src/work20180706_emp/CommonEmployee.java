package work20180706_emp;
//普通员工
public class CommonEmployee extends Employee{
	
	//构造方法
	public CommonEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CommonEmployee(String iD, String name, String position, int holiday, double salary) {
		super(iD, name, position, holiday, salary);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double sumSalary() {
		// TODO Auto-generated method stub
		return getSalary()+getSalary()*0.1+getSalary()*0.5+200;
	}

	@Override
	public String toString() {
		return "员工信息 [员工编号=" + getID() + ", 员工姓名=" + getName() + ", 员工职务=" + getPosition() + ", 请假天数=" + getHoliday() + ", 基本工资="
				+ getSalary() + "]";
	}
	
	
}
