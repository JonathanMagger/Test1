package com.coba;

import java.util.Scanner;

public class Totalvowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner ss = new Scanner(System.in);
		System.out.println("input String");
		String s = ss.nextLine();
		String vowel = s.replaceAll("[^aiueoAIUEO]*", "");
		System.out.println("Total Vowel is: "+vowel.length());
	}

}
