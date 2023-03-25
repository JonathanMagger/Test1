package com.array7;

public class Fibonaci {
    public static void main(String[] args) {
        int n = 3; // jumlah angka Fibonacci yang ingin dicetak

        int previousNumber = 0;
        int currentNumber = 1;

        System.out.print(previousNumber + " ");
        System.out.print(currentNumber + " ");

        for (int i = 2; i <= n; i++) {
            int nextNumber = previousNumber + currentNumber;
            System.out.print(nextNumber + " ");
            previousNumber = currentNumber;
            currentNumber = nextNumber;
        }
    }
}
