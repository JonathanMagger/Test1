package com.res;
abstract class Test5{
	abstract void deposite();
	abstract void withdraw();
	abstract void status();
}
abstract class Bob extends Test5 {
	@Override
	void deposite() {
		System.out.println("Deposite");
	}
}
abstract class Cos extends Bob {
	@Override
	void withdraw() {
		System.out.println("Withdraw");
	}
}
 class Dod extends Cos {
	 @Override
	void status() {
		System.out.println("Status");
	}
}
public class Abs2 extends Dod {

	public static void main(String[] args) {

		Abs2 a = new Abs2();
		a.deposite();
		a.withdraw();
		a.status();
	}

}
