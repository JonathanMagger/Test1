package com.make;

import java.util.Scanner;

public class Solu6 {

	  public static void main(String[] args) {

		  System.out.println("Input Prime Number");
			@SuppressWarnings("resource")
			Scanner s = new Scanner(System.in);
	    int num = s.nextInt();
	    boolean flag = false;
	    for (int i = 2; i <= num / 2; ++i) {
	      // condition for nonprime number
	      if (num % i == 0) {
	        flag = true;
	        break;
	      }
	    }

	    if (!flag)
	      System.out.println(num + " is a prime number.");
	    else
	      System.out.println(num + " is not a prime number.");
	  }//Q7
	}