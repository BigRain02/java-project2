package com.example.javaproject3.week2.day3;

import com.example.javaproject3.printHello;

public class ReferenceTypeVariable {
    public static void main(String[] args) {
        Student[] students = new Student[30];
        Object obj = new Student();
        Object obj2 = new printHello();

        students[0] = new Student();
        students[0].age = 22;
        students[0].name = "김태우";
        students[0].phoneNumber = "010-4129-6575";

    }
}
