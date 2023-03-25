package com.hash;

import java.util.Comparator;
import java.util.TreeSet;

class Comb implements Comparator<Object>{
	
	

	@Override
	public int compare(Object o1, Object o2) {
		String s1 = o1.toString();
		String s2 = o2.toString();
	
	return s1.compareTo(s2);}
			
}
public class TreeComb {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("rawtypes")
		TreeSet t1 = new TreeSet(new Comb());
		t1.add(new StringBuffer("Micky"));
		t1.add(100);
		t1.add("ATS");
		t1.add("Java");
		t1.add(100.5);
		
		System.out.println(t1);
	}

}
