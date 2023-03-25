package com.make;
//exe di com connect tesexe
public class Tes2 {
	
	public void m1(double a)
	 {
		this.basic_amount=a;
	 }
	public double m2()
	 {
		return basic_amount;
		
	 }
	double basic_amount;
	double amount;
	// Constructor
	public Tes2(double amount)
	{
		this.amount = amount;
	}
	
	
	
	 //method
	 public String Withdraw()
	 {
		 return "Amount left is : " + (basic_amount-amount);
	 }
}
