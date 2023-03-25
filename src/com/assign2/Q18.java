package com.assign2;
//Q18 Find Second largest number in an Array

import java.util.Arrays;

public class Q18 {

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
