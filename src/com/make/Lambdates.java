package com.make;

@FunctionalInterface
interface Espada
{
	String data(String name, String email, String city);
}
public class Lambdates {

	public static void main(String[] args) {

		Espada dd = (r,s,t)-> {
			String s1 = "Espada Name: " +r;
			String s2 = "Espada Email: " +s;
			String s3 = "Espada City: "+t;
			
			return s1+"\n"+s2+"\n"+s3;
					
		};
		System.out.println(dd.data("Orangu","or@gmail","London"));

	}

}
