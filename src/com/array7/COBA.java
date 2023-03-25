package com.array7;

public class COBA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s= 12345678;
		String w = Integer.toString(s);
		String z="";
		for (int i =0; i<w.length();i++) {
			if (Character.getNumericValue(w.charAt(i))%2==0) {
				z +=Character.getNumericValue(w.charAt(i));
			}
			else {}
		}
		System.out.println(z);
	}

}
