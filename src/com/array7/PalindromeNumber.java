package com.array7;

public class PalindromeNumber {
    public static void main(String[] args) {
        int end = 200;

        for (int i = 0; i <= end; i++) {
            if (i>9&&isPalindrome(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPalindrome(int number) {
    	String str = String.valueOf(number);
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        str = sb.toString();
        int reversedNumber = Integer.parseInt(str);
        

        return number == reversedNumber;
    }
}
