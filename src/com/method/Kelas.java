package com.method;

public class Kelas {

	public static void main(String[] args) {
		int i,j;
		 for (i = 0; i<15; i++)
		 {
			 if (i<=4)
			 {
			 for (j=15-i;j>0;j--)
			 {
			System.out.print(" ");
			 }
			 for (j=0; j<=i;j++)
			 {
				 System.out.print("* ");
			 
			 }System.out.println();
			 }
			 else 
			 { 
				 for (j=0;j<=12;j++)
				 {
					 System.out.print(" "); 
				 }
				 for (j=2; j>=0;j--)
				 {
					 System.out.print("* ");
				 
				 }System.out.println();
			 }
	}}}
