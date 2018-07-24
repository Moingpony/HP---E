package work20180713;

public class Cylinder extends Circle{


	private double length;

	
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public Cylinder(double radius, double length) {
		setRadius(radius);
		this.length = length;
	}

	public Cylinder(double length) {
		super();
		this.length = length;
	}
	
	public double findVolume() {
		double Volume =super.findArea()*length;
		return Volume;
		
	}

	
}
