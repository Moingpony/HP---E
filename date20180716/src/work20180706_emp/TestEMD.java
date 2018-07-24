package work20180706_emp;

import java.util.Scanner;

public class TestEMD {
	private static Scanner sc = new Scanner(System.in);
	private static Employee[] ems = new Employee[100];
	private static CommonEmployee c;
	private static Manager m;
	private static Director d;
	
	
	public static void main(String[] args) {
		while (true) {
		
		System.out.println("|--------------|");
		System.out.println("|--- 1   增加 ---|");
		System.out.println("|--- 2   删除 ---|");
		System.out.println("|--- 3   修改 ---|");
		System.out.println("|--- 4   查询 ---|");
		System.out.println("|--- 0   退出 ---|");
		System.out.println("|--------------|");
		
		System.out.println("请选择业务：");
		
		int n = sc.nextInt();
		switch (n) {
		case 1:
			addEmployee();
			break;
		case 2:
			delEmployee();
			break;
		case 3:
			updateEmployee();
			break;
		case 4:
			queryEmployee();
			break;
		case 0:
			System.out.println("输入错误!");
			break;

		default:
			break;
		}
		
	}
	}
	
	public static void addEmployee()
	{
		//增加
		
		System.out.println("请输入员工编号：");
		sc.nextInt();
		String ID = sc.nextLine();
		System.out.println("请输入员工姓名：");
		String name = sc.nextLine();
		System.out.println("请输入员工职务：");
		String position = sc.nextLine();
		System.out.println("请输入员工请假天数：");
		int holiday  = sc.nextInt();
		System.out.println("请输入员工基本工资：");
		double salary = sc.nextDouble();
		
		if (position.equals("普通员工")) {
			c = new CommonEmployee();
			c.setID(ID);
			c.setName(name);
			c.setPosition(position);
			c.setHoliday(holiday);
			c.setSalary(salary);
			
			for (int i = 0; i < ems.length; i++) {
				if (ems[i]==null) {
					ems[i]=c;
					System.out.println(c.toString());
					System.out.println("添加数据成功!");
					break;
				}
			}
		}else if (position.equals("经理")) {
			m = new Manager();
			m.setID(ID);
			m.setName(name);
			m.setPosition(position);
			m.setHoliday(holiday);
			m.setSalary(salary);
			
			for (int i = 0; i < ems.length; i++) {
				if (ems[i]==null) {
					ems[i]=m;
					System.out.println("添加数据成功!");
					break;
				}
			}
		}else if (position.equals("董事")) {
			d  = new Director();
			d.setID(ID);
			d.setName(name);
			d.setPosition(position);
			d.setHoliday(holiday);
			d.setSalary(salary);
			
			for (int i = 0; i < ems.length; i++) {
				if (ems[i]==null) {
					ems[i]=d;
					System.out.println("添加数据成功!");
					break;
				}
			}
		}else {
			System.out.println("职位输入错误!");
		}
	}
	
	//删除数据
	public static void delEmployee()
	{
		System.out.println("请输入员工姓名:");
		String name = sc.nextLine();
		for (int i = 0; i < ems.length; i++) {
			if (ems[i]!=null) {
				if (ems[i].getName().equals(name)) {
					System.out.println(ems[i].toString());
					ems[i]=null;
					System.out.println("删除数据成功");
					break;
				}
			}
		}
	}
	
	//修改数据
	public static void updateEmployee()
	{
		System.out.println("请输入员工姓名:");
		String name = sc.nextLine();
		int i = 0;
		for (; i < ems.length; i++) {
			if (ems[i]!=null) {
				if (ems[i].getName().equals(name)) {
					System.out.println(ems[i].toString());
					System.out.println("请重新输入员工信息:");
					
					System.out.println("请输入员工编号：");
					String ID = sc.nextLine();
					System.out.println("请输入员工姓名：");
					String name_1 = sc.nextLine();
					System.out.println("请输入员工职务：");
					String position = sc.nextLine();
					System.out.println("请输入员工请假天数：");
					int holiday  = sc.nextInt();
					System.out.println("请输入员工基本工资：");
					double salary = sc.nextDouble();
					if (position.equals("普通员工")) {
						c = new CommonEmployee();
						c.setID(ID);
						c.setName(name_1);
						c.setPosition(position);
						c.setHoliday(holiday);
						c.setSalary(salary);
						
						for (; i < ems.length; i++) {
							if (ems[i]==null) {
								ems[i]=c;
								System.out.println("修改数据成功!");
								break;
							}
						}
					}else if (position.equals("经理")) {
						m = new Manager();
						m.setID(ID);
						m.setName(name);
						m.setPosition(position);
						m.setHoliday(holiday);
						m.setSalary(salary);
						
						for (; i < ems.length; i++) {
							if (ems[i]==null) {
								ems[i]=m;
								System.out.println("修改数据成功!");
								break;
							}
						}
					}else if (position.equals("董事")) {
						d  = new Director();
						d.setID(ID);
						d.setName(name);
						d.setPosition(position);
						d.setHoliday(holiday);
						d.setSalary(salary);
						
						for (; i < ems.length; i++) {
							if (ems[i]==null) {
								ems[i]=d;
								System.out.println("修改数据成功!");
								break;
							}
						}
					}else {
						System.out.println("职位输入错误!");
					}
				
				}
			}
		}
	}
	
	
	public static void queryEmployee()
	{
		sc.nextLine();
		System.out.println("请输入员工姓名:");
		String name = sc.nextLine();
		int i = 0;
		for (; i < ems.length; i++) {
			if (ems[i]!=null) {
				if (ems[i].getName().equals(name)) {
					System.out.println(ems[i].toString());
					break;
	}
			}
		}
		
		if (i==ems.length) {
			System.out.println("查无此人");
		}
	}

	
}
	
	
	
	

