package work20180716;

import org.junit.Test;

public class StudentTest {

	@Test
	public void test()
	{
		Person p1 = new Student("zhansan", 20, "男", 01);
		
		p1.showInfo();
		System.out.println(p1.showInfo());
		
	}
	
}
