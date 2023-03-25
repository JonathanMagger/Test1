package com.make;

import java.util.Scanner;

public class Solu13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		}  //Q14
	