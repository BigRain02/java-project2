package com.example.javaproject3.week4.day2;

public class ShapeDrawerTest {
    public static void main(String[] args) {
        ShapeDrawer pyramid = new PyramidShapeDrawer();
        pyramid.printShape(4);
        ShapeDrawer parallel = new ParallelogramShapeDrawer();
        parallel.printShape(4);

    }
}
