package com.colect;
//COLLECTION
import java.util.ArrayList;

public class Data {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Homogenous : same data type [1,2,3,4,5]
		//Heterogeneous :Different data type [10,34.56,'a',"Micky",null]
		
		//Array list
		
		@SuppressWarnings("rawtypes")
		ArrayList al = new ArrayList();
		
		al.add(10);
		al.add(10.5);
		al.add("micky");
		al.add('a');
		al.add(null);
		
		System.out.println(al);
		
	}

}
