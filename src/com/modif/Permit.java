package com.modif;

class Daki{
	/*private variable*/
	private int a ;
	private  String name ;
	/*setter Method*/
	public void set1(int a) {
		this.a=a;
	}
	public void set2(String b) {
		this.name=b;
	}
	/*getter Method*/
	public int get1() {
		return a;
	}
	public String get2() {
		return name;
	}
	
}
public class Permit extends Daki{
	
	public static void main(String[] args) {
		/*Object 1*/
		Permit d = new Permit();
		d.set1(101) ;
		d.set2("Miya") ;
		System.out.println("Employee ID is : "+d.get1());
		System.out.println("Employee ID is : "+d.get2());
		System.out.println();
		/*Object 2*/
		Permit s = new Permit();
		s.set1(102) ;
		s.set2("Shigeo") ;
		System.out.println("Employee ID is : "+s.get1());
		System.out.println("Employee ID is : "+s.get2());
	}

}
