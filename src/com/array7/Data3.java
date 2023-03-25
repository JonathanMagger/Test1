package com.array7;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class Data3 {

	public static void main(String[] args) throws IOException {
		
		//Read files
		FileInputStream fis = new FileInputStream("C:\\Users\\Jonathan\\OneDrive\\Desktop\\Mycode\\Jo1\\src\\com\\array7\\tes.properties");
		//Now Load Property (Using Property class Load())
		Properties p = new Properties();
		p.load(fis);

		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.print("Enter user name: ");
		String sname =s.nextLine();
		System.out.println();
		
		System.out.print("Enter user phone: ");
		String sphone =s.nextLine();
		System.out.println();
		
		System.out.println();
		System.out.println("My Data is");
		System.out.println("Phone : "+((String)p.getProperty("ephone")));
		System.out.println("Name : "+((String)p.getProperty("ename")));
		
		if (((String)p.getProperty("ephone"))
				.equals(sphone)&&((String)p
				.getProperty("ename"))
				.equals(sname)) {
			System.out.println("Login Success...");
			
		}else {System.out.println("Login Failed...");}
	}

}
