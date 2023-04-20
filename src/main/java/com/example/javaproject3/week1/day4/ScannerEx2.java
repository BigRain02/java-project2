package com.example.javaproject3.week1.day4;
import java.util.Scanner;

public class ScannerEx2 {
    public void inputTwoNumbersAndPlus(){
        Scanner sc = new Scanner(System.in);
        System.out.println("두개의 숫자를 입력해주세요. 입력하고 엔터 입력하고 엔터");
        System.out.print("첫 번째 숫자:");
        int a = sc.nextInt();
        System.out.println("첫 번째 숫자는 " + a + "입니다.");
        System.out.print("두 번째 숫자:");
        int b = sc.nextInt();
        System.out.println("두 번째 숫자는 " + b + "입니다.");
        System.out.println("두 숫자의 합은 " + (a+b) + "입니다." );
    }
}
