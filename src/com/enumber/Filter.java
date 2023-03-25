package com.enumber;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Stream filter
class Employee{
	int eid;
	String ename;
	double esalary;
	
	public Employee (int eid, String ename, double esalary) {
		this.eid =eid;
		this.ename = ename;
		this.esalary =esalary;
	}
}

public class Filter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub1
		List<Employee> l1 = new ArrayList<Employee>();
		// Add data
		l1.add(new Employee(106, "Arya", 2000));
		l1.add(new Employee(102, "Bobo", 3100));
		l1.add(new Employee(104, "Charlie", 2900));
		l1.add(new Employee(105, "Dani", 2100));
		l1.add(new Employee(103, "Erni", 2700));
		l1.add(new Employee(101, "Fina", 2500));
		
		//filter
		@SuppressWarnings("rawtypes")
		List data = l1.stream().filter(l->l.esalary>2300).map(ll->ll.ename).collect(Collectors.toList());
		System.out.println("Name is"+data);
	}

}
