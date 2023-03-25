package com.info;

public class Data1 {

	public Data1() {
		System.out.println("test");
	}
	// Static Variable
	static String a = "23";
	static int b = 43;
	// Instance Variable
	int c = 50;
	int d = 40;
	
	public void m1()
	{
		// local Variable
		int e = 200;
		int f = 300;
		System.out.println("Local Variable "+ e);
		System.out.println("Local Variable "+ f);
		System.out.println(" ");
		System.out.println("Instance Variable "+ c);
		System.out.println("Instance Variable "+ d);
		System.out.println(" ");
		System.out.println("Static Variable "+ Data1.a);
		System.out.println("Static Variable "+ Data1.b);
		
	}
	public static void main(String[] args) {

		// Object 
		Data1 ee = new Data1();
		ee.m1();
	}

}
