package work20180713;

import org.junit.Test;

public class StudentTest2 {

	@Test
	public void test()
	{
		int[] a = {1,2,3};
		int[] b = {1,2,3};
		
		Student2 s1 = new Student2(1, "s1",a);
		Student2 s2 = new Student2(2, "s2",b);
		System.out.println(s1);
		System.out.println(s2);
		
	}
}
