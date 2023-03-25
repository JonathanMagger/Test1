package com.assign;
//Q11 Write a Java Program to reverse a string with String inbuilt function reverse().

import java.util.Scanner;

public class Quest11 {

	public static void main(String[] args) {
		
		String s;  
		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter a String: ");  
		s=sc.nextLine();
		StringBuffer d = new StringBuffer(s) ;
		System.out.println(d.reverse());
	}

}
