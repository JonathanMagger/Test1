package com.make;

abstract class My
{
	abstract void m1();
}
public class Outer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		My m = new My() {
			@Override
			void m1() {
				System.out.println("Abstract anonymous Inner class");
			}
			
		}; m.m1();
	}

}
