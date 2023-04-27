package com.example.javaproject3.week2.day3;

public class Accumulate687 {
    public static void main(String[] args) {
        int num = 687;
        int a = num % 10; // 변수 a 선언
        num = num / 10;
        int b = num % 10; // 변수 b 선언
        num = num / 10;
        int c = num % 10; // 변수 c 선언
        System.out.println(a + b + c);
    }
}
