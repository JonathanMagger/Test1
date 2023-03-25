package com.method;

class Parent1{
	static {
		System.out.println("Parent Static block 1 . . . ");
	}
	{
		System.out.println("parent block 1 . . . ");
	}
	 public Parent1()
	{
	
		
		System.out.println("parent con 1 . . . ");
	}
	public Parent1(int a)
	{
		System.out.println("parent con 2 . . . ");
	}
	public void m1() {
		System.out.println("parent met 1 . . . ");
	}
}

public class Coba2 extends Parent1 {

	static {
		System.out.println("Child Static block 1 . . . ");
	}
	{
		System.out.println("Child block 1 . . . ");
	}
	public Coba2() {

		
		System.out.println("child con 1 . . .");
	}
	public Coba2(int a) {
		
		System.out.println("child con 2 . . .");
	}
	public Coba2(int a, int b) {
	
		
		System.out.println("child con 3 . . .");
	}
	public void m1() {
		
		System.out.println("child met 1 . . . ");
	}
	public void result() {
		
	
		super.m1();
		this.m1();
	}
	
	public static void main(String[] args) {
		
		new Coba2().result();

	}

}
