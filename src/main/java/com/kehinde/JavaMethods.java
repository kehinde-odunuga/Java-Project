package com.kehinde;

import java.util.Scanner;

public class JavaMethods {
    public static void main(String[] args) {

        // To access properties of the class, create an object of the class
        JavaMethods methodVar = new JavaMethods();
        methodVar.myName();
        methodVar.myAge(20);
        int userAge = methodVar.ageCalculation(1994, 2024);
        System.out.println("The user's age is " + userAge);
        methodVar.verifyVisitor();
    }

    public void myName() {
        System.out.println("My name is Kehinde.");
    }

    public void myAge(int age) {
        System.out.println("My age is " + age);
    }

    public int ageCalculation(int dob, int currentYear) {
        int age = currentYear - dob;
        return age;
    }

    // sample - Create a method that verify that visitors on the slack channel are coming for testify Trainings.
    // If they write" Testify" then print out a  welcome message if not , the user should be shown rejection message.
    // after creating this method,then invoke the created method in your main method

    public void verifyVisitor() {
        Scanner verify = new Scanner(System.in);
        System.out.println("Enter your passcode to join slack");
        String visitor = verify.nextLine();

        while (true) {
            if (!visitor.equalsIgnoreCase("Testify")) {
                System.out.println("You are unable to join, enter the correct passcode.");
                visitor = verify.nextLine();
            } else if (visitor.equalsIgnoreCase("Testify")) {
                System.out.println("Welcome to the Testify slack channel!");
                break; // Exit the loop
            }
        }
    }
}
