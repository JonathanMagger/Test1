package com.hash;
//1st way Adding HashSet
import java.util.HashSet;

public class Data2 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HashSet Adding Into another HashSet
		@SuppressWarnings("rawtypes")
		HashSet hs = new HashSet();
		hs.add("Micky");
		hs.add("Disney");
		
		@SuppressWarnings("rawtypes")
		HashSet hs1 =  new HashSet();
		hs1.addAll(hs);
		hs1.add("Bayu");
		hs1.add("Rob");
		
		System.out.println("Result is : "+ hs1);
	

	}

}
