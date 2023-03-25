package com.info;

class Amin
{
	int a = 1;
}
class Budi extends Amin
{
	int b = 2;
}

class Cika extends Amin
{
	int c = 3;
}
class loop
{
	{
		for (int i =0 ; i<10; i++)
		{
			if (i == 6)
			{
				break;
			}System.out.println("Data : " + i);
		}System.out.println("loop Ends . . . .");
	}
}
public class Jajal2 {

	public static void main(String[] args) {
	
		Cika a = new Cika();
		Budi b = new Budi();
		System.out.println("Hitung "+(b.a+b.b+a.c));
		new loop();
	}

}
