package com.shantanu;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x1: ");
        double x1 = scanner.nextDouble();
        System.out.println("Enter y1: ");
        double y1 = scanner.nextDouble();
        System.out.println("Enter x2: ");
        double x2 = scanner.nextDouble();
        System.out.println("Enter y2: ");
        double y2 = scanner.nextDouble();
        double distance = calculateDistance(x1, y1, x2, y2);
        System.out.println("Distance between the points: " + distance);
        scanner.close();

    }
    private static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

    }
}
