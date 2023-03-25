package com.method;

public class Data12 {
 // Method return type
	public int m1 ()
	{ 
		// Local Variable
		int a = 10;
		int b = 20;
		int c = a + b;
		return c;
	}
	public static void main(String[] args) {

		Data12 d = new Data12();
		int return_value = d.m1();
		System.out.println("Return Value is: " + return_value);

	}

}
