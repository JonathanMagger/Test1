package com.assign;
//Q5 Write a Java Program to find the duplicate characters in a string.

import java.util.Scanner;

public class Quest5 {

	public static void main(String[] args) {

		int a;
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);  
		System.out.println("Enter a String: ");  
		String s = sc.nextLine();
		
		char c [] = s.toCharArray();
		System.out.println(" Character that has duplicate: ");
		for (int i = 0; i<c.length;i++) {
			a =1;
			for (int j = i+1;j<c.length;j++)
			if(c[i]== c[j]&&c[i]!=' ') {
				a++;
				c[j]='0';
			}
			if(a>1&&c[i] !='0') {
				System.out.println(c[i]);	
		}
		
		}
	}
}
