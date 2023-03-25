package com.assign2;
//Q14 Write a java program to implement Singleton Design Pattern


class Singleton { 
    // Static variable single_instance of type Singleton 
    private static Singleton single_instance = null; 
  
    // Declaring a variable of type String 
    public String s; 
  
    // Constructor of this class 
    // Here private constructor is used to 
    // restricted to this class itself 
    private Singleton() 
    { 
        s = "Hello I am a string part of Singleton class"; 
    } 
  
    // Method 
    // Static method to create instance of Singleton class 
    public static Singleton m1() 
    { 
        // To ensure only one instance is created 
        if (single_instance == null) { 
            single_instance = new Singleton(); 
        } 
        return single_instance; 
    } 
} 
public class Q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Instantiating Singleton class with variable x 
        Singleton x = Singleton.m1(); 
  
        // Instantiating Singleton class with variable y 
        Singleton y = Singleton.m1(); 
  
        // instantiating Singleton class with variable z 
        Singleton z = Singleton.m1(); 
  
        // Now  changing variable of instance x 
        // via toUpperCase() method 
        x.s = (x.s).toUpperCase(); 
  
        // Print and display commands 
        System.out.println("String from x is " + x.s); 
        System.out.println("String from y is " + y.s); 
        System.out.println("String from z is " + z.s); 
        System.out.println("\n"); 
  
        // Now again changing variable of instance x 
        z.s = (z.s).toLowerCase(); 
  
        System.out.println("String from x is " + x.s); 
        System.out.println("String from y is " + y.s); 
        System.out.println("String from z is " + z.s); 
	}

}
