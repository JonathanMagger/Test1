package com.colect;

import java.util.ArrayList;

class Movie1
{
	int mid;
	String mname;
	
	public Movie1(int mid, String mname) {
		super();
		this.mid = mid;
		this.mname = mname;
	}
}
public class Data11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Movie1> al1 = new ArrayList<Movie1>();
		al1.add(new Movie1(101,"ABC"));
		al1.add(new Movie1(102, "DEF"));
		
		ArrayList<Movie1> al2 = new ArrayList<Movie1>();
		al2.add(new Movie1(101,"ABC"));
		al2.add(new Movie1(102, "DEF"));
		
		for (Movie1 mm : al2)
		{
			System.out.println("Movie ID : "+mm.mid+" -> "+"Movie Name :"+mm.mname);
		}
		System.out.println();
		System.out.println();
		
		//Getting Record based on Index Position
		Movie1 mm = al2.get(1);
		System.out.println(mm.mid+ " -- "+mm.mname);
	}

}
