package com.array7;

import java.util.Scanner;

public class Data2 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ename = "Micky";
		long ephone = 998877665;
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter user name: ");
		String sname =s.nextLine();
		System.out.println();
		
		System.out.print("Enter user phone: ");
		Long sphone =s.nextLong();
		System.out.println();
		
		System.out.println();
		if(String.valueOf(ephone).equals(String.valueOf(sphone))&& ename.equals(sname)) {
		System.out.println("Login Success...");	
		}else {
			System.out.println("Login Failed...");
		}
		
	}

}
