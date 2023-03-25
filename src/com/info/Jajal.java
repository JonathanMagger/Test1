package com.info;

public class Jajal {
	
	public Jajal ()
	{
		
		int a = 200;
		System.out.println(a);
	}
	static
	{
		int a = 30;
		System.out.println(a);	
	}
	
	
	{
		System.out.println("Cons 2");
	}
	public Jajal (double a,int b)
	{
		System.out.println("Cons 3");
	}
	public void coba ()
	{
		System.out.println("Coba");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*new Jajal();
	new Jajal(1.1,1);*/
	Jajal ee = new Jajal();
	ee.coba();
	
	}

}
