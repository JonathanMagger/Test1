package com.assign;
//Q3 Write a Java Program to find the second-highest number in an array.

import java.util.Arrays;

public class Quest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a = {10,3,5,21,53,22};
		
		Arrays.sort(a);
		for (int aa:a)
		{
			System.out.println(aa);
		}
		System.out.println();

		int seclargest = a[a.length-2];
		System.out.println("Second Largest values: "+ seclargest);

	}

}
