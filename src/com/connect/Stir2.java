package com.connect;

public class Stir2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String s1 ="jojo";
 StringBuffer sb = new StringBuffer("jona");
 System.out.println("name is : "+s1);
 System.out.println("name is : "+sb);
 // Variable String harus berubah immutable
String s2 = s1.concat("ath");

 System.out.println("name is : "+s2);
 //Variabel String Buffer boleh tetap Muttable
 sb.append("than");
 System.out.println("name is : "+sb);
 
	}

}
