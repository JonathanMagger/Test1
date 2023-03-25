package com.inter;
interface Cer1
{
	void deposite();
}
interface Cer2
{
void withdraw();
}
interface Cer3 extends Cer1,Cer2
{

void status();
}
abstract class Abs1 implements Cer3
{
	@Override
	public void deposite() {
		System.out.println("Deposite. . . ");
	}

	@Override
	public void withdraw () {
		System.out.println("Withdraw. . . ");
	}

	@Override
	public void status() {
		System.out.println("Status. . . ");
	}
}
public class Face5 extends Abs1 {

	public static void main(String[] args) {
		Face5 f = new Face5();
		f.deposite();
		f.withdraw();
		f.status();

	}

}
