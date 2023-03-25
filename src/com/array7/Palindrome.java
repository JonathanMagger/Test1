package com.array7;

public class Palindrome {

	public static void main(String[]args) {
		
		int N = 300;
		for (int i =0; i<N; i++) {
		if(i>9 && palindrome(i)) {
			System.out.println(i);
		}
		}
	}
	
	public static boolean palindrome(int i) {
		String str = String.valueOf(i);
		StringBuffer buf = new StringBuffer(str);
		String rev = buf.reverse().toString();
		int number = Integer.parseInt(rev);
		return number == i;
		
		
	}
}
