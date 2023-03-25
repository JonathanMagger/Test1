package com.colect;

import java.util.ArrayList;

class Emp
{
	// instance variab;e
	int eid;
	String ename;
	// constructor
	public Emp (int eid,String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}
}
class Student
{
	//instance variable
	int sid;
	String sname;
	//constructor
	public Student (int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}
}
public class Data3 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		@SuppressWarnings("rawtypes")
		ArrayList al =new ArrayList();
		Emp e = new Emp (101,"micky");
		al.add (e);
		
		System.out.println("Result of Emp is : "+e); 
		
		Student s = new Student (201,"John");
		al.add(s);
		
		System.out.println("Result of Student is: "+ s);
		System.out.println(s.getClass().getName());
	}

}
