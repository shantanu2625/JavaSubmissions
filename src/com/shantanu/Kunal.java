package com.shantanu;

import java.time.LocalDate;
import java.time.Month;

public class Kunal {
    public static void main(String[] args) {
        int year = 2025;
        Month month = Month.FEBRUARY;
        int count = countEvenDays(year, month);
        System.out.println("Number of days Kunal can go out in " + month + " " + year + ": "+count);

    }
    private static int countEvenDays(int year, Month month) {
        int count = 0;
        LocalDate date = LocalDate.of(year, month, 1);
        while (date.getMonth() == month) {
            if (date.getDayOfMonth() % 2 == 0) {
                count++;

            }
            date = date.plusDays(1);

        }
        return count;
    }

}



