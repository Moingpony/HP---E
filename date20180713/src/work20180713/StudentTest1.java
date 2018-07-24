package work20180713;

import org.junit.Test;

public class StudentTest1 {
	@Test
	public void test()
	{
			
		Student1 s1 = new Student1();
		Student1 s2 = new Student1();
		Student1 s3 = new Student1();
		
		System.out.println(s1.showInfo("a1", 12, "男", 1));
		System.out.println(s2.showInfo("a2", 13, "男", 2));
		System.out.println(s3.showInfo("a3", 16, "女", 3));
	}
}
