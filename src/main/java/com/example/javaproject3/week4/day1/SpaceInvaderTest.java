package com.example.javaproject3.week4.day1;

public class SpaceInvaderTest {
    public static void main(String[] args) {
        SpaceInvaders si = new SpaceInvaders();
        si.moveLeft();
        si.moveRight();
        System.out.println(si.location);
    }
}
