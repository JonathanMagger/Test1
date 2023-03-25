package com.make;
//Q1 Write a java Program to remove all white Space from a string without using replace().
//Q4 Write a java Program to remove all white space
import java.util.Scanner;

public class Solu1 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter a String: ");  
		String s = sc.nextLine();
		String s2 = s.replace(" ","");
		System.out.println(s2); // Q 4
		String[] s1 = s.split(" ");
		String ans ="";
		for (String ss : s1)
		{
			ans = ans+ss;
		}
		System.out.println(ans); //Q 1

	}


}
