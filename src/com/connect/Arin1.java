package com.connect;
class A{
	
}
public class Arin1 {

	public static void main(String[] args) {
		// default values is 0
		int[] a = new int[5];
		for (int aa :a)
		{
			System.out.println(aa);
		}
		
		// default values is false
				boolean[] b = new boolean[5];
				for (boolean bb :b)
				{
					System.out.println(bb);
				}
		
				// default values is null
				A[] c = new A[5];
				for (A cc :c)
				{
					System.out.println(cc);
				}
	}

}
