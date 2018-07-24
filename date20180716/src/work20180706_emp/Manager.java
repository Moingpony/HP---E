package work20180706_emp;
//经理类
public class Manager extends Employee{

	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Manager(String iD, String name, String position, int holiday, double salary) {
		super(iD, name, position, holiday, salary);
		// TODO Auto-generated constructor stub
	}
	@Override
	public double sumSalary() {
		// TODO Auto-generated method stub
		return getSalary()+getSalary()*0.2+getSalary()*0.5+500;
	}

	@Override
	public String toString() {
		return  "员工信息 [员工编号=" + getID() + ", 员工姓名=" + getName() + ", 员工职务=" + getPosition() + ", 请假天数=" + getHoliday() + ", 基本工资="
				+ getSalary() + "]";
	}
	
	
}
