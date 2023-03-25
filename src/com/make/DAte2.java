package com.make;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.MonthDay;
import java.time.OffsetTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.Calendar;

public class DAte2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDateTime a = LocalDateTime.now();
		System.out.println(a);
		System.out.println();
		DateTimeFormatter b = DateTimeFormatter.ofPattern("dd-MM-YYYY");
		String c = LocalDate.now().format(b);
		System.out.println(c);
		System.out.println(a.get(ChronoField.HOUR_OF_DAY));
		MonthDay day = MonthDay.now();
		System.out.println(day);
		LocalDate date = day.atYear(2024);
		System.out.println(date);
		
		Boolean result = day.isValidYear(2112);
		System.out.println(result);
		System.out.println(LocalTime.now());
		OffsetTime time = OffsetTime.now();
		int hour = time.getSecond();
		System.out.println(hour);
		Calendar cc =Calendar.getInstance();
		System.out.println(cc);
		System.out.println();
		System.out.println(cc.getTime());
	
	}

}
