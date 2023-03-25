package com.assign;
//Q15 Sum of all elements in integer array?

import java.util.Arrays;
import java.util.Scanner;


public class Quest15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int n;
		 @SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		 System.out.println("enter size of Array");
		 n = s.nextInt();
		 int[] a = new int [n];
		 System.out.println();
		 int sum = 0;
		 for (int i=0;i<a.length;i++)
		 {
			 System.out.println("Enter element Array");
			 a[i] = s.nextInt();
			 System.out.println();
		 }System.out.println();
		 
		 Arrays.sort(a);
		 for(int aa : a)
		 {	 sum = sum+aa;	
			 System.out.println("value : "+aa);
		 }System.out.println();
		 System.out.println("Total Array Value : "+sum);
	}

}
