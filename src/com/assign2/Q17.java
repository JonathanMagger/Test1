package com.assign2;
//Q17 Write java Program to find Smallest and Largest Element in an Array

import java.util.Arrays;

public class Q17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] a = {10,3,5,21,53,22};
		
		Arrays.sort(a);
		for (int aa:a)
		{
			System.out.println(aa);
		}
		System.out.println();

		int largest = a[a.length-1];
		System.out.println("Largest values: "+ largest);
		int smallest = a[0];
		System.out.println("Smallest values: "+ smallest);

	}

}
