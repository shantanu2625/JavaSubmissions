package com.shantanu;

import java.util.Scanner;

public class CGPA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total number of subjects: ");
        int TotalSubjects = sc.nextInt();
        double totalCredits = 0;
        double totalGradePoints = 0;
        for (int i = 1; i <= TotalSubjects ; i++) {
            System.out.println("Enter Credit Unit for Subject "+ i + ":" );
            int creditUnit = sc.nextInt();
            System.out.println("Enter grade point for subject " + i + ": ");
            double gradePoint = sc.nextDouble();
            totalCredits += creditUnit;
            totalGradePoints += (creditUnit * gradePoint);

        }
        double cgpa = totalGradePoints / totalCredits;
        System.out.println("CGPA: "+ cgpa);
        sc.close();

    }
}
