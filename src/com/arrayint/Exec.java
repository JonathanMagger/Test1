package com.arrayint;

public class Exec {

	public static void main(String[] args) {

		Mice m1 = new Mice(101,"Rob");
		Mice m2 = new Mice(102,"Bayu");
		Mice m3 = new Mice(102,"Aryani");
		// EXEC Array
		Mice[] mm = new Mice[5];
		// adding data into an array
		mm[0]=m1;
		mm[2]=m2;
		mm[4]=m3;
		
		//for loop
		for (int i =0; i<mm.length;i++)
		{
			if (mm[i]==null)
			{
				System.out.println("Null index position is : "+i);
			}
		}

	}

}
