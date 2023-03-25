package com.inter;
interface IT2
{
	void deposite();
	void withdraw();
	void status();
}
public class Face1 implements IT2 {

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
		System.out.println("status. . . ");
		
	}
	
	public static void main(String[] args) {
		Face1 f = new Face1 ();
		f.deposite();
		f.withdraw();
		f.status();

	}



}
