package com.method;

class Flam {
	int a = 3;				
}
class Girr {
	int a =4;
	
}

class Houn {
	static int a = 5;
}

public class Alternate {
 static int a = 6;
	public void M1() {
		int a = 1;
		System.out.println("Local Variable1 "+ a);	
	}
	public void M2(){
		// local Variable
		int a = 2;
		System.out.println("Local Variable2 "+ a);
		System.out.println(" ");
		Flam f = new Flam();
		System.out.println("Instance Variable1 "+ f.a);
		Girr g = new Girr();
		System.out.println("Instance Variable2 "+ g.a);
		System.out.println(" ");
		System.out.println("Static Variable1 "+ Houn.a);
		System.out.println("Static Variable2 "+ Alternate.a);
		
	}
	public static void main(String[] args) {

		Alternate ee = new Alternate();
		ee.M1();
		ee.M2();
	}

}
