package com.compa;
//Compare using String ename
import java.util.ArrayList;
import java.util.Collections;

@SuppressWarnings("rawtypes")
class Emp1 implements Comparable
{
	//instance variable
	int eid;
	String ename;
	
	public Emp1(int eid, String ename) {
		this.eid = eid;
		this.ename = ename;
	}
	@Override
	public int compareTo(Object o) {
		Emp1 e = (Emp1) o;
		return ename.compareTo(e.ename);
		}

}
public class COMPARABLE1 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp1 e1 = new Emp1 (103,"Micky");
		Emp1 e2 = new Emp1 (105,"Rob");
		Emp1 e3 = new Emp1 (102, "Diahn");
		Emp1 e4 = new Emp1 (104, "Aryani");
		Emp1 e5 = new Emp1 (101, "Wabula");
		
		ArrayList<Emp1> al = new ArrayList<Emp1>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		al.add(e5);
		
		Collections.sort(al);
		
		for(Emp1 e : al)
		{
			System.out.println("ID : "+e.eid+" - "+"Name : "+e.ename);
		}
	}

}
