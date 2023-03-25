package com.make;

public class Outer4 {
static int a = 150;
static class Inner{
	void m1 ()
	{
		System.out.println(Outer4.a);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer4.Inner ee = new Outer4.Inner();
		ee.m1();
	}

}
