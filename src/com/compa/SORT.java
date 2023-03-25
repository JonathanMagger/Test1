package com.compa;

import java.util.ArrayList;
import java.util.Collections;

//COLLECTIONS
public class SORT {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//ArrayList
		ArrayList<String> al =new ArrayList<String>();
		al.add("DDD");
		al.add("AAA");
		al.add("CCC");
		al.add("BBB");
		
		//Before
		System.out.println("Before Result is : "+al);
		Thread.sleep(2000);
		Collections.sort(al);
		Thread.sleep(2000);
		System.out.println("Before Result is : "+al);
	}

}
