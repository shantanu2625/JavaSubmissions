package com.shantanu;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        double[] array = new double[count];
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter input Number" + (i + 1) + ": ");
            array[i] = scanner.nextDouble();


        }
        scanner.close();
        for (double x : array) {
            sum = sum + x;


        }
        double average = sum/count;
        System.out.format("The average is: %.2f", average);

    }
}
