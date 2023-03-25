package com.arrayint;

public class Exec2 {

	public static void main(String[] args) {

		Object [] ob = new Object [3];
		ob[0] = new Rat(112,"Tikus");
		ob[1] = new Mice(134,"Curut");
		ob[2]= new Integer (200);
		
		for (Object oo : ob) {
			if (oo instanceof Rat )
			{	Rat rr = (Rat) oo;
				System.out.println("ID : "+rr.rid+" "+"Nama : "+rr.rname );
			}
			else if (oo instanceof Mice)
			{	Mice mm = (Mice) oo;
			System.out.println("ID : "+mm.mid+" "+"Nama : "+mm.mname );
				
			}
			else if (oo instanceof Integer)
			{
				System.out.println("value : "+oo);
			}
		}

	}

}
