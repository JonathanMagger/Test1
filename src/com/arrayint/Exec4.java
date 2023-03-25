package com.arrayint;

public class Exec4 {

	public static void main(String[] args) {
	
		int [] a = {4,8,9,13,35};
		int sum = 0;
		int sum2 = 0;
		for (int aa:a)
		{
			sum = sum + aa;
		}
		System.out.println("Total : "+sum);

		for(int i=0;i<a.length; i++) {
			sum2 +=a[i];
		}System.out.println("Total2 : "+sum2);

	}

}
