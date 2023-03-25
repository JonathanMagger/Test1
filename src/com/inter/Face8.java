package com.inter;
abstract class Gior{
	void m2() {
		
	}
	
	interface Goma{
		void m1();
	}
}

public class Face8 extends Gior implements Gior.Goma {

	public static void main(String[] args) {
		Face8 f = new Face8();
				f.m1();
				f.m2();

	}

	@Override
	public void m1() {
		
		System.out.println("Method 1");
	}
	@Override
	public void m2() {
		System.out.println("Method 2");
	}

}
