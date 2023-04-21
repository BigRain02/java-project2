package com.example.javaproject3.week1.day5;

public class SpaceInvadersMemberValuable {
    int location;
    public void moveLeft(){
        location = location - 1;
    }
    public void moveRight(){
        location = location + 1;
    }

    public static void main(String[] args) {
        SpaceInvadersMemberValuable space = new SpaceInvadersMemberValuable();
        space.moveRight();
        space.moveLeft();
        space.moveLeft();
        space.moveLeft();
        space.moveLeft();
        System.out.printf("현재 위치 : %d",space.location);
        space.moveRight();
        System.out.printf("\n현재 위치 : %d",space.location);
    }
}
