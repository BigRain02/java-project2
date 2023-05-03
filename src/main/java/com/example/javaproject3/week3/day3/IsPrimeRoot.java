package com.example.javaproject3.week3.day3;

import java.util.Scanner;

public class IsPrimeRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int factors = 0;
        for(int i = 2; i * i <= num; i++){
            if(num % 2 == 0) factors++;
        }
        System.out.println(factors == 0? "소수입니다.":"소수가 아닙니다.");
    }
}
