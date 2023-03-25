package com.colect;

import java.util.ArrayList;

class Emp3
{
	// instacne variable
	int eid;
	String ename;
	//constructor
	public Emp3 (int eid, String ename) {
		this.eid = eid;
		this.ename = ename;
	}

}
public class Data6 {

	public static void main(String args []) {
		//generic Concept : Used to provide Type safety for collection
		Emp3 e1 = new Emp3 (101,"ABC");
		Emp3 e2 = new Emp3 (102, "DEF");
		Emp3 e3 = new Emp3 (103, "GHI");
		
		ArrayList<Emp3> al = new ArrayList<Emp3>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		
		
		
		// For each
		for(Emp3 ee : al)
		{
			System.out.println(ee.eid+" -- "+ee.ename);
		}
	}
}
