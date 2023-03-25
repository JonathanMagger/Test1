package com.coba;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;



public class Distinc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner ss = new Scanner(System.in);
		System.out.println("input String : ");
		String a = ss.nextLine();
		char [] c = a.toCharArray();
		TreeSet <Character> link = new TreeSet<Character>();
		for (char d: c) {
			link.add(d);
		}
		System.out.println(link);
		Iterator<Character> itr = link.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next());
		}
	}

}
