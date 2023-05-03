package com.example.javaproject3.week3.day3;

public class IsPrimeDivide2 {
    public static void main(String[] args) {
        int num = 7;
        int factors = 0;

        for(int i = 2; i<= num/2; i++){
            if(num % 2 == 0) factors++;
        }

        System.out.println(factors == 0? "소수입니다.":"소수가 아닙니다.");
    }
}
