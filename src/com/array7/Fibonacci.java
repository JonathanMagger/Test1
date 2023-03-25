package com.array7;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 3;
		
		int prev= 0;
		int cur=1;
		
		System.out.print(prev+" ");
		System.out.print(cur+" ");
		
		for (int i = 2; i<n;i++) {
			int next = prev + cur;
			System.out.print(next+" ");
			prev = cur;
			cur = next;
		}
	}

}
