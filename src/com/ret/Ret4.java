package com.ret;

public class Ret4 {
	int a = 10;
			int m1 (int a)
			{
		return a;
			}
			int b = 12;
					int m2()
					{ 
				return b;
					}
					int c = 100;
					int m3 (int c)
					{
						return this.c;
					}
	public static void main(String[] args) {
		Ret4 r = new Ret4();
		int z = r.m1(20);
		System.out.println("Result is : " + z);
		int y = r.m2();
		System.out.println("Result is : " + y);
		System.out.println("Result is : " + r.m3(200));
	}

}
