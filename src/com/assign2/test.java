package com.assign2;
import java.util.ArrayList;
import java.util.LinkedList;


public class test {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

	     ArrayList<Integer> arrayList = new ArrayList<Integer>();
	      LinkedList<Integer> linkedList = new LinkedList<Integer>();
	      
	      // Populate the lists
	      for (int i = 0; i < 10000; i++) {
	         arrayList.add(i);
	         linkedList.add(i);
	      }
	      
	      long startTime = System.nanoTime();
	      int arrayListElement = arrayList.get(1000);
	      long endTime = System.nanoTime();
	      long arrayListTime = endTime - startTime;
	      
	      startTime = System.nanoTime();
	      int linkedListElement = linkedList.get(1000);
	      endTime = System.nanoTime();
	      long linkedListTime = endTime - startTime;
	      
	      System.out.println("Time taken by ArrayList: " + arrayListTime + "ns");
	      System.out.println("Time taken by LinkedList: " + linkedListTime + "ns");
	   }
	}