package com.assign;
//Q12 Java Program to check if a vowel is present in the string?

import java.util.Scanner;

public class Quest12 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter a String: ");  
		
		 String str =  sc.nextLine();
		    for(int i=0; i<str.length(); i++) {
		      if(str.charAt(i) == 'a'|| str.charAt(i) == 'e'|| 
		          str.charAt(i) == 'i' || str.charAt(i) == 'o' || 
		          str.charAt(i) == 'u')
		        
		        System.out.println("Given string contains " + 
		            str.charAt(i)+" at the index " + i);
		    }
		
	}

}
