package com.shantanu;

import java.util.Scanner;

public class batting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter the total number of runs scored: ");
        int runsScored = scanner.nextInt();
        System.out.println("Enter total number of times dismissed");
        int timesDismissed = scanner.nextInt();
        double battingAverage = calculateBattingAverage(runsScored, timesDismissed);
        System.out.println("Batting Average: " + battingAverage);
        scanner.close();


    }
    public static double calculateBattingAverage(int runsScored, int timesDismissed) {
        if (timesDismissed == 0) {
            return runsScored;
        }
        return (double) runsScored / timesDismissed;


    }
}


