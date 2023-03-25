package com.coba;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("input factorial number: ");
		@SuppressWarnings("resource")
		Scanner ss = new Scanner(System.in);
		int f = ss.nextInt();
		int l=1;
		for (int i=1; i<=f;i++) {
			l *=i;
		}System.out.println("Factorial is: "+l);
	}

}
