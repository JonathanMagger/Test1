package com.method;


// class 1
class Emp
{// Instance Variable1
	int a = 50 ;
	
	public void Employee ()
	{
			// local Variable
			int a = 200;
			System.out.println("Local Variable1 "+ a);
	}		
	public void Employer ()
	{
			// local Variable
			int a = 300;
			System.out.println("Local Variable2 "+ a);
			System.out.println(" ");
			Emp e = new Emp();
			System.out.println("Instance Variable1 "+ e.a);
			
	}						
	}

// class 2
class Stud
{// Instance Variable 2
	int a = 40;
	public void Student()
	{
		// Static variable from Data1
		System.out.println("Instance Variable2 "+ a);
		System.out.println(" ");
	
	}
}

// class 3
class Par 
{// Static Variable 1
	static int a = 23;
	public void Parent()
	{
		System.out.println("Static Variable1 "+ Par.a);
	}
}
// class 4
class Chil
{// static Variable 2
	static int a = 43;
	public void Child()
	{
		System.out.println("Static Variable2 "+ Chil.a);
	}
	
}
// Main Class
public class Data7 {
	
// Method
	public void m1 (Emp e, Stud s, Par p, Chil c)
	{
		e.Employee();
		e.Employer();
		s.Student();
		p.Parent();
		c.Child();
	}
	public static void main(String[] args) {
	Data7 d = new Data7();
	Emp e = new Emp();
	Stud s = new Stud (); 
	Par p = new Par ();
	Chil c = new Chil ();
	d.m1(e, s, p, c);

	}

}
