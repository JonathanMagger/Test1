package com.connect;

public class Stir3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//String to string Buffer
String a = "Joni";
StringBuffer b = new StringBuffer(a);
System.out.println(b);
System.out.println();

//String Buffer to String
StringBuffer c = new StringBuffer("Moni");
String d = c.toString();
System.out.println(d);
System.out.println();

String e ="Babu";
String f ="Babu";
String g = "Kamu";
System.out.println(e.equals(f));
System.out.println(e.equals(g));
System.out.println(e.compareTo(g));
System.out.println(g.length());
System.out.println();
//Array
int [] h = {1,2,3,4,5,6,7};
System.out.println(h.length);
System.out.println();

//Index		0123456789
String i = "nagomabula";
System.out.println(i.charAt(4));
System.out.println(i.indexOf('k'));
System.out.println(i.lastIndexOf('m'));
System.out.println();
System.out.println(i.contains("abu"));
System.out.println(i.contains("ABU"));
System.out.println(i.startsWith("nag"));
System.out.println(i.startsWith("abu"));
System.out.println(i.endsWith("ula"));
System.out.println(i.endsWith("abu"));
	}

}
