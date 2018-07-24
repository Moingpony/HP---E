package com.hpe.java1;

public class Manager extends Employee{
	private double bonus;

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public Manager(String name, String id, double salary, double bonus) {
		super(name, id, salary);
		this.bonus = bonus;
	}

	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Manager(String name, String id, double salary) {
		super(name, id, salary);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("有奖金");
	}
	
}
