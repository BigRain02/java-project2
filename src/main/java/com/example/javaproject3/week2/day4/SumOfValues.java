package com.example.javaproject3.week2.day4;

public class SumOfValues {
    public static void main(String[] args) {
        int[] arr = {2,1,7,4};
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);

        System.out.println(arr[0] + arr[1] + arr[2] + arr[3]);
        int answer = 0;
        answer = answer + arr[0];
        answer = answer + arr[1];
        answer = answer + arr[2];
        answer = answer + arr[3];
        System.out.printf("answer: %d", answer);
    }
}
