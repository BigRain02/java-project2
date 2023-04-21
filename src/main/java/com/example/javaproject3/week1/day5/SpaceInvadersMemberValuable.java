package com.example.javaproject3.week1.day5;

public class SpaceInvadersMemberValuable {
    int location;
    public void moveLeft(){
        location = location - 1;
        System.out.printf("moveLeft : %d\n",location);
    }
    public void moveLight(){
        location = location + 1;
        System.out.printf("moveRight : %d\n",location);
    }

    public static void main(String[] args) {
        SpaceInvadersMemberValuable space = new SpaceInvadersMemberValuable();
        space.moveLight();
        space.moveLeft();
        space.moveLeft();
        space.moveLeft();
        space.moveLeft();
    }
}
