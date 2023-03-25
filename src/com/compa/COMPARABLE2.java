package com.compa;

import java.util.ArrayList;
import java.util.Collections;

//Compare using String sec way
class Emp2 implements Comparable<Emp2>
{
	//instance variable
	int eid;
	String ename;
	
	public Emp2(int eid, String ename) {
		this.eid = eid;
		this.ename = ename;
	}

	@Override
	public int compareTo(Emp2 o) {
		// TODO Auto-generated method stub
		return ename.compareTo(o.ename);
	}

}
public class COMPARABLE2 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp2 e1 = new Emp2 (103,"Micky");
		Emp2 e2 = new Emp2 (105,"Rob");
		Emp2 e3 = new Emp2 (102, "Diahn");
		Emp2 e4 = new Emp2 (104, "Aryani");
		Emp2 e5 = new Emp2 (101, "Wabula");
		
		ArrayList<Emp2> al = new ArrayList<Emp2>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		al.add(e5);
		
		Collections.sort(al);
		
		for(Emp2 e : al)
		{
			System.out.println("ID : "+e.eid+" - "+"Name : "+e.ename);
		}
	}

}
