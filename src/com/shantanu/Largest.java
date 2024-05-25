package com.shantanu;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        System.out.println("Enter a Value: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        System.out.print("Please enter %d numbers %n");
        for (int i = 0; i < n; i++) {
            int current = sc.nextInt();
            if (current > largest) {
                largest = current;
            }
            if (current < smallest) {
                smallest = current;

            }

        }



    }
}
