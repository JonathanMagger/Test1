package com.info;

//class 1
class Emp1
{	
	public void Employee ()
	{
			// local Variable 1
			int a = 200;
			
			System.out.println("Local Variable1 "+ a);
			
	}
	
}
//class 2
class Par 
{
	//Instance Variable 1
		int a = 50 ;
		public void Parent () 
		{
				// local Variable 2
				int a = 300;
				System.out.println("Local Variable2 "+ a);
				System.out.println(" ");
				
				// instance variable 1
				Par e = new Par();
				System.out.println("Instance Variable1 "+ e.a);

			
		}
		
}
//class 3
class Chil extends Par
{
	int a = 40 ;
	public void Child ()
{
		// instance variable 2
	Chil e = new Chil();
	System.out.println("Instance Variable2 "+ e.a);
	System.out.println(" ");
}
}

//class 4
class Kid
{// Static Variable1
	static int a = 23;
			public void Kids()	
			{
				// Static variable from Data1
				System.out.println("Static Variable1 "+ Kid.a);
			}
}

//class 5
class Stud1
{
	// Static Variable2
	
	static int a = 43;
	public void Student()
	{
		// Static variable from Data1
		System.out.println("Static Variable2 "+ Stud1.a);
	
	
	}
}
//Main Class
public class Pr4 {
	
//Method
	public void m1 (Emp1 e, Par p, Chil c, Kid k, Stud1 s)
	{
		e.Employee();
		p.Parent();
		c.Child();
		k.Kids();
		s.Student();
		
	}
	public static void main(String[] args) {
	Pr4 d = new Pr4();
	Emp1 e = new Emp1();
	Par p = new Par();
	Chil c = new Chil();
	Kid k = new Kid();
	Stud1 s = new Stud1 (); 
	d.m1(e, p, c, k, s);

	}

}

