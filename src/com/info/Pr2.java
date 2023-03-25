package com.info;

public class Pr2 {
	
		
		// Instance Variable
		int a = 50 ;
		int b = 40 ;
		
		public void m1()
		{
			// local Variable
			int a = 200;
			int b = 300;
			System.out.println("Local Variable "+ a);
			System.out.println("Local Variable "+ b);
			System.out.println(" ");
			
			Pr2 e = new Pr2();
			System.out.println("Instance Variable "+ e.a);
			System.out.println("Instance Variable "+ e.b);
			System.out.println(" ");
			
			// Static variable from Data1
			System.out.println("Static Variable "+ Data1.a);
			System.out.println("Static Variable "+ Data1.b);
		}
	public static void main(String[] args) {
		
		Pr2 bb = new Pr2();
		bb.m1();
	}

}
