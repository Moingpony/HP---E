package com.hpe.java1;

import org.junit.Test;

public class AbstractTest {
	
	
	@Test
	
	public void test()
	{
		Animal a1 = new Horse();//多态性
		
		
		
		
		shout(new Horse());
	}
	
	
	public void shout(Animal animal)
	{
		animal.shout();
	}
}
