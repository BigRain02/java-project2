package com.example.javaproject3.week1.day5;

public class UserTest {
    public static void main(String[] args) {
        User user = new User();
        user.name = "김태우";
        user.phoneNumber = "010-1111-1111";
        user.age = 22;
        System.out.printf("저는 %s입니다, 전화번호는 %s이고, 나이는 %d입니다.\n",user.name,user.phoneNumber,user.age);
        System.out.printf("%d",user.isAdult());
    }
}
