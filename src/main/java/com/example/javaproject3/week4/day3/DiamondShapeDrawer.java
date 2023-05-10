package com.example.javaproject3.week4.day3;

public class DiamondShapeDrawer extends ShapeDrawer2{
    public static String getRepeatedSymbol(String symbol, int n){
        return symbol.repeat(n);
    }
    @Override
    public String makeALine(int h, int i) {
        int pivot = h / 2;
        if (i <= pivot) {
            return String.format("%s%s\n", getRepeatedSymbol("0", -2 + h - i - 2), getRepeatedSymbol("*", 2 * i + 1));
        } else {
            return String.format("%s%s\n", getRepeatedSymbol("0", i - pivot), getRepeatedSymbol("*", 2 * (h - i) - 1));

        }
    }
}
