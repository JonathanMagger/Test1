package com.method;
class Bugu{
	public void m1(){
		System.out.println("p");
	}
}
public class Over extends Bugu{
	public void m1(){
		System.out.println("c");
	}
	
	public static void main(String[] args) {
		Bugu b = new Bugu();
		b.m1();
		Over o = new Over();
		o.m1();
		Bugu c = new Over();
		c.m1();
		
	}
}
