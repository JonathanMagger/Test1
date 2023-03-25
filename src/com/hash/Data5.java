package com.hash;

import java.util.SortedSet;
import java.util.TreeSet;

public class Data5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//how to add to collection
		TreeSet<Integer> ts1 = new TreeSet<Integer>();
		ts1.add(5);
		ts1.add(2);
		ts1.add(1);
		ts1.add(4);
		ts1.add(3);
		ts1.add(6);
		System.out.println(ts1);
		System.out.println();
		
		System.out.println(ts1.tailSet(3));
		System.out.println();
		System.out.println(ts1.headSet(3));
		System.out.println();
		//Converting into Sorted Dataset
		SortedSet<Integer> ss = ts1;
		//converting into tree set
		TreeSet<Integer> ts2 = new TreeSet<Integer>(ss);
		System.out.println(ts2);
		for (Integer i : ts1)
		{
			System.out.println("Result is : "+i);
		}
	}

}
