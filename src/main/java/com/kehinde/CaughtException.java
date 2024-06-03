package com.kehinde;

public class CaughtException {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Start");

        try {

            int i[] = new int[4];

            i[5] = 100;

            Thread.sleep(1000);

        } catch (Exception a) {
            System.out.println("Error occured in array");
            System.out.println(a.getCause());
            System.out.println(a.getMessage());
            a.printStackTrace();
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Thread.sleep(4500);

        System.out.println("End");
    }
}
