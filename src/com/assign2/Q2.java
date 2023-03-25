package com.assign2;
//Q2 How to Count Number of Word in String?

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String str = "welcome to here123";
		  String s = str.replaceAll("[^A-Za-z]*", "");
		  System.out.println(s);
	      System.out.println(s.length());
	    }
	}

