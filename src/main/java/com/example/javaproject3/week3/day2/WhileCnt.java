package com.example.javaproject3.week3.day2;

public class WhileCnt {
    public static void main(String[] args) {
        int cnt = 0;
        while (cnt < 11){
            System.out.printf("%d ", cnt++);
        }

        int cnt2 = 5;
        while (cnt > 0){
            System.out.println(cnt++);
        }

        int cnt3 = 5;
        while (cnt > 0){
            System.out.println(cnt--);
        }
    }
}
