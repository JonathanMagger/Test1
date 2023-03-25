package com.inter;


	interface Dar1{
		void deposite();
	}
	interface Dar2 extends Dar1 {
		void withdraw();
	}
	interface Dar3 extends Dar2 {
		void status();
	}
	class Test4 implements Dar3 {
		
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
	}
	public class Face4 extends Test4 {
		
		
	public static void main(String[] args) {
		Face4 f = new Face4();
		f.deposite();
		f.withdraw();
		f.status();

	}



	

}
