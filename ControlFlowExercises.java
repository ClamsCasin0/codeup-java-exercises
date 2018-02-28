import java.util.Scanner;


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




//        for (int i = 1; i <= 100; i += 1) {
//        if (i % 3 == 0 && i % 5 == 0) {
//            System.out.println("FizzBuzz");
//        } else if (i % 3 == 0) {
//            System.out.println("Fizz");
//        } else if (i % 5 == 0) {
//            System.out.println("Buzz");
//        } else {
//            System.out.println(i);
//        }
//    }



//        System.out.print("Enter a integer: ");
//        int userInput = sc.nextInt();
//        System.out.println("You entered : --> \"" + userInput + "\" <--");

//            boolean willContinue = true;
//
//            do {
//                System.out.print("What number would you like to go up to? ");
//                int userInt = sc.nextInt();
//
//                System.out.println("\nHere is your table!");
//                System.out.println("\nnumber | squared | cubed");
//                System.out.println("------ | ------- | -----");
//
//                for (int i = 1; i <= userInt; i += 1) {
//                    String output = "";
//                    output += String.format("%-7d", i);
//                    output += String.format("|%-9d", i * i);
//                    output += String.format("|%d", i * i * i);
//                    System.out.println(output);
//                }
//
//                System.out.print("\nDo you wish to continue? [y/n]");
//                String userChoice = sc.next();
//                if (userChoice.equalsIgnoreCase("y") || userChoice.equalsIgnoreCase("yes")) {
//                    willContinue = true;
//                } else {
//                    willContinue = false;
//                }
//
//            } while (willContinue);


            boolean willContinue = true;
//            String userChoice;
          do {
              System.out.println("Please enter a grade integer from 0 to 100");
              int gradeInteger = sc.nextInt();
                char gradeLetter = ' ';
                if(gradeInteger >= 99) {
                    System.out.println("A+");
                } else if(gradeInteger >= 88) {
                    gradeLetter = 'A';
                } else if (gradeInteger >= 80) {
                    gradeLetter = 'B';
                } else if (gradeInteger >= 67) {
                    gradeLetter = 'C';
                } else if (gradeInteger >= 60) {
                    gradeLetter = 'D';
                } else if (gradeInteger >= 0) {
                    gradeLetter = 'F';
                }

              System.out.println(gradeLetter);

              System.out.print("\nDo you wish to continue? [y/n] or [yes/no]");
                String userChoice = sc.next();
                if (userChoice.equalsIgnoreCase("y") || userChoice.equalsIgnoreCase("yes")) {
                    willContinue = true;
                } else {
                    willContinue = false;
                }

            } while (willContinue);
    }
}



