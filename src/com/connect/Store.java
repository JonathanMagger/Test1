package com.connect;

import java.util.Scanner;

public class Store {

	public static void show(Phone p)
	{
		p.showconfig();
	}
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		
		Samsung s = new Samsung();
		Apple a = new Apple();
		
		
		Scanner ss = new Scanner(System.in);
		System.out.println("Welcome to Mobile Store Application");
		System.out.println("Select Your Phone Product");
		System.out.println("Samsung - s & Apple - a");
		System.out.println();
		System.out.println("Enter your product short name: ");
		String data = ss.next();
		System.out.println();
		
		if (data.equalsIgnoreCase("s"))
		{
			Store.show(s);
		}
		else if (data.equalsIgnoreCase("a")){
				Store.show(a);
		}
		else {
		System.out.println("Select right operation only");
		
	}
		
	}}
