package work20180713;

import org.junit.Test;

public class StudentTest {
	
	@Test
	public void test()
	{
//		创建对象
		Student s1 = new Student(1, "a1", "男", 20, 81);
		Student s2 = new Student(2, "a2", "男", 23, 61);
		Student s3 = new Student(3, "a3", "女", 26, 81);
		Student s4 = new Student(4, "a4", "男", 20, 94);
		Student s5 = new Student(5, "a5", "女", 22, 86);
		
		//存进对象数组
		Student[] stu = {s1,s2,s3,s4,s5};
		int sum = 0;
		int avg=0;
		
		//遍历学生信息
		for (Student student : stu) {
			System.out.println(student);
		}
		
		//取到sjava平均值
		for (int i = 0; i < stu.length; i++) {
		
			sum+=stu[i].getSjava();
			avg = sum/5;
		
		}
		System.out.println(sum);
		System.out.println(avg);
		//最大最小值
		double max=stu[0].getSjava();
		double min=stu[0].getSjava();
		
		for (Student student : stu) {
			if (student.getSjava()>max) {
				max = student.getSjava();
			} 
			if (student.getSjava()<min) {
				min= student.getSjava();
			}
			
	}
		System.out.println("最大值:"+max);
		System.out.println("最小值:"+min);
		
	}
	
	
}

