package com.assign2;
//Q9  Write a java Program to check whether input string is palindrome of given String or not.

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Input Palindrome String");
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		 String myString = s.nextLine();
	      StringBuffer buffer = new StringBuffer(myString);
	      buffer.reverse();
	      String data = buffer.toString();
	      if(myString.equals(data)){
	         System.out.println("Given String is palindrome");
	      } else {
	         System.out.println("Given String is not palindrome");
	      }
	   }
	}