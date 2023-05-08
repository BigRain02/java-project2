package com.example.javaproject3.week4.day1;

public class VariousReturnTypeTest {
    public static void main(String[] args) {
        VariousReturnType vrt = new VariousReturnType();
        boolean isAdult = vrt.isAdult();
        int plusResult = vrt.plus();
        User user = vrt.getUser();
        vrt.printHello();

    }
}
