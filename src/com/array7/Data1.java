package com.array7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class Data1 {

	@SuppressWarnings({ "unchecked", "unused" })
	public static void main(String[] args) {
	
		//Converting non Synchronization to Synchronization
		//to convert ArrayList to Synchronized to Set
		@SuppressWarnings("rawtypes")
		ArrayList al =new ArrayList();
		
		@SuppressWarnings("rawtypes")
		List l = Collections.synchronizedList(al);
		
		System.out.println();
		
		//converting HashSet to Synchronised Set
		
		@SuppressWarnings("rawtypes")
		HashSet hs = new HashSet<>();
		@SuppressWarnings("rawtypes")
		Set s = Collections.synchronizedSet(hs);
		
		//Converting Treemap to synchonized map
		@SuppressWarnings("rawtypes")
		TreeMap tm = new TreeMap();
		
		@SuppressWarnings("rawtypes")
		SortedMap sm = Collections.synchronizedSortedMap(tm);
		
		// Converting TreeSet to Synchronized Set
		@SuppressWarnings("rawtypes")
		TreeSet ts = new TreeSet();
		@SuppressWarnings("rawtypes")
		SortedSet ss = Collections.synchronizedSortedSet(ts);
	}

}
