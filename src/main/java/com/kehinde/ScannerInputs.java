package com.kehinde;

import java.util.Scanner;

public class ScannerInputs {
    public static void main(String[] args) {
//        Scanner userInput = new Scanner(System.in);
//        System.out.println("Welcome, please input your date of birth.");
//        short dob = userInput.nextShort();
//        short presentYear = 2024;
//        int customerAge = presentYear - dob;
//
//        System.out.println("You are "+ customerAge+ " years old");
//
//        if(customerAge < 18) {
//            System.out.println("Too young to bet. Bye!");
//        } else if (customerAge >= 18) {
//            System.out.println("Welcome, you are qualified");
//        }

        // Sample - Build a Simple interest calculator.
        // Write a program to ask the user for the necessary field you need in calculating the simple interest.
        // And then communicate the simple interest back to the user in a good sentence.

        Scanner interest = new Scanner(System.in);
        System.out.println("What is your PRINCIPAL amount?");
        double principal = interest.nextDouble();
        System.out.println("Interest RATE?");
        double rate = interest.nextDouble();
        System.out.println("Duration in years(T)?");
        double time = interest.nextDouble();

        double simpleInterest = (principal * rate * time) / 100;

        System.out.println("Your simple interest at the rate of " + rate + "%" + " over the period of " + time + " year(s) is "+ simpleInterest);

    }
}
