package com.connect;

public class Stir5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Marry Go Round";
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		System.out.println();
		System.out.println(a.split(" "));
		String[] d = a.split(" ");
		for(String aa:d)
		{
			System.out.println(aa);
		}
		System.out.println();
		String b = "     Sayonara    ";
		String c = b.trim();
		System.out.println(c);
		System.out.println(c.substring(2));
		System.out.println(c.substring(2,7));
		
		
	}

}
