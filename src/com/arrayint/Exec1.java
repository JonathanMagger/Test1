package com.arrayint;

public class Exec1 {


	public int[] m1()
	{
		System.out.println("method 1");
		int []a= {2,3,6,8,11};
		return a;
	}
	public void m2(double [] d)
	{
		System.out.println("method 2");
		for (double dd:d)
		{
			System.out.println("Method 2 value is: "+ dd);
		}
	}
	
	public static void main(String[] args) {

		Exec1 ee =new Exec1();
		int[] a =ee.m1();
		
		for(int aa :a)
		{
			System.out.println("Value method 1 is: " + aa);
		}System.out.println();
		double [] d = {3,4,6,11,14};
		ee.m2(d);
	}

}
