package com.make;

public class testlogic {

	void m1()
	{
		m2();
	}
	void m2()
	{
		m3();
	}
	void m3()
	{
		try {
			System.out.println(10/0);
		}
		catch (ArithmeticException ae) {
			//Exception information message
			System.out.println(ae.toString());
			System.out.println();
			System.out.println();
			
			System.out.println(ae.getMessage());
			System.out.println();
			System.out.println();
			
			System.out.println(ae);
			System.out.println();
			System.out.println();
			
			ae.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new testlogic().m1();
		      }
		    }