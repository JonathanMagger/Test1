package com.connect;
class Gaj{
	//ins var
	int a;
	String b;
	//cons
	Gaj(int c, String d)
	{// convert local variable into instance variable
		this.a =c;
		this.b =d;
	}
}
public class Arin3 {

	public static void main(String[] args) {
		
		Gaj g1 = new Gaj(111,"Cur");
		Gaj g2 = new Gaj(222,"Dor");
		Gaj g3 = new Gaj(333,"EWh");
		
		//array
		Gaj [] g = new Gaj[3];
		
		//adding data
		g[0] = g1;
		g[1] = g2;
		g[2] = g3;
		
		for (Gaj gg: g)
		{
			System.out.println(gg.a+"---"+gg.b);
		}

	}

}
