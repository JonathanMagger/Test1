package com.res;
abstract class Test1{
	
	abstract void deposite();
	abstract void withdraw();
	abstract void Status();
}
public class Abstract1 extends Test1{
	
	@Override
	void deposite()
	{
		System.out.println("Deposite");
	}
	public static void main(String[] args) {
		
		Abstract1 k = new Abstract1 ();
		k.deposite();

	}
	@Override
	void withdraw() {
		// TODO Auto-generated method stub
		
	}
	@Override
	void Status() {
		// TODO Auto-generated method stub
		
	}

}
