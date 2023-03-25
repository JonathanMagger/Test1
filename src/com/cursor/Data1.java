package com.cursor;

import java.util.Enumeration;
import java.util.Vector;

public class Data1 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Vector
		Vector v = new Vector();
		v.add(10);
		v.add(20);
		v.add("Micky");
		v.add(89.56);
		
		Enumeration e = v.elements();
		
		while (e.hasMoreElements()) {
			Object oo = (Object)e.nextElement();
			System.out.println(oo);
		}
		System.out.println("Rest of the code...");
	}

}
