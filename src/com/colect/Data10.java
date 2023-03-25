package com.colect;

import java.util.ArrayList;

class Movie
{
	int mid;
	String mname;
	
	public Movie(int mid, String mname) {
		super();
		this.mid = mid;
		this.mname = mname;
	}
}
public class Data10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie m1 = new Movie(101,"ABC");
		Movie m2 = new Movie(102, "DEF");
		
		//Array List-1
		ArrayList<Movie> al1 = new ArrayList<Movie>();
		al1.add(m1);
		al1.add(m2);
		
		Movie m3 = new Movie(103,"GHI");
		Movie m4 = new Movie(104, "JKL");
		
		ArrayList<Movie> al2 = new ArrayList<Movie>();
		al2.addAll(al1);
		al2.add(m3);
		al2.add(m4);
	
		System.out.println(al2.containsAll(al1));
		System.out.println();
		for(Movie mm :al2)
		{
			System.out.println("Movie ID : "+mm.mid+" -> "+"Movie Name :"+mm.mname);
		}
		System.out.println();
		System.out.println(al2.contains(m1));
		al2.remove(m1);
		System.out.println(al2.contains(m1));
		System.out.println(al2.containsAll(al1));
		
		System.out.println();
		for ( Movie mm : al2) {
			System.out.println("Movie ID : "+mm.mid+" -> "+"Movie Name :"+mm.mname);
		}
	}

}
