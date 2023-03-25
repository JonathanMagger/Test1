package com.make;

import java.util.Arrays;
import java.util.Scanner;

public class Solu12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int n;
		 @SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		 System.out.println("enter size of Array");
		 n = s.nextInt();
		 int[] a = new int [n];
		 System.out.println();
		 
		 for (int i=0;i<a.length;i++)
		 {
			 System.out.println("Enter element Array");
			 a[i] = s.nextInt();
			 System.out.println();
		 }System.out.println();
		 
		 Arrays.sort(a);
		 for(int aa : a)
		 {
			 System.out.println("value : "+aa);
		 }System.out.println();
		 System.out.println();
	}//Q13

}
