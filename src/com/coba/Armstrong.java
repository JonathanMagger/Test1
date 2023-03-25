package com.coba;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner ss = new Scanner(System.in);
		System.out.println("Input Armstrong Number ");
		int Ar = ss.nextInt();
		int Originalnumber = Ar;
		int remainder = 0;
		int result = 0;
		int Digit = 0;
		int Temp = Ar;
		while (Temp !=0)
		{
			Digit++;
			Temp /= 10;
		}
			
		while( Originalnumber !=0)
		{
			remainder = Originalnumber%10;
			result += Math.pow(remainder, Digit);
			Originalnumber /=10;
		}
		if (result == Ar)
		{
			System.out.println("Armstrong");
		}
		else {
			System.out.println("not Armstrong");
		}
	}

}
