package com.info;

class Koso{
	int a =100;
}
class Mobil{
	
	@Override
	public String toString()
	{
		return "jumlah" + b;
	}
	int b = 100; 
	public Koso m1() {
		System.out.println("di Mobil");
		Koso a =new Koso();
		
				return a;
	}
	
}

public class Jajal3 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobil ee = new Mobil();
		Koso d = ee.m1();
		System.out.println(ee);
		System.out.println(d);
				
	}
}
