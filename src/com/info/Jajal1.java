package com.info;
import java.util.Scanner;
public class Jajal1 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//Conditional Statement
		//Dynamic Value
		Scanner ss = new Scanner(System.in);
		System.out.println("Enter user value");
		int a = ss.nextInt();
		
		System.out.println("Enter user value");
		int b = ss.nextInt();
		
		switch (a) {
		case 5:
			System.out.println("case 5a");
			break;
		case 10:
			System.out.println("case 10a");
			break;
		case 15:
			System.out.println("case 15a");
			break;
		case 20:
			System.out.println("case 20a");
			break;
			default:System.out.println("no case");
		}
		switch (b) {
		case 5:
			System.out.println("case 5b");
			break;
		case 10:
			System.out.println("case 10b");
			break;
		case 15:
			System.out.println("case 15b");
			break;
		case 20:
			System.out.println("case 20b");
			break;
		default:System.out.println("no case");
		}
	}

}
