package com.example.javaproject3.week2.day2;

public class StrtingFormatting {
    public static void main(String[] args) {
        String name = "김태우";
        int balance = 10000;
        String result = String.format("%s님의 통장 잔고는 %d원 입니다",name,balance);
        System.out.println(result);
    }
}
