package com.colect;

import java.util.ArrayList;

public class Data7 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("rawtypes")
		ArrayList al = new ArrayList();
		al.add(10);
		al.add("micky");
		al.add(34.56);
		al.add("ATS");
		
		System.out.println("First : "+al);
		System.out.println(al.size());
		System.out.println();
		
		al.add(78);
		System.out.println("Sec : "+al);
		System.out.println(al.size());
		System.out.println();
		
		al.add(1, 99); // 1 = index
		System.out.println("Third : "+al);
		System.out.println(al.size());
		System.out.println();
		
		al.remove(0); // 0 = index
		System.out.println("Fourth : "+al);
		System.out.println(al.size());
		System.out.println();
		
		al.remove("micky");
		System.out.println("fifth : "+al);
		System.out.println(al.size());
		System.out.println();
		
		System.out.println(al.contains("ATS"));
		System.out.println(al.contains("Fahmi"));
		System.out.println(al.isEmpty());
		System.out.println();
		
		al.clear();
		System.out.println(al.isEmpty());
		System.out.println(al);
		
	}

}
