package com.aprendendo.javacore.r_dates.test;

import java.util.Calendar;
import java.util.Date;

public class DateTest {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		if (c.getFirstDayOfWeek() == Calendar.SUNDAY) {
			System.out.println("DOMINGO");
		}
		
		System.out.println(c.get(Calendar.YEAR));
		
		c.add(Calendar.DAY_OF_MONTH, 2);
	
		Date date = c.getTime();
		System.out.println(date);
	}
}
