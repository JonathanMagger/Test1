package com.connect;

public class Arin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] a = {5,8,11};
System.out.println(a.getClass().getSimpleName());
	//Normal Loop
System.out.println(a[0]);
System.out.println(a[1]);
System.out.println(a[2]);
System.out.println();

	//for Loop
for(int i = 0; i<a.length; i++) {
	System.out.println("Value is : "+a[i]);
	
}
System.out.println();
//forEach Loop
for (int j :a) {
	System.out.println("Each Loop"+j);
}
	}

}
