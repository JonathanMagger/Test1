package com.connect;
class Har{
	//instant variable
		int a;
		String b;
		//cons
		Har(int c, String d)
		{// convert local variable into instance variable
			this.a =c;
			this.b =d;
		}
}

public class Arin4 {

	public static void main(String[] args) {
		
		Har h1 = new Har(111,"Cur");
		Har h2 = new Har(222,"Dor");
		Har h3 = new Har(333,"EWh");
		
		//array
		Har [] h = new Har[5];
		
		//adding data
		h[0] = h1;
		h[2] = h2;
		h[3] = h3;
		
		for (Object ob: h)
		{
			if (ob instanceof Har) {
				Har hh = (Har)ob;
			
			System.out.println(hh.a+"---"+hh.b);//Type Casing
			}
			else if  (ob == null)
			{
				System.out.println(ob);
			}
		
		}

	}

}
