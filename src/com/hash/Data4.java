package com.hash;
import java.util.Comparator;
import java.util.TreeSet;


class Emp
{
	//instance variable
	int eid;
	String ename;
	
	public Emp (int eid, String ename) {
		this.eid =eid;
		this.ename = ename;
	}
}
class EnameComp implements Comparator<Emp>
{
	@Override
	public int compare (Emp e1 , Emp e2)
	{
		return e1.ename.compareTo(e2.ename);
	}
}
class EidComp implements Comparator<Emp>
{
	@Override
	public int compare (Emp o1, Emp o2)
	{
		if (o1.eid == o2.eid) {
			return 0;
		}
		else if (o1.eid > o2.eid) {
			return 1;
		}
		return -1;
	}
}
public class Data4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Tree Set
		//Employee class Object
		Emp e1 = new Emp(103, "DDD");
		Emp e2 = new Emp(101, "BBB");
		Emp e3 = new Emp(104, "CCC");
		Emp e4 = new Emp(102, "AAA");
		
		//Tree set in Generic Version
		TreeSet<Emp> ts = new TreeSet<Emp>(new EidComp());
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);

		for (Emp ee : ts)
		{
			System.out.println(ee.eid + " - "+ ee.ename);
		}
	}

}
