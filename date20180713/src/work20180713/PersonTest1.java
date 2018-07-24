package work20180713;

import org.junit.Test;

public class PersonTest1 {
	
	@Test
	public void test()
	{
		Person1 p1 = new Person1("p1", 20);
		Person1 p2 = new Person1("p2", 22, "zz");
		Person1 p3 = new Person1("p3", 23, "z1", "z1");
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}
}
