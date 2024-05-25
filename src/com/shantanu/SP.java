package com.shantanu;

public class SP {
    public static void main(String[] args) {
        int n = 256;
        int result = subtractproductandsum(n);
        System.out.println(result);
    }
    public static int subtractproductandsum(int n) {
        String numStr = String.valueOf(n);
        int product = 1;
        int sum = 0;
        for (int i = 0; i < numStr.length(); i++) {
            int digit = Character.getNumericValue(numStr.charAt(i));
            product *= digit;
            sum += digit;
        }
        return product - sum;


    }
}
