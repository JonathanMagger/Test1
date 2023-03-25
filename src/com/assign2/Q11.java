package com.assign2;
//Q11 write a java program to find common element between the two given arrays.

import java.util.ArrayList;
public class Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        // create ArrayList list1 
        ArrayList<String> 
            list1 = new ArrayList<String>(); 
  
        // Add values in ArrayList 
        list1.add("My"); 
        list1.add("Name"); 
        list1.add("is"); 
        list1.add("Jonathan"); 
  
        // print list 1 
        System.out.println("List1: "
                           + list1); 
  
        // Create ArrayList list2 
        ArrayList<String> 
            list2 = new ArrayList<String>(); 
  
        // Add values in ArrayList 
        list2.add("is"); 
        list2.add("My"); 
        list2.add("life"); 
  
        // print list 2 
        System.out.println("List2: "
                           + list2); 
  
        // Find the common elements 
        list1.retainAll(list2); 
  
        // print list 1 
        System.out.println("Common elements: "
                           + list1); 
	}

}
