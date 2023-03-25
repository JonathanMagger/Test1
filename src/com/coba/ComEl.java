package com.coba;

import java.util.ArrayList;

public class ComEl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		al.add("asa");
		al.add("basa");
		al.add("ada");
		al.add("casa");
		al.add("kaga");
		
		
		System.out.println("List 1 = "+ al);
		ArrayList<String> am =new ArrayList<String>();
		am.add("asa");
		am.add("basa");
		am.add("casa");
		am.add("masa");
		am.add("rasa");
		System.out.println("List 2 = "+ am);
		al.retainAll(am);
		System.out.println("Common Element = "+ al);
		
	}

}
