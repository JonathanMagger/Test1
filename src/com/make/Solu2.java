package com.make;

import java.util.Scanner;

public class Solu2 {

	    public static void main(String[] args) {

	    	@SuppressWarnings("resource")
			Scanner s = new Scanner(System.in);
	    	System.out.println("Input Armstrong Number");
	        int number = s.nextInt(), originalNumber, remainder, result = 0;

	        originalNumber = number;

	        while (originalNumber != 0)
	        {
	            remainder = originalNumber % 10;
	            result += Math.pow(remainder, 3);
	            originalNumber /= 10;
	        }

	        if(result == number)
	            System.out.println(number + " is an Armstrong number.");
	        else
	            System.out.println(number + " is not an Armstrong number.");
	    }//Q2
	}

