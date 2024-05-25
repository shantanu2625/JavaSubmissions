package com.shantanu;

import java.util.Scanner;

public class zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int num;
        do {
            System.out.println("Enter the Number: ");
            num = sc.nextInt();
            System.out.println("Enter 0 to end the Loop ");
            sum += num;
        } while (num > 0);
        System.out.println("Sum is " + sum);

    }
}
