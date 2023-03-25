package com.inter;
interface Era1
{
	void deposite();
	void withdraw();
}
interface Era2 
{

void status();
}
public class Face6 implements Era1,Era2 {

	@Override
	public void deposite() {
		System.out.println("Deposit");
		
	}

	@Override
	public void withdraw() {
		System.out.println("Withdraw");
		
	}
	
	@Override
	public void status() {
		System.out.println("Status");
		
	}
	
	public static void main(String[] args) {
		Face6 f = new Face6();
		f.deposite();
		f.withdraw();
		f.status();

	}
}
