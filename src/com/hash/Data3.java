package com.hash;
//2nd way Adding HashSet
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Data3 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HashSet
		@SuppressWarnings("rawtypes")
		HashSet h1 = new HashSet();
		h1.add("Micky");
		h1.add("Disney");
		
		@SuppressWarnings("rawtypes")
		HashSet h2 =  new HashSet(h1);
		h2.add("Bayu");
		h2.add("Rob");
		
		@SuppressWarnings("rawtypes")
		LinkedHashSet lh =  new LinkedHashSet(h2);
		lh.add("Aryani");
		lh.add("Wabula");
		
		System.out.println("Result is : "+ h2);
		System.out.println();
		System.out.println("Result is : "+ lh);

	}

}
