package com.arrayint;


import java.util.ArrayList;


class Employee
{
	//instance variable
	int eid;
	String ename;
	//Constructor
	public Employee(int eid,String ename) {
		this.eid = eid;
		this.ename = ename;
	}
}
public class arraytes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 =new Employee(101,"Abc");
		Employee e2 = new Employee(102,"DEF");
		Employee e3 = new Employee (103,"GHI");
		
		ArrayList<Employee> al=new ArrayList<Employee>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		
		for (Employee ee:al)
		{
			System.out.println(ee.eid+"--"+ee.ename);
		}
	}

}
