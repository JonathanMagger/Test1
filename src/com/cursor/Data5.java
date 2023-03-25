package com.cursor;

import java.util.ArrayList;
import java.util.Arrays;

//How to Convert Array into Array List
public class Data5 {

	public static void main(String[] args) {
		//Array
		String [] s1 = {"ABC","DEF","GHI","JKL"};
		
		//conversion of Array to ArrayList
		ArrayList<String> al = new ArrayList<String>(Arrays.asList(s1));
		al.add("MNO");
		al.add("XYZ");
		
		for (String ss:al)
		{
			System.out.println("result is : "+ss);
		}
		
	}
}
