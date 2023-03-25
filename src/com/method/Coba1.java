package com.method;

public class Coba1 extends Parent {
	
	public Coba1()
	{
		
		super(100);
		System.out.println("conc");
	}
	
	String a ="Child";
	public void m1(int a, int b) {
		System.out.println(super.a);
		System.out.println(this.a);
		System.out.println("metc");
		System.out.println (a+b);
	}
		public void result()
		{
			
			super.m1();
			this.m1(100,200);
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Coba1().result();
		
	}

}

class Parent{
	String a ="Parent";
	public Parent()
	{
		System.out.println("conp1");
	}
	public Parent(int a)
	{
		System.out.println("conp2");
	}
	public void m1() {
		System.out.println("metp");
	}
}
