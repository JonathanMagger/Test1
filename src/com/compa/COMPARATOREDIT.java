package com.compa;
import java.util.ArrayList;
import java.util.Collections;
//Comparator Generic Way
import java.util.Comparator;

class Stud
{
	//instance variable
	int sid;
	String sname;
	public Stud(int sid, String sname)
	{
		this.sid = sid;
		this.sname = sname;
	}
}

class StudComp implements Comparator<Stud>
{
	public int compare (Stud s1, Stud s2) {
	
		if (s1.sid == s2.sid) {
			return 0;
		}
		else if (s1.sid > s2.sid) {
			return 1;
		}
		return -1;
	}
}

class SnamComp implements Comparator<Stud>
{
	public int compare (Stud s1, Stud s2) {
		return (s1.sname.compareTo(s2.sname));
	}
}
public class COMPARATOREDIT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Stud> al = new ArrayList<Stud>();
		al.add(new Stud (103, "Micky"));
		al.add(new Stud(105,"Rob"));
		al.add(new Stud(102,"Diahn"));
		al.add(new Stud(104,"Arya"));
		al.add(new Stud(101,"Aryani"));
		//Sort by ID
		Collections.sort(al, new StudComp());
		System.out.println("Sort Based on ID : ");
		for(Stud s : al)
		{
			System.out.println("ID : "+s.sid+" - "+"Name : "+s.sname);
		}
		System.out.println();
		//Sort by name
		Collections.sort(al, new SnamComp());
		System.out.println("Sort Based on Name : ");
		for(Stud s : al)
		{
			System.out.println("ID : "+s.sid+" - "+"Name : "+s.sname);
		}
	}

}
