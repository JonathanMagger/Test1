package com.assign2;
//Q7 write a java program to implement merge sort

import java.util.Arrays;

//Write a java program to implement merge sort.

public class Q7 {

	public static void main(String[] args) {
		
		int [] a = { 1,4,21,35,17};
		int [] b = { 19,21,37,44,12,66};
		
		int l = a.length;
		int l1 = b.length;
		int[] c = new int [l+l1];
		System.arraycopy(a, 0, c, 0, l);
		System.arraycopy(b, 0, c, l, l1);
		
		System.out.println("First Array : "+ Arrays.toString(a));
		System.out.println("Second Array: "+ Arrays.toString(b));
		System.out.println("Merge Array: "+ Arrays.toString(c));
		Arrays.sort(c);
		System.out.println("Merge Sort Array: "+ Arrays.toString(c));
		
	
}
}