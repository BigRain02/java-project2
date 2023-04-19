package com.example.javaproject3.week1;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class BufferedReaderEx {
    public void readALine() throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);

        System.out.println("line1 = " + br.readLine());
        System.out.println("line2 = " + br.readLine());


    }

    public void plusTwoNumbers() throws IOException{
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is); // 카트 가지고 오기
        System.out.println(br.readLine() + br.readLine());
    }
}
