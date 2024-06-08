package inheritance;

import java.util.Arrays;
import java.util.ArrayList;
public class BullDog extends Dog{
    public static void main(String[] args) {
        BullDog bd = new BullDog();
        bd.sound();

//        int a = 1;
//        while (a<10){
//            System.out.println(a);
//            a += 2;
//        }

//        for (int a = 1; a<10; a+=2){
//            System.out.println(a);
//        }

//        int b;
//        for (b=1; b<10; b++){
//            if (b%2==1){
//                System.out.println(b);
//            }
//        }
//        int c = 1;
//        do {
//            System.out.println(c +=2);
//        } while (c < 9);

        int [] nums = {12, 37, 5, 42, 8, 3};
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();

        for (int num : nums) {
                if (num % 2 == 0) {
                    even.add(num);
                } else {
                    odd.add(num);
                }
        }
        System.out.println("Initial numbers: "+ Arrays.toString(nums));
        System.out.println("Odd numbers: "+odd);
        System.out.println("Even numbers: "+even);

        System.out.println(10/0);
    }
}
