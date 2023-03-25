package com.inter;
interface Fro1
{
	interface Fro2
	{
		void m2();

	}
	void m1();
}
public class Face7 implements Fro1.Fro2,Fro1 {

	@Override
	public void m1() {
	System.out.println("Method1");	
	
	}
	@Override
	public void m2() {
		System.out.println("Method2");	
		
	}
public static void main(String[] args) {
		Face7 f = new Face7();
		f.m1();
		f.m2();
	}
}
