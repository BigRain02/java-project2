package com.example.javaproject3.week4.day1;

public class UserTest {
    public static void main(String[] args) {
        User user1 = new User();
        user1.age = 14;
        user1.name = "김미미";

        User user2 = new User();
        user2.age = 47;
        user1.name = "김나나";

        System.out.println(user1.isAdult());
        System.out.println(user2.isAdult());
    }
}
