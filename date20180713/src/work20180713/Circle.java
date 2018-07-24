package work20180713;

public class Circle {
	private double radius;
	
	
	


	public Circle() {
		super();
		this.radius =1;
	}


	public double getRadius() {
		return radius;
	}


	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double findArea()
	{
		double area = Math.PI*radius*radius;
		return area;
	}
	
	
}
