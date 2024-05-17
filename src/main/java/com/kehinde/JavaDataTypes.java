package com.kehinde;

public class JavaDataTypes {
    public static void main(String[] args) {

        int myNum = 5;               // Integer (whole number)
        System.out.println("Int: " + myNum);

        float myFloatNum = 5.99f;    // Floating point number
        System.out.println("Float: " + myFloatNum);

        char myLetter = 'D';         // Character
        System.out.println("Char: " + myLetter);

        boolean myBool = true;       // Boolean
        System.out.println("Boolean: " + myBool);

        String myText = "Hello";     // String
        System.out.println("String: " + myText);

        int items = 50;
        float costPerItem = 9.99f;
        float totalCost = items * costPerItem;
        char currency = '$';

        // Print variables
        System.out.println("Number of items: " + items);
        System.out.println("Cost per item: " + costPerItem + currency);
        System.out.println("Total cost = " + totalCost + currency);
    }
}
