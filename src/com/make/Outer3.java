package com.make;

public class Outer3 {
	//private variable
	 int v1 = 200;
	void m1()
	{int v1=100;
		class Inner
		{
			void m2 ()
			{
				Outer3 a =new Outer3();
				
				System.out.println("Result is : "+(v1+a.v1));
				
			}
		}Inner i = new Inner();
		i.m2();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Outer3 o = new Outer3();
o.m1();
	}

}
