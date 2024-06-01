package com.kehinde;

public class Exceptions {
    public static void main(String[] args) {
        System.out.println("Before try block");

        try {
            System.out.println("Start");

            int divide = 100 / 0;
            System.out.println(divide);

            System.out.println("End");

        } catch (Exception t) {
            System.out.println("Error occured");
            System.out.println(t.getMessage());
            t.printStackTrace();
        }

        System.out.println("After try block");
    }
}
