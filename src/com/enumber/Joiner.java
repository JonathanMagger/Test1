package com.enumber;

import java.util.StringJoiner;

public class Joiner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringJoiner sj = new StringJoiner(", " , "{ ", " }")  ;

		sj.add("Rob");
		sj.add("miki");
		sj.add("adsa");
		System.out.println("Result is : "+sj);
		StringJoiner sj2 = new StringJoiner(":","{","}"); 
		sj2.add("bsda");
		sj2.add("coda");
		sj2.add("deska");
		System.out.println("Result is : "+sj2);
		StringJoiner all = sj2.merge(sj);
		System.out.println("Result is : "+all);
		
	}

}
