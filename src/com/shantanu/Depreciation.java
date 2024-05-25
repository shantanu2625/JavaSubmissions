package com.shantanu;

import java.util.Scanner;

public class Depreciation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the initial value of the asset: ");
        double initialValue = scanner.nextDouble();
        System.out.println("Enter the salvage value of the asset:");
        double salvageValue = scanner.nextDouble();
        System.out.println("Enter the useful life of the asset(in years) : ");
        int usefulLife = scanner.nextInt();
        double depreciationPerYear = (initialValue - salvageValue) / usefulLife;
        System.out.println("Depreciation per year: " + depreciationPerYear);
        scanner.close();

    }
}