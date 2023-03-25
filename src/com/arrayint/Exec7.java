package com.arrayint;

import java.util.Arrays;
import java.util.Scanner;

public class Exec7 {

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
 for (int odd : a)
 {
	 if (odd%2 != 0)
	 {
		 System.out.println("Ganjil " + odd);
	 }
 }
 for (int even : a)
 {
	 if (even%2 == 0)
	 {
		 System.out.println("Genap " + even);
	 }
 }
	}

}
