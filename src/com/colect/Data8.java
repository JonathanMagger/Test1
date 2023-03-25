package com.colect;

import java.util.ArrayList;

public class Data8 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("rawtypes")
		ArrayList al =new ArrayList<>();
		
		//1st way
		al.add(10);
		System.out.println(al);
		System.out.println(al.size());
		
		al.remove(0);
		System.out.println(al);
		System.out.println(al.size());
		
		System.out.println();
		System.out.println();
		
		//2nd way
		//Primitve Value
		int a1 = 20;
		//Converting into Warpper object
		Integer i = new Integer(a1);
		//adding warpper object in ArrayList 
		al.add(i);
		
		System.out.println(al);
		System.out.println(al.size());
		al.remove(0);
		System.out.println(al);
		System.out.println(al.size());
	}

}
