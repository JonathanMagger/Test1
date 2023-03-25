package com.coba;

import java.util.Scanner;

public class Invertcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")		
		Scanner ss = new Scanner(System.in);
		System.out.println("input String");
		String w = ss.nextLine();
		
		char [] c = w.toCharArray();
		
		for (int i=0; i<w.length(); i++) {
			if( c[i]>= 'A' && c[i]<='Z')
			{
				c[i] = (char)((int)c[i]+32);
				System.out.print(c[i]);
			}else if (c[i]>= 'a' && c[i]<='z') {
				c[i] = (char)((int)c[i]-32);
				System.out.print(c[i]);
			}else {
				System.out.print(c[i]);
			}
		}
		
	}

}
