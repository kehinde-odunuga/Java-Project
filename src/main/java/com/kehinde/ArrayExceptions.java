package com.kehinde;

public class ArrayExceptions {
    public static void main(String[] args) {

        System.out.println("Start");

        try {

            int i[] = new int[4];

            i[5] = 100;
        } catch (Exception a) {
            System.out.println("Error occured in array");
            System.out.println(a.getCause());
            System.out.println(a.getMessage());
            a.printStackTrace();
        }

        System.out.println("End");
    }
}
