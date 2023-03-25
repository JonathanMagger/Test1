package com.arrayint;

import java.util.ArrayList;
import java.util.List;

class Emp
{
	int ei;
	String en;
	double es;
	public Emp(int ei,String en,double es) {
		this.ei=ei;
		this.en=en;
		this.es=es;
	}
}
public class filter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Emp> l1 = new ArrayList<Emp>();
		l1.add(new Emp(101,"rob",3000));
		l1.add(new Emp(102,"Micky",4200));
		l1.add(new Emp(103,"Aryani",2800));
		l1.add(new Emp(104,"Wabula",2500));
		l1.add(new Emp(105,"Arya",2300));
		l1.add(new Emp(106,"Bayu",2200));
		
		//filter
		l1.stream()
		.filter(f->f.ei>102)
		.map(mm->mm.es+"--"+mm.en)
		.forEach(System.out::println);
		
	}

}
