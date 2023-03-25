package com.assign2;
//Q13 How to calculate total number of vowel in String?

public class Q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s =" Jonathan ";
String l = s.replaceAll("[^aiueoAIUEO]*", "");
		System.out.println(l.length());
	}

}
