package com.modif;
class Carl{
	protected int a =10;
	
	protected void m1()
	{
		System.out.println("Protected Parent Method");
	}
}

public class Modi1 extends Carl {
protected int b =20;
	
	protected void m2()
	{
		System.out.println("Protected Child Method");
	}

	
}
