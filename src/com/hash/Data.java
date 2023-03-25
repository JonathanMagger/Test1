package com.hash;

import java.util.HashSet;
import java.util.Iterator;

public class Data {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//HashSet in Generic Form
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(60);
		hs.add(20);
		hs.add(40);
		hs.add(60);
		
		//Cursor
		Iterator<Integer> i = hs.iterator();
		while (i.hasNext()) {
			Integer ii = i.next();
			System.out.println("Result is : "+ii);
			
		}System.out.println(hs);
	}

}
