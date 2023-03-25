package com.compa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*Comparator Interface
Adv 1.Multiple Property Sorting
	2. Separating Our Buss logic with Sorting Logic
	
	public abstract int compare (T,T);
	public abstract boolean equals (Java.lang.object);*/

class Stu
{
	//instance variable
	int sid;
	String sname;
	public Stu(int sid, String sname)
	{
		this.sid = sid;
		this.sname = sname;
	}
}
@SuppressWarnings("rawtypes")
class StuComp implements Comparator
{
	public int compare (Object o1, Object o2) {
		Stu s1 = (Stu)o1;
		Stu s2 = (Stu)o2;
		if (s1.sid == s2.sid) {
			return 0;
		}
		else if (s1.sid > s2.sid) {
			return 1;
		}
		return -1;
	}
}
@SuppressWarnings("rawtypes")
class SnaComp implements Comparator
{
	public int compare (Object o1, Object o2) {
		Stu s1 = (Stu)o1;
		Stu s2 = (Stu)o2;
		return (s1.sname.compareTo(s2.sname));
	}
}
public class COMPARATOR {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
	
		ArrayList<Stu> al = new ArrayList<Stu>();
		al.add(new Stu (103, "Micky"));
		al.add(new Stu(105,"Rob"));
		al.add(new Stu(102,"Diahn"));
		al.add(new Stu (104,"Arya"));
		al.add(new Stu (101,"Aryani"));
		//Sort by ID
		Collections.sort(al, new StuComp());
		System.out.println("Sort Based on ID : ");
		for(Stu s : al)
		{
			System.out.println("ID : "+s.sid+" - "+"Name : "+s.sname);
		}
		System.out.println();
		//Sort by name
		Collections.sort(al, new SnaComp());
		System.out.println("Sort Based on Name : ");
		for(Stu s : al)
		{
			System.out.println("ID : "+s.sid+" - "+"Name : "+s.sname);
		}
	}

}


