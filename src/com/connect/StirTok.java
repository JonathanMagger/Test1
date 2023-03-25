package com.connect;

import java.util.StringTokenizer;

public class StirTok {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringTokenizer a = new StringTokenizer("Hi I am Jonathan,Nice to meet you",",");
		//to split
while (a.hasMoreElements())
{
	System.out.println(a.nextElement());
}
	}

}
