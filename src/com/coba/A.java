package com.coba;

import java.util.HashMap;

class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> count = new HashMap<Character, Integer>();
        int n = s.length();
        // build hash map : character and how often it appears
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            count.put(c, count.getOrDefault(c, 0) + 1);
        }
        
        // find the index
        for (int i = 0; i < n; i++) {
            if (count.get(s.charAt(i)) == 1) 
                return i;
        }
        return -1;
    }
}

public class A {

	public static void main(String[] args) {
		Solution EE = new Solution();
		System.out.println(EE.firstUniqChar("asdmasdnksad"));
		
		 int a = 10,b=20;
		while (a<b)
		{
			System.out.println("hello");
			
		}
		System.out.println("world");
	}
}
	