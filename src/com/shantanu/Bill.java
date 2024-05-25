package com.shantanu;

public class Bill {
    public static void main(String[] args) {
        int units = 80;
        double billtoPay = 0;
        if (units < 100) {
            billtoPay = units * 1.20;

        } else if (units < 300) {
            billtoPay = 100 * 1.20 + (units - 100) * 2;
        } else if (units> 300) {
            billtoPay = 100*1.20 + 200*2 + (units - 300) * 3;
        }
        System.out.println("Ebill for "+ units + " is: "+ billtoPay);
    }
}
