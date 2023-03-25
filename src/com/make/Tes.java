package com.make;

@SuppressWarnings("serial")
class InvalidAgeException extends Exception{
	//parameterized constructor
	public InvalidAgeException (String r) {
		super (r);
	}
}

public class Tes {

	static void m1(int age) throws InvalidAgeException
	{
		if (age>18)
			{System.out.println("Valid User for Driving");
			}
		else {
			throw new InvalidAgeException("you are not valid to apply for driving");
		}
	}
	
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) throws InvalidAgeException {
		// TODO Auto-generated method stub
		int age = 10;
		new Tes().m1(age);

}
}