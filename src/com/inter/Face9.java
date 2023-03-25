package com.inter;
interface Han1
{
	void m1();
	void m2();
	void m3();
	void m4();
	void m5();
	void m6();
	void m7();
	void m8();
	void m9();
	
}
class Adapter implements Han1
{

	@Override
	public void m1() {
	}

	@Override
	public void m2() {
	}

	@Override
	public void m3() {
	}

	@Override
	public void m4() {
	}

	@Override
	public void m5() {
	}

	@Override
	public void m6() {
	}

	@Override
	public void m7() {	
	}

	@Override
	public void m8() {
	}

	@Override
	public void m9() {
	}
	
}
public class Face9 extends Adapter{

	@Override
	public void m1() {
		System.out.println("Method 1");
		
	}
	@Override
	public void m5() {
		System.out.println("Method 5");
		
	}
	public static void main (String[]args) {
		new Face9().m1();
		new Face9().m5();
	}
}
