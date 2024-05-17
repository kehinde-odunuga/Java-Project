package com.kehinde;

public class Arithmetic {
    public static void main(String[] args) {
        // basic arithmetic
        double age1 = 10;
        double age2 = 40;

        System.out.println(age1 + age2);
        System.out.println(age1 - age2);
        System.out.println(age1 * age2);
        System.out.println(age1 / age2);

        // incremental ++
        age1++;
        System.out.println(age1);

        // decremental --
        age2--;
        System.out.println(age2);

        // compound assignment operators (-=, +=, *=, /=)
        float age = 10;
        int size = 40;

        age -= size;
        System.out.println(age);

        age += size;
        System.out.println(age);

        age *= size;
        System.out.println(age);

        age /= size;
        System.out.println(age);

    }
}
