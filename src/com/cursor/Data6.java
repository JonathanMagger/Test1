package com.cursor;

import java.util.ArrayList;

//How to convert ArrayList to a Normal Array
//How to convert Collection into an Array
public class Data6 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList
		ArrayList<String> al = new ArrayList<String>();
		al.add("ABC");
		al.add("DEF");
		al.add( "GHI");
		al.add("JKL");
		
		//1st way - > COnverting ArrayList records into Normal ARRAY
		String [] ss = new String[al.size()];
		
		//add records
		al.toArray(ss);
		
		System.out.println("First way");
		System.out.println();
		//Print All Records
		for (String res : ss)
		{
			System.out.println("Result is : "+res);
		}
		System.out.println();
		//ArrayList
				@SuppressWarnings("rawtypes")
				ArrayList alr = new ArrayList<String>();
				alr.add("ABC");
				alr.add(10);
				alr.add(45.6);
				alr.add(true);
				
				// normal Array sec way
				System.out.println("Second way");
				Object [] o = alr.toArray();
				for(Object oo : o)
				{System.out.print("Result : "+oo);
				System.out.println(" Type : "+oo.getClass().getName());
				}
	}
Data6 obj;
}
