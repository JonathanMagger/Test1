package com.make;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate a =LocalDate.now();
		System.out.println(a);
		LocalDate b = a.plusDays(4);
		System.out.println(b);
		LocalDate c =a.minusDays(2);
		System.out.println(c);
		System.out.println(a.isLeapYear());
		LocalDate a2 =LocalDate.of(2020, 11, 11);
		System.out.println(a2.isLeapYear());
		LocalDateTime d = LocalDateTime.now();
				System.out.println(d);
				LocalDateTime e = a.atTime(8,9,10);
				System.out.println(e);	
				LocalDateTime f = LocalDateTime.of(2011, 01, 07, 14, 30);
				System.out.println(f);
				ZoneId me =ZoneId.of("Africa/Timbuktu");
				LocalTime ti= LocalTime.now(me);
				ZoneId mi =ZoneId.of("Asia/Jakarta");
				LocalTime te= LocalTime.now(mi);
				System.out.println(ti);
				long myhours = ChronoUnit.MINUTES.between(ti, te);
				System.out.println(myhours);
	}

}
