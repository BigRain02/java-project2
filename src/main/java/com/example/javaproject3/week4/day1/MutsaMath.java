package com.example.javaproject3.week4.day1;

public class MutsaMath {
    //약수의 합 return
    int sumOfFactors(int num){
        int answer = 1;
        for(int i = 2; i <= num; i++) {
            if (num % i == 0) {
                answer += i;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        MutsaMath mutsaMath = new MutsaMath();
        int result = mutsaMath.sumOfFactors(12);
        System.out.println(result);
    }

}
