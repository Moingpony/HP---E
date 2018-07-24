package com.hpe.java1;

public class CommonEmployee extends Employee{

	public CommonEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CommonEmployee(String name, String id, double salary) {
		super(name, id, salary);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("员工工作");
	}
}
