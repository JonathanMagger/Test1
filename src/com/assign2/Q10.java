package com.assign2;
//Q10 Convert Lowercase to Uppercase in java and uppercase to lowercase without using buil in method.

import java.util.Scanner;

public class Q10 {

	
	public static void main(String[] args) {
		 @SuppressWarnings("resource")
			Scanner s = new Scanner(System.in);
			 System.out.println("Enter String");	
			
			 String text = s.nextLine();		
		    char[] chars = text.toCharArray();
		    for (int i = 0; i < chars.length; i++)
		    {
		     
		        if (chars[i]>='A'&& chars[i]<='Z')
		        {
		            chars[i] = (char) ((int) chars[i] + 32);
		            System.out.print(chars[i]);
		        }
		        else if (chars[i]>='a'&& chars[i]<='z')
		        {
		        	chars[i] = (char) ((int) chars[i] - 32);
		            System.out.print(chars[i]);
		        }
		    }
		    
	}
}