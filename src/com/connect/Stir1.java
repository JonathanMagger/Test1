package com.connect;

public class Stir1 {

	int a;
	String m;
	
	Stir1(int id, String name)
	{
		this.a = id;
				this.m = name;
	}
	@Override
	public String toString()
	{
		return a+ " "+m;
	}
	public static void main(String[] args) {
		Stir1 s = new Stir1(101, "monmon");
				System.out.println(s);
				System.out.println(s.toString());
	}

}
