package com.make;

import java.util.Scanner;

public class Solu10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s;  
		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter a String: ");  
		s=sc.nextLine();
		StringBuffer d = new StringBuffer(s) ;
		System.out.println(d.reverse());
	
	}//Q11

}
