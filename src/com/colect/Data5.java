package com.colect;

import java.util.ArrayList;

class Emp2 extends Object
{
	// instacne variable
	int eid;
	String ename;
	//constructor
	public Emp2 (int eid, String ename) {
		this.eid = eid;
		this.ename = ename;
	}

}
class Student2 extends Object
{
	// instance variable
	int eid;
	String ename;
	//constructor
	public Student2 (int eid, String ename) {
		this.eid = eid;
		this.ename = ename;
	}
	
}
public class Data5 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("rawtypes")
		ArrayList al = new ArrayList();
		
		Emp2 e = new Emp2 (101,"micky");
		Student2 s = new Student2(201,"John");
		
		al.add(e);
		al.add(s);
		al.add(10);
		al.add("ATS");
		
		System.out.println(al);
		System.out.println();
		
		// Colection are not type safe
		for (Object o : al)
		{
			if (o instanceof Emp2)
			{
				Emp2 ee = (Emp2)o;
				System.out.println("Employee Value : "+ee.eid+" - "+ee.ename);
			}
			if (o instanceof Student2)
			{
				Student2 ss = (Student2)o;
				System.out.println("Student Value : "+ss.eid+" - "+ss.ename);
			}
			if (o instanceof Integer)
			{
				System.out.println("Integer Value : "+o);
			}
			if (o instanceof String)
			{
				System.out.println("String Value : "+o);
			}
		}

	}

}
