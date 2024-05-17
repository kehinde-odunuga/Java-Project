package com.kehinde;

public class Concatenation {
    public static void main(String[] args) {
        // string and string concat
        String car = "Benz";
        String adjective = " is fast";
        String sentence = car + adjective;

        System.out.println(sentence);

        // string and primitive concat
        String movieName = "Good Doctor: ";
        int series = 5;
        boolean isReleased = true;
        System.out.println(movieName + series);

        // .concat() method
        movieName.concat(sentence);
        System.out.println(movieName.concat(isReleased + ""));

        String firstName = "John ";
        String lastName = "Doe";
        System.out.println(firstName.concat(lastName));
    }
}
