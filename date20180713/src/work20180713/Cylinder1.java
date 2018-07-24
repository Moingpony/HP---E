package work20180713;

public class Cylinder1 extends Circle1{
	//一个成员变量
	
	private double hight;
	//一个构造方法
	public Cylinder1(double r, double h) {
		super(r);
		this.hight = h;
	}
	//两个成员方法
	
	public double getVolume()
	{
		double v = super.getArea()*hight;
		return v;
		
	}

	public void showVolume()
	{
		System.out.println("圆柱体的体积:"+getVolume());
	}
	
	
	
}
