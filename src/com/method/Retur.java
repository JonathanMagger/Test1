package com.method;

class budi{
	public int a = 105;
	 public void m1(){
		 System.out.println("parent method");
	 }

	}

class Maman extends budi {
	public int b = 20;
	public void m2(){
		 System.out.println("Child method");
	 }
}
public class Retur extends Maman{
	
}