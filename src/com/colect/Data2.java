package com.colect;

import java.util.ArrayList;

public class Data2 {


	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		@SuppressWarnings("rawtypes")
		ArrayList al = new ArrayList();
		//primitive data type
		int a =10;
		// converting into warper object
		Integer i = new Integer(a);
		al.add(i.toString());
		System.out.println(al.getClass().getName());
		System.out.println(i.getClass().getName());
		
	}

}
