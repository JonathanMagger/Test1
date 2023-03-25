package com.array7;



public class Arraysort {


		// TODO Auto-generated method stub
	public static void main (String [] args){   	
		int a =  methodA(8, 25);
		System.out.println(a);
	}
		public static int methodA(int a, int b) {
			return a * b / methodB(a, b);
		}

		public static int methodB(int a, int b) {
			if (b == 0)
				return a;
			return methodB(b, a % b);
		}

}
	