package com.arrayint;

import java.util.Arrays;

public class Exec6 {

	public static void main(String[] args) {

		int [] a = {10,3,5,21,53,22};
		
		Arrays.sort(a);
		for (int aa:a)
		{
			System.out.println(aa);
		}
System.out.println();

int seclargest = a[a.length-2];
int secsmallest = a[1];
System.out.println("Second Largest values: "+ seclargest);
System.out.println("Second Smallest values: "+ secsmallest);

	}

}
