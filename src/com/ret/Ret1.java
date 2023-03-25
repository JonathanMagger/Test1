package com.ret;
class Giant
{
	
}
class Suneo
{
	
}

public class Ret1 {
	
	//method
	Giant m1() {
		System.out.println("Giant Method");
		Giant g = new Giant();
		return g;
	}
	//Method 2
	Suneo m2()
	{
		System.out.println("Suneo Method");
		Suneo s = new Suneo();
		return s;
	}

	public static void main(String[] args) {
		Ret1 r = new Ret1();
		Giant g1 = r.m1();
		System.out.println(g1);
		System.out.println();
		Suneo s1 = r.m2();
		System.out.println(s1);

	}

}
