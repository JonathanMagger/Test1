package com.assign;
//Q14 Find factorial of an integer?

import java.util.Scanner;

public class Quest14 {

	public static void main(String[] args) {
		
		System.out.println("Insert Factorial Number: ");
		@SuppressWarnings("resource")
		Scanner z = new Scanner(System.in);
		int i,fact=1;  
		  int number=z.nextInt();//It is the number to calculate factorial    
		  for(i=1;i<=number;i++){    
		      fact=fact*i;    
		  }    
		  System.out.println("Factorial of "+number+" is: "+fact);    
	}

}
