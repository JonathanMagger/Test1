package com.array7;

import java.util.HashMap;
import java.util.Map;

public class D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String w = "Simsalabim";
		Map<Character, Integer> f = new HashMap<>();
		for (char c:w.toCharArray()) {
			if (f.containsKey(c)) {
				f.put(c, f.get(c)+1);
			}else {
				f.put(c, 1);
			}
		}
		System.out.println("karakter yang tidak duplikat");
		for (char c:w.toCharArray()) {
			if (f.get(c)==1) {
				System.out.println(c+" = "+f.get(c));
			}
		}
		System.out.println("karakter yang duplikat");
		for (char c:w.toCharArray()) {
			if (f.get(c)>1) {
				System.out.println(c+" = "+f.get(c));
			}
		}
	}

}
