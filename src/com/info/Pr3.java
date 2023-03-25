package com.info;


//class 1
class Emp
{// Instance Variable
	int a = 50 ;
	int b = 40 ;
	
	public void Employee ()
	{
			// local Variable
			int a = 200;
			int b = 300;
			System.out.println("Local Variable1 "+ a);
			System.out.println("Local Variable2 "+ b);
			System.out.println(" ");
			
			Emp e = new Emp();
			System.out.println("Instance Variable1 "+ e.a);
			System.out.println("Instance Variable2 "+ e.b);
			System.out.println(" ");
		
	}
}

//class 2
class Stud
{// Static Variable
	static String a = "23";
	static int b = 43;
	public void Student()
	{
		// Static variable from Data1
		System.out.println("Static Variable1 "+ Stud.a);
		System.out.println("Static Variable2 "+ Stud.b);
	
	}
}
//Main Class
public class Pr3 {
	
//Method
	public void m1 (Emp e, Stud s)
	{
		e.Employee();
		s.Student();
	}
	public static void main(String[] args) {
	Pr3 d = new Pr3();
	Emp e = new Emp();
	Stud s = new Stud (); 
	d.m1(e, s);

	}

}


