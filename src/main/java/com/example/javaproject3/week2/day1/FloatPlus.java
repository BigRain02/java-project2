package com.example.javaproject3.week2.day1;

public class FloatPlus {
    public static void main(String[] args) {
        String val1 = "1.11111111";
        String val2 = "2.11111111";

        float result = Float.parseFloat(val1) + Float.parseFloat(val2);
        System.out.println("result = " + result);

        double resultDouble = Double.parseDouble(val1) + Double.parseDouble(val2);
        System.out.println("resultDouble = " + resultDouble);
    }
}
