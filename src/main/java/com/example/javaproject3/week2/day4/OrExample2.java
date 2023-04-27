package com.example.javaproject3.week2.day4;

public class OrExample2 {
    public static void main(String[] args) {
        boolean result = true || true;
        System.out.printf("%b\n", result);
        result = true || false;
        System.out.printf("%b\n", result);
        result = false || true;
        System.out.printf("%b\n", result);
        result = false || false;
        System.out.printf("%b\n", result);

        int yearsOfExp = 8;
        int numOfProj = 12;
        boolean isPromotion = yearsOfExp > 5 || numOfProj > 10;
        System.out.printf("팀장 승진 여부: %b", isPromotion);
    }

}
