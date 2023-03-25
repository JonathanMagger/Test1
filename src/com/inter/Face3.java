package com.inter;

interface IT4{
	void deposite ();
	void withdraw ();
	void status ();
}
abstract class Child implements IT4
{
	@Override
	public void deposite() {
		System.out.println("deposite . . . ");
	}
}
abstract class Child1 extends Child
{
	@Override
	public void withdraw () {
		System.out.println("withdraw . . . ");
	}
}
class Child2 extends Child1
{
	@Override
	public void status() {
		System.out.println("status . . . ");
	}
}

public class Face3 extends Child2 {

	public static void main(String[] args) {
		Face3 f = new Face3();
		f.deposite();
		f.withdraw();
		f.status();

	}

}
