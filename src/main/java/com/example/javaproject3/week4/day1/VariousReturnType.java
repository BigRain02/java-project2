package com.example.javaproject3.week4.day1;

public class VariousReturnType {
    public boolean isAdult(){
        return true;
    }
    public int plus(){
        return 1 + 1;
    }
    public User getUser(){
        return new User();
    }
    public void printHello() {
        System.out.println("Hello");
    }
}
