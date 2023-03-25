package com.coba;

import java.util.Scanner;

class Form{
	
	public boolean m1 (String l) {
		String a = l;
		for ( int i=0; i<a.length();i++) {
			for (int j=i+1;j<a.length();j++) {
				if (a.charAt(i)==a.charAt(j)) {
					return true;
				}
	}
}
		return false;
	}
}
public class Uniqcar {

	public static void main(String[] args) {
		System.out.println("Input String ");
		@SuppressWarnings("resource")
		Scanner ss = new Scanner(System.in);
		String l = ss.nextLine();
	
		Form f = new Form();
		
		if (f.m1(l)) {
			System.out.println("the string "+l+" has duplicate character");}
			else {
				System.out.println("the string "+l+" has all unique character");
			}	
			}
		}