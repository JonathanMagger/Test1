package com.coba;

import java.util.Scanner;

public class Countword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner ss = new Scanner(System.in);
		System.out.println("Input String");
		String word = ss.nextLine();
		String Cut = word.replaceAll("[^a-zA-Z]* ","" );
		System.out.println("word count is"+ Cut.length());
	}

}
