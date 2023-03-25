package com.compa;

import java.util.ArrayList;
import java.util.Collections;
//Compare use int eid
//When ever You are performing Sorting at Object level than use Comparable interface

@SuppressWarnings("rawtypes")
class Emp implements Comparable
{
	//instance variable
	int eid;
	String ename;
	
	public Emp(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}
	@Override
	public int compareTo(Object o) {
		Emp e = (Emp) o;
		if (eid == e.eid)
		{
			return 0;
		}
		else if (eid > e.eid) {
			return 1;
		}
		return -1;

	}

}
public class COMPARABLE {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp e1 = new Emp (103,"Micky");
		Emp e2 = new Emp (105,"Rob");
		Emp e3 = new Emp (102, "Diahn");
		Emp e4 = new Emp (104, "Aryani");
		Emp e5 = new Emp (101, "Wabula");
		
		ArrayList<Emp> al = new ArrayList<Emp>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		al.add(e5);
		
		Collections.sort(al);
		
		for(Emp e : al)
		{
			System.out.println("ID : "+e.eid+" - "+"Name : "+e.ename);
		}
	}

}
