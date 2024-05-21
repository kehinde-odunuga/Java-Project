package com.kehinde;

import java.util.Scanner;
public class Loops {
    public static void main(String[] args) {
        // for i loop - incrementing
        for (int i = 1; i <= 10; i++) {
            System.out.println("Student: " + i);
        }

        // for i loop - decrementing
        for (int i = 10; i >5; i--) {
            System.out.println("Student: " + i);
        }

        // for each loop
        String [] cars = {"Benz", "Toyota", "Lamborghini", "Ferrari"};

        for (String vName : cars) {
            System.out.println(vName);
        }

        //I have a list of numbers, 1-10.
        // Write a loop that prints odd if it is an odd number
        // And a loop that prints even if it is an even number.

        for (int num = 1; num <= 10; num++) {
            if (num % 2 == 0) {
                System.out.println(num + " is an even number");
            } else if (num % 2 == 1){
                System.out.println(num + " is an odd number");
            }
        }

        // While Loops
        Scanner scanner = new Scanner(System.in);
        String user = "";

        while (!user.equalsIgnoreCase("exit")) {
            System.out.println("Welcome, type \"exit\" to exit the loop");
            user = scanner.nextLine();
        }

        // break and continue
        while (true) {
            if (!user.equalsIgnoreCase("exit")) {
                System.out.println("Welcome, type \"exit\" to exit the loop");
                user = scanner.nextLine();
                continue;
            } else if (user.equalsIgnoreCase("exit")) {
                System.out.println("You are out of the loop");
                break;
            }
            System.out.println("Thank you");
        }

        // do while loop
        do {
            System.out.println("Welcome, type \"exit\" to leave");
            user = scanner.nextLine();
        } while (!user.equalsIgnoreCase("exit"));

        // Write a logic that takes in input from the user. It keeps printing "try again "until the user enters "testify"
        String code = "";

        do {
            System.out.println("Try again");
            user = scanner.nextLine();
        } while (!user.equalsIgnoreCase("testify"));
    }
}
