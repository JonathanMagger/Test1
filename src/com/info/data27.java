package com.info;

public class data27 {
	public data27()
	{
		System.out.println("Constructor 1");
	}

	public data27(int a)
	{
		System.out.println("Constructor 2");
	}
	public static void main(String[] args) {
	
	int a = 11;
	if (a == 10)
	{
	new data27(a);
	}
	else
	{
	new data27();
	}
	}
}
