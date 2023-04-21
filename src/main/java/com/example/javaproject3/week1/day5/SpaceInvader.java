package com.example.javaproject3.week1.day5;

public class SpaceInvader {
    public void LeftMove(){
        int location = 0;
        location = -1;
        System.out.printf("moveLeft:%d\n",location);
    }
    public void RightMove(){
        int location = 0;
        location = 1;
        System.out.printf("moveRight:%d\n",location);
    }

    public static void main(String[] args) {
        SpaceInvader si = new SpaceInvader();
        si.LeftMove();
        si.RightMove();
    }
}
