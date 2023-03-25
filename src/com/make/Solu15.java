package com.make;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Solu15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] a = {1,2,3,4,5,6};
		 
		 List<Integer> intList = Arrays.asList(a);

			Collections.shuffle(intList);

			intList.toArray(a);

			System.out.println(Arrays.toString(a));
	}//Q16

}
