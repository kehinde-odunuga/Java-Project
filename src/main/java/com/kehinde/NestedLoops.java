package com.kehinde;

public class NestedLoops {
    public static void main(String[] args) {
        /*
        while ---> 3
        for ---> 4
        do-while ---> 5
         */

        int i=0;
        int k=0;

        while (i<3) {
            for (int j=0; j<4; j++) {
                do{
                    System.out.println(i+" "+j+" "+k);
                    k++;
                } while (k<5);
            }
            i++;
        }


    }
}
