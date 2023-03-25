package com.modif;
abstract class Test{
	abstract void deposite();
	abstract void withdraw();
	abstract void Status();
	public Test{
}

 public class Abs extends Test {

	
	 
		void deposite() {
			System.out.println("Deposite");
		}

	 void withdraw() {
		 System.out.println("Withdraw");
	 }

	 void Status() {
		 System.out.println("Status");
	 }
		public static void main(String[] args) {
			
			Abs a = new Abs();
			a.deposite();
			a.withdraw();
			a.Status();
	}

}
