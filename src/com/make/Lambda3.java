package com.make;

public class Lambda3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Thread class
		Runnable r1 = new Runnable() {
			@Override
			public void run() {
				System.out.println("My Thread 1 is started.....");
				System.out.println();
			}
		};
		Thread t1 = new Thread(r1);
		t1.start();
		
		//Lambda expression
		Runnable r2 = ()->{
			System.out.println("Mythread 2 i started");
		};
		Thread t2 = new Thread (r2);
		t2.start();
	}
}