package com.make;
interface OuterInterface
{
	interface InnerInterface{
		void m1();
	}
}
public class Outer5 implements OuterInterface.InnerInterface {
@Override
public void m1() {
	System.out.println("Inner Interface");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
OuterInterface.InnerInterface i = new Outer5();
i.m1();
System.out.println();
new Outer5().m1();
	}

}
