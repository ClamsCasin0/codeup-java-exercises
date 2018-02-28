import java.util.Scanner;

import java.lang.Math;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//
//        int i = 5;
//        while (i <= 15) {
//            System.out.println("The current value of i is " + i);
//            i++;
//        }



//        int i = 0;
//        do {
//            System.out.println("i is " + i);
//            i += 2;
//        } while(i <= 100);




//          int i = 100;
//          do {
//              System.out.println("i is " + i);
//              i -= 5;
//          } while(i >= -10);



//          int i = 2;
//          do {
//              System.out.println(i);
//              i *= i;
//          } while(i <= 1000000);



//        System.out.println("Before loop");
//
//        for(int i = 100; i >= -10; i -= 5){
//            System.out.println("i is " + i);
//        }
//
//        System.out.println("after loop");



//        System.out.println("Before loop");
//
//        for(int i = 2; i <= 1000000; i *= i){
//            System.out.println("i is " + i);
//        }
//
//        System.out.println("after loop");




        for (int i = 1; i <= 100; i += 1) {
        if (i % 3 == 0 && i % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (i % 3 == 0) {
            System.out.println("Fizz");
        } else if (i % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(i);
        }
    }



    }
}



