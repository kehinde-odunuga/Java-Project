package com.kehinde;

public class CondRelLog {
    public static void main(String[] args) {
        // conditional & relational statements
        int mySize = 65;
        int myScore = 80;

        if(mySize == 60){
            System.out.println("This is not my true size");
        } else if (mySize < 50) {
            System.out.println("it is not equal");
        } else {
            System.out.println("My size is 65");
        }

        // logical statements (AND, OR)
        if(myScore == 80 && mySize <= 65) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        if(myScore > 80 || mySize < 65) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        // FizzBuzz
        int num = 10;

        if(num % 3 == 0 && num % 5 == 0){
            System.out.println("FizzBuzz");
        } else if(num % 3 == 0){
            System.out.println("Fizz");
        } else if (num % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(num);
        }
    }
}
