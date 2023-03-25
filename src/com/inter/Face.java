package com.inter;
interface IT1
{
	void deposite();
}
public class Face implements IT1{

	@Override
	public void deposite() {
		System.out.println("Deposite. . .");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Face().deposite();
	}



}
