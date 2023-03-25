package com.method;
class Lowa{
	private int a;
	private String b;
	
	public void set1( int c) {
		this.a = c;
	}
	public void set2(String d) {
		this.b = d;
	}
	public int get1() {
		return a;
	}
	public String get2() {
		return b;
	}
}
public class Gset extends Lowa {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Gset e = new Gset();
		e.set1(10);
		e.set2("mimi");
		System.out.println(e.get1());
		System.out.println(e.get2());
	}

}
