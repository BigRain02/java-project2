package com.example.javaproject3.week4.day3;

public abstract class ShapeDrawer2 {

    public abstract String makeALine(int h, int i);
    //{
      //  return String.format("%s%s\n", "0".repeat(h - i), "*".repeat(2 * i - 1))
    //}
    public void printShape(int height) {
        int h = height;
        for (int i = 1; i <= h; i++) {
            System.out.print(makeALine(h,i));
        }
    }

}
