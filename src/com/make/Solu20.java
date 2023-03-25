package com.make;
//Q5
public class Solu20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count;
		String s = "My Name is jonathan";
		
		char string [] = s.toCharArray();
		System.out.println(" Character that has duplicate: ");
		for (int i = 0; i<string.length;i++) {
			count =1;
			for (int j = i+1;j<string.length;j++)
			if(string[i]== string[j]&&string[i]!=' ') {
				count++;
				string[j]='0';
			}
			if(count>1&&string[i] !='0') {
				System.out.println(string[i]);	
		}
		
		}
	}
}


