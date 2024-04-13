package com.web.java;

public class FibonacciSeries_22 {

	public static void main(String[] args) {
		int n = 10; 
        int fib1 = 0;
        int fib2 = 1;

        System.out.println("First " + n + " Fibonacci numbers:");

        System.out.print(fib1 + " "); 

        for (int i = 1; i < n; i++) {
            System.out.print(fib2 + " "); 

            int fib3 = fib1 + fib2;
            fib1 = fib2;
            fib2= fib3;
        }
    }

}
