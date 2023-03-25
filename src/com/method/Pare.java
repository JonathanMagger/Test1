package com.method;

class Ibu{
	public Ibu() {
		System.out.println("CP");
	}
	static {
		System.out.println("SP");
	}
	 {
		System.out.println("IP");
	}
	 static void baba() {
		 System.out.println("SMP");
	 }
	 void bapak () {
		 System.out.println("MP");
	 }
	 void m1() {
		 System.out.println("par 1");
	 }
	 void m2() {
		 System.out.println("Par 2");
	 }
}
public class Pare extends Ibu {
	public Pare() {
		System.out.println("CC");
	}
	static {
		System.out.println("SC");
	}
	 {
		System.out.println("IC");
	}
	 static void melon() {
		 System.out.println("Smelon");
	 }
	 void bobo() {
		 System.out.println("bobo");
	 }
	 @Override
	 void m1() {
		 System.out.println("Cil1");
	 }
	 void m3() {
		 System.out.println("cil3");
	 }
	public static void main(String[] args) {
		Pare p = new Pare();
		Ibu i = new Ibu();
		p.m1();
		p.m2();
		p.m3();
		i.m1();
		i.m2();
		
		

	}

}
