package com.ret;

public class Ret3 {
	//Method
	Ret3 m1()
	{
		System.out.println("Method 1");
		Ret3 r = new Ret3();
		return r;
	}
	Ret3 M2()
	{
		System.out.println("Method 2");
		return this;
	}
	
	public static void main(String[] args) {
		Ret3 r1 = new Ret3();
		Ret3 r2 = r1.m1();
		System.out.println(r2);
		System.out.println();
		Ret3 r3 = r1.M2();
		System.out.println(r3);
		

	}

}
