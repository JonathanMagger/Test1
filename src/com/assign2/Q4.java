package com.assign2;
//Q4 write a java program to check whether two given Strings are anagram.

import java.util.Arrays;

public class Q4 {


		// TODO Auto-generated method stub
		static boolean areAnagram(String tes, String tes2)
	    {
			 
			   // Creating array of string length 
	        // using length() method 
	        char[] str1 = new char[tes.length()];
	        char[] str2 = new char[tes2.length()];
	        for (int i=0;i<tes.length();i++) {
	        	str1[i]=tes.charAt(i);
	        }
	        for (int i=0;i<tes2.length();i++) {
	        	str2[i]=tes2.charAt(i);
	        }
	        // Get lengths of both strings
	        int n1 = str1.length;
	        int n2 = str2.length;
	 
	        // If length of both strings is not same,
	        // then they cannot be anagram
	        if (n1 != n2)
	            return false;
	 
	        // Sort both strings
	        Arrays.sort(str1);
	        Arrays.sort(str2);
	 
	        System.out.println(Arrays.toString(str1));
	        System.out.println(Arrays.toString(str2));
	        
	        // Compare sorted strings
	        for (int i = 0; i < n1; i++)
	            if (str1[i] != str2[i])
	                return false;
	 
	        return true;
	    }
	 
	    /* Driver Code*/
	    public static void main(String args[])
	    {
	    	 // Custom input string 
	        String tes = "silent"; 
	        String tes2 = "t213ns"; 
	        
	      
	       
	 System.out.println(areAnagram(tes,tes2));    
	       
	        // Function Call
	        if (areAnagram(tes, tes2))
	            System.out.println("The two strings are"
	                               + " anagram of each other");
	        else
	            System.out.println("The two strings are not"
	                               + " anagram of each other");
	}

}
