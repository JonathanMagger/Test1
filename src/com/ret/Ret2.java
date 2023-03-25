package com.ret;
class Ins1
{
	void rec1()
	{
		System.out.println("Instinct Class Data");
	}
}
class Har1
{
	void rec2()
	{
		System.out.println("Harmony Class Data");
	}
}

public class Ret2 {
	Ins1 m1()
	{
		System.out.println("Instinct Method");
		Ins1 i = new Ins1();
		return i;
	}
	Har1 m2()
	{
		System.out.println("Harmony Method");
		Har1 h = new Har1();
		return h;
	}
	
	public static void main(String[] args) {
		Ret2 r = new Ret2();
		Ins1 i1 = r.m1();
		i1.rec1();
		System.out.println();
		Har1 h1 = r.m2();
		h1.rec2();

	}

}
