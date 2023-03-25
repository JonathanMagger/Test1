package com.assign;
//Q1 Write a Java Program to remove all white Space from a string without using replace().

import java.util.Scanner;	
public class Quest1 {

		public static void main(String[] args) {
			@SuppressWarnings("resource")
			Scanner sc=new Scanner(System.in);  
			System.out.print("Enter a String: ");  
			String s = sc.nextLine();
			String[] s1 = s.split(" ");
			String ans ="";
			for (String ss : s1)
			{
				ans = ans+ss;
			}
			System.out.println(sc); 

		}


	}

	