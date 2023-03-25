package com.arrayint;

public class Exec5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {12,3,5,1,32,43,46};
		int l = a[0];
		int s = a[0];
				
		for (int i = 0; i<a.length ; i++)
{
	if (l<a[i])
	{
		l = a[i];
	}
else if (s>a[i])
{
	s = a[i];
}	
}
		System.out.println("Largest = "+l);
		System.out.println("Smallest = " +s);
	}

}
