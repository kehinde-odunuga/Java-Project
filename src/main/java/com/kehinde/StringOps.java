package com.kehinde;

public class StringOps {
    public static void main(String[] args) {
        String word = "orGANization";

        //uppercase and lowercase
        System.out.println(word.toLowerCase());
        System.out.println(word.toUpperCase());

        // 0  1  2  3  4  5
        // l  e  n  g  h  t
        //-6 -5 -4 -3 -2 -1

        System.out.println(word.length());

        // index of a character
        System.out.println(word.indexOf('G'));

        // character at a particular index
        System.out.println(word.charAt(6));

        System.out.println(word.substring(0,5));
        System.out.println(word.charAt(word.length()-8 ));

        // sample

        String str = "DEMOCRACY";

        StringBuilder rev = new StringBuilder(str).reverse();

        System.out.println(rev);
        System.out.println(rev.substring(4,8));


    }
}
