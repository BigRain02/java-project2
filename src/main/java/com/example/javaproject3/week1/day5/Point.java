package com.example.javaproject3.week1.day5;

public class Point {
    int x;
    int y;

    boolean isSameXy(){
        return x==y;
    }

    double getDistance(Point p1){
        int xL = Math.abs(p1.x - this.x);
        int yL = Math.abs(p1.y - this.y);
        double xyL = Math.pow(xL,2) + Math.pow(yL,2);
        double result = Math.sqrt(xyL);

        return result;
    }

    public static void main(String[] args) {
        Point p = new Point();
        System.out.println(p.x);
    }
}
