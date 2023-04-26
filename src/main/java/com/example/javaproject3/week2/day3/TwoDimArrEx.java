package com.example.javaproject3.week2.day3;

import java.util.Arrays;

public class TwoDimArrEx {
    public static void printArray(int[][] arr){
        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[2]));
        System.out.println(Arrays.toString(arr[2]));
        System.out.println("------------");
    }

    public static void fillRowOne(int[][] arr , int rowNum){
        arr[rowNum][0] = 1;
        arr[rowNum][1] = 1;
        arr[rowNum][2] = 1;
        arr[rowNum][3] = 1;
        arr[rowNum][4] = 1;
    }
    public static void main(String[] args) {
        int[][] arr = new int[3][3];

        printArray(arr);

        arr[0][0] = 1;
        arr[0][2] = 2;
        arr[1][0] = 3;
        printArray(arr);

        arr[1][1] = 5;

        arr[2][0] = 1; // 2행 0열에 값 할당
        arr[2][1] = 1; // 2행 1열에 값 할당
        arr[2][2] = 1; // 2행 2열에 값 할당
        arr[2][3] = 1; // 2행 3열에 값 할당
        arr[2][4] = 1; // 2행 4열에 값 할당

        printArray(arr);

        arr[0][2] = 1; // 0행 2열에 값 할당
        arr[1][2] = 1; // 1행 2열에 값 할당
        arr[2][2] = 1; // 2행 2열에 값 할당
        arr[3][2] = 1; // 3행 2열에 값 할당
        arr[4][2] = 1; // 4행 2열에 값 할당

        printArray(arr);

    }
}
