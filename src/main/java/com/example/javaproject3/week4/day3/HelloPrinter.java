package com.example.javaproject3.week4.day3;

import java.io.IOException;

public class HelloPrinter{
    public void print(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {
        HelloPrinter hp = new HelloPrinter();
        hp.print("Hello");
        hp.print("Bye");
    }

}
