package com.coba;

import java.util.Scanner;

public class Palindrome {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ss = new Scanner(System.in);
		System.out.println("Input Palindrome String ");
		String Pa = ss.nextLine();
		StringBuffer RePa = new StringBuffer(Pa).reverse();
		String re = RePa.toString();
		if (Pa.equals(re))
		{
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
		
	}

}
