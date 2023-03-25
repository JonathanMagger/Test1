package com.method;

public class Cons {
public Cons() {

	System.out.println("Zero Argument Cons");
}
	public Cons(int a) {
	
		System.out.println("one ar");
	}
		public Cons (int a, int b) {
		System.out.println("two");
	}
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	

Cons a = new Cons();
Cons b = new Cons(10);
Cons c = new Cons (10,21);

System.out.println();
new Cons();
new Cons(10);
new Cons (10,21);

	}
}
