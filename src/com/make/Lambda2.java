package com.make;

import java.util.ArrayList;
import java.util.List;

public class Lambda2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l1 = new ArrayList<String>();
		l1.add("Rob");
		l1.add("Arya");
		l1.add("Dian");
		l1.add("Aryani");
		l1.add("Wabula");
		l1.add("Micky");
		l1.add("Bayu");
		
		//for- Each
		for (String name : l1)
		{
			System.out.println("Names: "+name);
		}
		System.out.println();
		
		//For each with lambda Expression
		l1.forEach((b)-> System.out.println("Student name is : "+b));
	}

}
