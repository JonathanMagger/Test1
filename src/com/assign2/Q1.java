package com.assign2;
//Q1 Write a java program to find out if the given String has All Unique Character.

public class Q1 {

    boolean uniqueCharacters(String str)
    {
        // If at any time we encounter 2 same
        // characters, return false
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)){
                	return false;
                }}}
        // If no duplicate characters encountered,
        // return true
                
                 return true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Java program to illustrate string with
		// unique characters using brute force technique
		        Q1 a = new Q1();
		        String b = "abababa";
		 
		        if (a.uniqueCharacters(b)) {
		            System.out.println("The String " + b + " has all unique characters");}
		        else
		            {System.out.println("The String " + b + " has duplicate characters");}
		    }
		}
	

