package com.assign;
//Q9 write a Java Program to swap two numbers using third variable.

import java.util.Scanner;

public class Quest9 {

	public static void main(String[] args) {

		 @SuppressWarnings("resource")
		  Scanner s = new Scanner(System.in);
		  System.out.println("Input X Values");
	      int x = s.nextInt();
	      System.out.println("Input Y Values");		  
	      int y = s.nextInt();
	      int z;
	      System.out.println("Original values of x and y");
	      System.out.println("x = " + x);
	      System.out.println("y = " + y);
	      z=x;
	      x=y;
	      y=z;
	      System.out.println("Swapped values of x and y");
	      System.out.println("x = " + x);
	      System.out.println("y = " + y);
	}

}
