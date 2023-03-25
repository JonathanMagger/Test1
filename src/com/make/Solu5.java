package com.make;

import java.util.Scanner;

public class Solu5 {
	
	public static void main(String args[]){  
		
		System.out.println("Input Palindrome Number");
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		  int r,sum=0,temp;    
		  int n=s.nextInt();//It is the number variable to be checked for Palindrome  
		  
		  temp=n;    
		  while(n>0){    
		   r=n%10;  //getting remainder  
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");    
		}  // Q6 second
		}  
	