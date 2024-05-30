package com.kehinde;
/*
    Loops are not statements ---> they are not terminated but exits.
    For loop ---> number of iterations is known
    While loop ---> number of iterations is unknown
    Do While loop ---> runs at least once irrespective of the condition
    Entry criteria ---> loop condition must be true
    Exit criteria ---> loop condition is false
 */
public class WhileLoop {
    public static void main(String[] args) {
        int i = 1;

        do {
            System.out.println(i);
            i++;
        }

        while (i<=10);

//        for (int i=1; i<=10; i++) {
//            System.out.println(i);
//        }
    }
}
