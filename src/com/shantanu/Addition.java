package com.shantanu;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
       int x, y, sum;
       Scanner myObj = new Scanner(System.in);
       System.out.println("Enter Number: ");
       x = myObj.nextInt();
        System.out.println("Enter Another Number: ");
        y = myObj.nextInt();
        sum = x + y;
        System.out.println("Sum is: "+ sum);

    }
}
