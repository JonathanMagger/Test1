package com.make;
//interface
interface IT1
{
	void m1();
}
public class Outer2 {

	public static void main(String[] args) {
		IT1 i = new IT1() {
			@Override
			public void m1() {
				System.out.println("Interface Anonymous Inner class");
			}
		};
		i.m1();
	}

}
