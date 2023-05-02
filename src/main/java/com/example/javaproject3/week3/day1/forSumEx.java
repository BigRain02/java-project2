package com.example.javaproject3.week3.day1;

import java.util.Scanner;

public class forSumEx
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 0; i <= n; i++){
            sum += i;
        }
    }
}
