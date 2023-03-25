package com.enumber;

import java.util.StringJoiner;

public class Joiner1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringJoiner sj = new StringJoiner(", " , "{ ", " }")  ;
		System.out.println("Result is : "+sj);
		System.out.println();
		sj.setEmptyValue("one Record Added");
		System.out.println("Result is : "+sj);
		System.out.println();
		sj.add("rob");
		sj.add("miki");
		System.out.println("Result is : "+sj);
		System.out.println();
		int sjl = sj.length();
		System.out.println("length of data is: "+sjl);
		System.out.println();
		sj.add("Aryani");
		sj.add("Wabula");
		sj.add("arya");
		System.out.println("Result is : "+sj);
		System.out.println();
		int sjl2 = sj.length();
		System.out.println("length of data is: "+sjl2);
		System.out.println();
		String ss = sj.toString();
		char cc = ss.charAt(0);
		System.out.println();
		System.out.println("records is : "+ ss);
		System.out.println();
		System.out.println("Character at 17 position is: "+cc);
		
	}

}
