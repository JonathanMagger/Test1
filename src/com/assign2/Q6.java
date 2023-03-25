package com.assign2;

import java.util.Scanner;

//Q6 Write a java program to find out the square root of given number?

public class Q6 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ss =new Scanner(System.in);
				
		int a = ss.nextInt();
		double Root = Math.sqrt(a);
				System.out.println("The square root of: "+ a +" is "+ Root);
	}

}
