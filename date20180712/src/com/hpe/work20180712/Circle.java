package com.hpe.work20180712;

public class Circle {
	private double Radius;
	
	public Circle()
	{
		super();
	}
	public Circle(double r)
	{
		super();
		this.Radius = r;
	}
	
	
	public double getRadius() {
		return Radius;
	}
	public void setRadius(double radius) {
		Radius = radius;
	}
	
	public double getArea()
	{
		return Radius*Radius*Math.PI;
		
	}
	public double getPerimeter()
	{
		double per = 2*Math.PI*Radius;
		return per;
	}
	public void show()
	{
		System.out.println("半径："+getRadius()+" 面积："+getArea()+" 周长："+getPerimeter());
	}
	
}
