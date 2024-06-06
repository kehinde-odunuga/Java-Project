package com.kehinde;

/*
break ---> break out of the loop
continue ---> continue to the next cycle --> to skip the iteration
 */
public class BreakAndContinue {
    public static void main(String[] args) {
        BreakAndContinue b = new BreakAndContinue();
        //b.go();

        for (int i=0; i<10; i++) {
            if (i>=5 && i<=7)
                continue;
            //if (i==5)
                //break;
            System.out.println(i);
        }
        System.out.println("Print");
    }

    public void go() {
        System.out.println("First");

        //break;

        System.out.println("Last");
    }
}
