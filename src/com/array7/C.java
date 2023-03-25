package com.array7;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String I = "2022-03-01";
		DateTimeFormatter format= DateTimeFormatter.ofPattern("yyyy-MM-dd");
		
		try {
			LocalDate date = LocalDate.parse(I, format);
			System.out.println("Tanggal "+ date);
		}catch (DateTimeParseException e) {
			System.out.println("input data tanggal yang salah");
		}
	}

}
