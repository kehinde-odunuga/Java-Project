package com.kehinde;

import java.util.ArrayList;

public class Arrays {
    public static void main(String[] args) {
        int [] array1 = new int[5];

        array1[0] = 10;
        array1[1] = 50;
        array1[2] = 6;
        array1[3] = 1;
        array1[4] = 30;

        System.out.println(java.util.Arrays.toString(array1));

        String [] fruits = { "Apple", "Banana", "Cashew", "Peas"};

        System.out.println("Fruits: " + java.util.Arrays.toString(fruits));

        int [] [] doubleDimen = new int[2][3];

        doubleDimen [0] [0] = 1;
        doubleDimen [1] [0] = 5;
        System.out.println(java.util.Arrays.deepToString(doubleDimen));

        ArrayList<String> arr = new ArrayList<String>();
        arr.add("School");
        arr.add("39");
        System.out.println((arr.get(0)));

        arr.remove(1);
        System.out.println(arr);

        // sample  - create a two dimensional array with 4 rows and 3 columns. Fill only the first column with any fruits of ur choice
        String [] [] twoDimen = new String [4][3];
        twoDimen [0] [0] = "Apple";
        twoDimen [1] [0] = "Mango";
        twoDimen [2] [0] = "Berry";
        twoDimen [3] [0] = "orange";

        System.out.println(java.util.Arrays.deepToString(twoDimen));
    }
}
