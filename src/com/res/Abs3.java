package com.res;

abstract class Testa{
	public Testa()
	{
		System.out.println("Testa Constructor 1");
	}
	abstract void deposite();
	abstract void withdraw();
}
abstract class Testb extends Testa {
	public Testb() {
		super();
		System.out.println("Testb Constructor 2");
	}
	@Override
	void deposite() {
		System.out.println("Deposite");
	}
}

public class Abs3 extends Testb {
	public Abs3()
	{
		super();
		System.out.println("Abs3 Constructor 3");
	}

	@Override
	void withdraw() {
		System.out.println("Withdraw");
	}
	public static void main(String[] args) {
		Abs3 d = new Abs3();
		d.deposite();
		d.withdraw();
		
	}

}
