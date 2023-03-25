package com.make;

import java.util.Arrays;

public class Solu3 {

	public static void main(String[] args) {
		
int [] a = {10,3,5,21,53,22};
		
		Arrays.sort(a);
		for (int aa:a)
		{
			System.out.println(aa);
		}
System.out.println();

int seclargest = a[a.length-2];
System.out.println("Second Largest values: "+ seclargest);//Q3


	}

}


