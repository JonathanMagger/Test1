package com.cursor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

@SuppressWarnings("rawtypes")
class Emp1 implements Comparable
{
	// instance variable
	int eid;
	String ename;
	//Constructor
	public Emp1 (int eid, String ename) {
		this.eid=eid;
		this.ename=ename;
	}
	public int compareTo (Object o)
	{
		Emp1 e = (Emp1) o;
		if(eid == e.eid) {
			return 0;
		}
		else if (eid>e.eid) {
			return 1;
		}
		return -1;
	}
}
public class Data4 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating Employee Objects
				Emp1 e1 = new Emp1 (101,"Micky");
				Emp1 e2 = new Emp1 (102,"Rob");
				Emp1 e3 = new Emp1 (103,"Diahn");
				Emp1 e4 = new Emp1 (104,"Arya");
				Emp1 e5 = new Emp1 (105,"Bayu");
				Emp1 e7 = new Emp1 (107,"Akira");
				//Storing Emp object value into an Array List
				ArrayList<Emp1> lita = new ArrayList<Emp1>();
				lita.add(e1);
				lita.add(e2);
				lita.add(e3);
				lita.add(e4);
				lita.add(e5);
				Collections.sort(lita);
				//using cursor
				ListIterator<Emp1> lit = lita.listIterator();
				
				Emp1 e6 = new Emp1 (106, "Disney");
				lit.add(e6);
				
				//Print all record data before change
				System.out.println("Before change : ");
				
				for (Emp1 res : lita)
				{
					System.out.println("ID : "+res.eid+" Name: "+res.ename);
				}
				
				while(lit.hasNext())
				{
					Emp1 ee = lit.next();
					if((ee.eid)==103||(ee.ename).equals("Arya"))
					{
						lit.remove();
					}
					
					if ((ee.ename).equals("Bayu"))
					{
						lit.set(e7);
					}
					
				}System.out.println();
				System.out.println("After change : ");
				Collections.sort(lita);
				//Print all record data
				for (Emp1 res : lita)
				{
					System.out.println("ID : "+res.eid+" Name: "+res.ename);
				}
	}

}
