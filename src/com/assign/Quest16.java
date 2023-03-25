package com.assign;
//Q16 How to shuffle an array?

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Quest16 {

	public static void main(String[] args) {

		Integer[] a = {1,2,3,4,5,6};
		 
		 List<Integer> intList = Arrays.asList(a);

			Collections.shuffle(intList);

			intList.toArray(a);

			System.out.println(Arrays.toString(a));
	}

}
