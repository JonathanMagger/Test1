package com.cursor;

import java.util.ArrayList;
import java.util.ListIterator;

class Emp 
{
	// instance variable
	int eid;
	String ename;
	//Constructor
	public Emp (int eid, String ename) {
		this.eid=eid;
		this.ename=ename;
	}
}
public class Data3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List Iterator
		ArrayList<String>al = new ArrayList<String>();
		al.add("Micky");
		al.add("Rob");
		al.add("Wabula");
		al.add("Arya");
		al.add("Bayu");
		al.add("Aryani");
		
		//generic format
		ListIterator<String> ltr = al.listIterator();
		System.out.println("Forward Direction-> ");
		while (ltr.hasNext())
		{
			String ss = ltr.next();
					System.out.println("Asc Name : "+ss);
		}	System.out.println();
		System.out.println("Reverse Direction -> ");
		while(ltr.hasPrevious())
		{
			String ss = ltr.previous();
			System.out.println("Desc Name : "+ss);
		}
		System.out.println();
		System.out.println("Rest of code ....");
			
		//Creating Employee Objects
		Emp e1 = new Emp (101,"Micky");
		Emp e2 = new Emp (102,"Rob");
		Emp e3 = new Emp (103,"Diahn");
		Emp e4 = new Emp (104,"Arya");
		Emp e5 = new Emp (105,"Bayu");
		
		//Storing Emp object value into an Array List
		ArrayList<Emp> lita = new ArrayList<Emp>();
		lita.add(e1);
		lita.add(e2);
		lita.add(e3);
		lita.add(e4);
		lita.add(e5);
	
		// using cursor
		ListIterator<Emp> lit = lita.listIterator();
		while (lit.hasNext())
		{
			Emp ee = lit.next();
			if ((ee.eid)==104 || (ee.ename).equals("Diahn"))
			{
				lit.remove();
			}
		}
		for (Emp res : lita)
		{
			System.out.println(("Id : "+res.eid+" - " +"Name : "+res.ename));
		}
	}

}
