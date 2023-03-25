package com.cursor;

import java.util.ArrayList;
import java.util.Iterator;

public class Data2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Iterator
		ArrayList<String>al = new ArrayList<String>();
		al.add("Micky");
		al.add("Rob");
		al.add("Wabula");
		al.add("Arya");
		al.add("Bayu");
		al.add("Aryani");
		
		//normal version cursor
		@SuppressWarnings("rawtypes")
		Iterator itr = al.iterator();
		while(itr.hasNext())
		{
			String ss = (String)itr.next();
			System.out.println("Result is : "+ss);
		}
		System.out.println();
		System.out.println();
		
		//generic Version
		Iterator<String> i = al.iterator();
		while (i.hasNext())
		{
			String ss1 =i.next();
					System.out.println("Result is : "+ss1);
		}
		
	}

}
