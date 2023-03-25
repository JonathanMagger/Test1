package com.inter;
import java.lang.Cloneable;
public class Face10 implements Cloneable{

	int a = 10;
	int b =20;
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Face10 f = new Face10();
		System.out.println("Value of A is = "+f.a);
		System.out.println("Value of A is = "+f.b);
		System.out.println();
		
		f.a = 99;
		f.b = 88;
		System.out.println("Value of A is = "+f.a);
		System.out.println("Value of A is = "+f.b);
		System.out.println();
		Face10 f1 = (Face10)f.clone();
		f.a = 200;
		f.b = 300;
		System.out.println("Value of A is = "+f1.a);
		System.out.println("Value of A is = "+f1.b);
		System.out.println("Value of A is = "+f.a);
		System.out.println("Value of A is = "+f.b);
		System.out.println();
		Face10 f2 = (Face10)f.clone();
		f.a = 400;
		f.b = 500;
		System.out.println("Value of A is = "+f2.a);
		System.out.println("Value of A is = "+f2.b);
		System.out.println("Value of A is = "+f1.a);
		System.out.println("Value of A is = "+f1.b);
		System.out.println("Value of A is = "+f.a);
		System.out.println("Value of A is = "+f.b);
	}

}
