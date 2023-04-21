package com.example.javaproject3.week1.day5;

public class Point {
    int x;
    int y;

    boolean isSameXy(){
        return x==y;
    }

    double getDistance(Point p1){
        int xL = Math.abs(this.x - p1.x);
        int yL = Math.abs(this.y - p1.y);
        double xyL = Math.pow(xL,2) + Math.pow(yL,2);

        return xyL;
    }

    public static void main(String[] args) {
        Point p = new Point();
        System.out.println(p.x);
    }
}
