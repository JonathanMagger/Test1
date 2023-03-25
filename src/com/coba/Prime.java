package com.coba;

import java.util.Scanner;

public class Prime {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ss = new Scanner(System.in);
		System.out.println("Input Prime Number ");
		int P = ss.nextInt();
		boolean flag = false;
		for (int i = 2; i<P/2; i++) {
			if(P%i==0) {
				flag = true;
				break;
			}
		}
		if (flag)
		{
			System.out.println("not Prime number");
		}else 
			System.out.println("Prime number");
	}

}
