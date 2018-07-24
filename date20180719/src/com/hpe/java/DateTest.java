package com.hpe.java;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class DateTest {
	
	@Test
	public void test()
	{
		Date date = new Date();
		
		System.out.println(date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateStr = sdf.format(date);
		System.out.println(dateStr);
		
		
		String dateStr1 = "2011-09-09 12:23:56";
		try {
			Date date2 = sdf.parse(dateStr1);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
		@Test
		public void test2()
		{
			Date date = new Date();
			long time = date.getTime();
			System.out.println(time);
		
		
		    java.sql.Date date1 = new java.sql.Date(time);
		
		
		
		
		
		
		
    	}



}
