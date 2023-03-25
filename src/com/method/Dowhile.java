package com.method;

public class Dowhile {

	public static void main(String[] args) throws InterruptedException {
		int a = 10;
		
		do {
			System.out.println("name is jo - "+a);
			a -=1;
			
			
				Thread.sleep(1000);
		
			
		} while (a>0);
		System.out.println("loop ends . . . ");
	
	}
}
