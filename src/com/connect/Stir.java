package com.connect;

public class Stir {

	
		int a;
		String s;
		
		Stir (int id, String name)
		{
			this.a = id;
			this.s = name;
		}
		@Override
		public String toString()
		{
			return "Employee ID : "+a+"\nEmployee Name : "+s+"\n";
		}
		public static void main(String[] args) {
			Stir t = new Stir(101,"jojo");
			System.out.println(t);
			System.out.println(t.toString());
			
	}

}
