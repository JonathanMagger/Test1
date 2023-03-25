package com.assign;
//Q8 write a java program to swap two numbers without using the third variable.

import java.util.Scanner;

public class Quest8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  @SuppressWarnings("resource")
		  Scanner s = new Scanner(System.in);
		  System.out.println("Input X Values");
	      int x = s.nextInt();
	      System.out.println("Input Y Values");		  
	      int y = s.nextInt();
	      System.out.println("Original values of x and y");
	      System.out.println("x = " + x);
	      System.out.println("y = " + y);
	      x = x ^ y ^ (y = x);
	      System.out.println("Swapped values of x and y");
	      System.out.println("x = " + x);
	      System.out.println("y = " + y);
	   }
	}
