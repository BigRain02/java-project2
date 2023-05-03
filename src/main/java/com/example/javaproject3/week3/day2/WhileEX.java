package com.example.javaproject3.week3.day2;
import java.time.LocalDateTime;
public class WhileEX {
    public static void main(String[] args) throws InterruptedException {
        while (true) {
            System.out.println(LocalDateTime.now());
            Thread.sleep(1000);
        }
    }
}
