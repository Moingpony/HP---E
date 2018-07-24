package work20180706_emp;
//董事类
public class Director extends Employee{

	public Director() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Director(String iD, String name, String position, int holiday, double salary) {
		super(iD, name, position, holiday, salary);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public double sumSalary() {
		// TODO Auto-generated method stub
		return getSalary()+getSalary()*0.08+getSalary()*0.3+2000+3000;
	}

	@Override
	public String toString() {
		return "员工信息 [员工编号=" + getID() + ", 员工姓名=" + getName() + ", 员工职务=" + getPosition() + ", 请假天数=" + getHoliday() + ", 基本工资="
				+ getSalary() + "]";
	}
}
