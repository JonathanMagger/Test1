package com.hash;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Data1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//LinkedHashSet
		LinkedHashSet<String>lh = new LinkedHashSet<String>();
		lh.add ("A");
		lh.add ("B");
		lh.add ("C");
		lh.add("A"); 
		lh.add("B");
		lh.add("B");
		
		//Cursor
		Iterator<String> it = lh.iterator();
		while(it.hasNext())
		{
			String str = it.next();
			System.out.println("Result is : "+str);
		}
	}

}
