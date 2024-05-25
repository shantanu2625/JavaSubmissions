package com.shantanu;

import java.util.Scanner;

public class FDP {
    public static void main(String[] args) {
        System.out.println("Enter n: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Fibonaci number at position " + n + " is: " + fib(n));

    }
    public static int fib(int n ) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];


        }
        return dp[n];

    }
}
