package com.connect;
class Mata{
	public int x;
	private int y;
	void cal (int c, int d)
	{
		x = c +1;
		y = d;
	}

void print()
{
	System.out.println(" "+y);
}
}
public class Equil  {
	

	public static void main(String[] args) {
	Mata a = new Mata();
	a.cal(2, 3);
	
	
	System.out.println(a.x);
	a.print();
	}
		
	}


