package com.example.javaproject3.week4.day2;

public class DiEx {
    private ShapeDrawer shapeDrawer;
    public DiEx(ShapeDrawer shapeDrawer){
        this.shapeDrawer = shapeDrawer;
    }
    public void doSth(){
        shapeDrawer.printShape(5);
    }
}
