package com.assign;
//Q18 remove all occurrences of a given character from input String?
//Hint String str1=abcdABCDabcdABCD;
//remove character => a

public class Quest18 {

	public static void main(String[] args) {
		
		String str1 = "abcdABCDabcdABCD";
		
		String b = str1.replaceAll("a","");
		System.out.println("Original \n"+str1);
		System.out.println("After Removed \n"+b);
	}

}
