package com.array7;

import java.util.Arrays;

public class B {

	public static void main(String[]args) {
		int[]arr = {1,3,2,8,2,11,15,12,14,15,6};
		Arrays.sort(arr);
		int []arr2 = new int[2];
		for(int i =0; i<2;i++) {
			arr2[i]=arr[i];
		}
		System.out.println(Arrays.toString(arr2));
	}
}
