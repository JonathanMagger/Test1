package com.connect;
import com.make.Tes1;
import com.make.Tes2;
public class Tesexe {

	public static void main(String[] args) throws InterruptedException {

		//Invoke package & modules
		double amon = 6000;
		String res1 = new Tes1(amon).deposite();
		System.out.println(res1);
		
		
		
		System.out.println("Withdraw 300 IDR");
		System.out.println();
		Tes2 e = new Tes2(300);
		e.m1(amon);
		String res2 = e.Withdraw();
		
		System.out.println(e.m2());
		System.out.println(res2);
	}

}
