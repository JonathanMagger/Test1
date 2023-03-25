package com.make;
@FunctionalInterface
interface Student2
{
	public String Exam(String a);
}

public class Lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student2 aa = (b)-> {
			return "subject name is: "+ b;
		};
		System.out.println("message is: " + aa.Exam("Javacode"));
	System.out.println();
	Student2 aa2 = a-> {
		return "subject name is: "+ a;
	};
	System.out.println("message is: " + aa2.Exam("Phyton Code"));
	}

}
