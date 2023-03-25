package com.assign;
//Write a Java Program to remove all white spaces from a string with using replace().

import java.util.Scanner;

public class Quest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter a String: ");  
		String s = sc.nextLine();
		String s2 = s.replace(" ","");
		System.out.println(s2); 
	}

}
