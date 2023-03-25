package com.make;

public class Outer {

	private int v1 = 100;
	
	class Inner{
		void m1()
		{
			System.out.println(v1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Outer o = new Outer();
Outer.Inner i = o.new Inner();
i.m1();
	}

}
