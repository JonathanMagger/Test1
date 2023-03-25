package com.colect;

import java.util.ArrayList;

public class Data9 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList1 ArrayList2 ArrayList3
		//How to add all three ArrayList in Fourth Array List
		
		
		@SuppressWarnings("rawtypes")
		ArrayList al1 = new ArrayList();
		al1.add(10);
		al1.add(20);
		
		@SuppressWarnings("rawtypes")
		ArrayList al2 = new ArrayList();
		al2.add(40);
		al2.add(50);
		
		@SuppressWarnings("rawtypes")
		ArrayList al3 = new ArrayList();
		al3.add(60);
		al3.add(70);
		
		@SuppressWarnings("rawtypes")
		ArrayList al4 = new ArrayList();
		System.out.println("arrayList-4 : "+al4);
		
		//All object of Array List-1 Should Add in ArrayList-4
		al4.addAll(al1);
		System.out.println("ArrayList-4 : "+al4);
		al4.addAll(al2);
		System.out.println("ArrayList-4 : "+al4);
		al4.addAll(al3);
		System.out.println("ArrayList-4 : "+al4);
		
		
	}

}
