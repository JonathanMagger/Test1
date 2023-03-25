package com.colect;

import java.util.ArrayList;

class Emp1 extends Object
{
	// instacne variable
	int eid;
	String ename;
	//constructor
	public Emp1 (int eid, String ename) {
		this.eid = eid;
		this.ename = ename;
	}
	public String toString()
	{
		return eid + " - "+ename;
	}
}
class Student1 extends Object
{
	// instance variable
	int eid;
	String ename;
	//constructor
	public Student1 (int eid, String ename) {
		this.eid = eid;
		this.ename = ename;
	}
	public String toString()
	{
		return eid + " - "+ename;
	}
}
public class Data4 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("rawtypes")
		ArrayList al = new ArrayList();
		Emp1 e = new Emp1(101, "Micky");
		Student1 s = new Student1 (201, "John");
		al.add(e);
		al.add(s);
		System.out.println("Result of Emp is : "+e);
		System.out.println("Result of Emp is : "+s);
		
	}

}
