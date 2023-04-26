package com.example.javaproject3.week2.day3;

public class MinuteSecond {
    public static void main(String[] args) {
        int second = 239;
        int minute = second/ 60;
        int remainSecond = second % 60;
        System.out.printf("%d분 %d초",minute,remainSecond);

    }
}
