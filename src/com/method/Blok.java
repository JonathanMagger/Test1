package com.method;

public class Blok {
static
{
	System.out.println("1"); 
}
static
{
	System.out.println("2");
	
}
static
{
	System.out.println("3");
}
public Blok(){
	System.out.println("5");
}
{ System.out.println("4");}
public Blok(int a)
{
	System.out.println("6");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new Blok();
new Blok(1);


	}

}
