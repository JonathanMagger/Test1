package com.inter;
interface IT3{
	void deposite ();
	void withdraw ();
	void status ();
}
class Test implements IT3{
	
	@Override
	public void deposite() {
		System.out.println("deposite. . . ");
		
	}

	@Override
	public void withdraw() {
		System.out.println("withdraw. . . ");
		
	}

	@Override
	public void status() {
		System.out.println("Status. . . ");
		
	}
	
}
public class Face2 extends Test {


	public static void main(String[] args) {

		Face2 f = new Face2();
		f.deposite();
		f.withdraw();
		f.status();

	}
}
