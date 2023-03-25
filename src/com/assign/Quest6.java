package com.assign;
//Q6 Write a Java Program for the Fibonacci series

import java.util.Scanner;

public class Quest6 {

	public static void main(String args[])  {   
		
	@SuppressWarnings("resource")
	Scanner s = new Scanner(System.in);
	System.out.println("Input Total Fibonacci Series");
	 int n1=0,n2=1,n3,i,count=s.nextInt();    
	 System.out.print(n1+" "+n2);//printing 0 and 1    
	    
	 for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
	 {    
	  n3=n1+n2;    
	  System.out.print(" "+n3);    
	  n1=n2;    
	  n2=n3;  
	  
	 }System.out.println(); 
	  
	  
	}
}
