package com.example.javaproject3.week4.day3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FilePrinter implements Printer {
    @Override
    public void print(String[] lines) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("./aaa.txt"));
        bw.append("aaa");
        bw.flush();
        bw.close();
    }
}
