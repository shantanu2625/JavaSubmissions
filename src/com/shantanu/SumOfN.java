package com.shantanu;

import java.util.Scanner;

public class SumOfN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value of N: ");
        int n = scanner.nextInt();
        int sum = 0;


        for (int i = 1; i <= n ; i++) {
            sum += i;


        }
        System.out.println("Sum of first " + n + "numbers is: " + sum );


    }
}
