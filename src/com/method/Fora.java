package com.method;

public class Fora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i =0; i<5; i++)
		{
			System.out.println("Outer Loop : "+i);
			for (int j=0;j<5;j++)
			{
				if(j<=2)
				{
					continue;
				}
				System.out.println("-"+"Inner loop" +j);
			}
		}System.out.println("loop end");
	}

}
