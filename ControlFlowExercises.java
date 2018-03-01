import java.util.Scanner;


public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//
//        int i = 5;
//        while (i <= 15) {
//            System.out.print(" " + i);
//            i++;
//        }



//        int i = 0;
//        do {
//            System.out.println(i);
//            i += 2;
//        } while(i <= 100);




//          int i = 100;
//          do {
//              System.out.println("i is " + i);
//              i -= 5;
//          } while(i >= -10);


// ***changing int to long enables it to take the large integer***
//          **long i = 2;** fixes repeating 00000 at end***
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
//        for(long i = 2; i <= 1000000; i *= i){
//            System.out.println("i is " + i);
//        }
//
//        System.out.println("after loop");

/// how to use import java.lang.Math
//        i = (int) Math.pow(i, 2);



//        System.out.println("Before loop");

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
//        System.out.println("After Loop");





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
//                for (int i = 1; i <= userInt; i++) {
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




//            boolean willContinue;
//          do {
//              System.out.println("Please enter a grade integer from 0 to 100");
//              int gradeInteger = sc.nextInt();
//                char gradeLetter = ' ';
//                if(gradeInteger >= 99) {
//                    System.out.println("A+");
//                } else if(gradeInteger >= 88) {
//                    gradeLetter = 'A';
//                } else if (gradeInteger >= 80) {
//                    gradeLetter = 'B';
//                } else if (gradeInteger >= 67) {
//                    gradeLetter = 'C';
//                } else if (gradeInteger >= 60) {
//                    gradeLetter = 'D';
//                } else if (gradeInteger >= 0) {
//                    gradeLetter = 'F';
//                }
//
//              System.out.println(gradeLetter);
//
//              System.out.print("\nDo you wish to continue? [y/n] or [yes/no]");
//                String userChoice = sc.next();
//                if (userChoice.equalsIgnoreCase("y") || userChoice.equalsIgnoreCase("yes")) {
//                    willContinue = true;
//                } else {
//                    willContinue = false;
//                }
//
//            } while (willContinue);
//






//          ================================= CONTROL STRUCTURES BONUSES
//        1. Prompt the user to enter an integer between 1 and 7 and output the day of the week it maps to (Sunday is 1 and Saturday is 7)



//        boolean willContinue = true;
//        do {
//            System.out.println("Please enter an integer from 1 to 7 for a day of the week");
//            int weekInteger = sc.nextInt();
//
//            if(weekInteger == 1) {
//                System.out.println("Sunday, the first day of the week!");
//            } else if(weekInteger == 2) {
//                System.out.println("I hate Mondays");
//            } else if(weekInteger == 3) {
//                System.out.println("Tuesday, very Fat");
//            } else if(weekInteger == 4) {
//                System.out.println("Wednesday, also known as Hump Day");
//            } else if(weekInteger == 5) {
//                System.out.println("Thursday, almost there-day");
//            } else if(weekInteger == 6) {
//                System.out.println("Friday, Get the party started!");
//            } else if(weekInteger == 7) {
//                System.out.println("Saturday, the best of them all!");
//            }
//
//            System.out.print("\nDo you wish to continue? [y/n] or [yes/no]");
//            String userChoice = sc.next();
//            if (userChoice.equalsIgnoreCase("y") || userChoice.equalsIgnoreCase("yes")) {
//                willContinue = true;
//            } else {
//                willContinue = false;
//            }
//        }while (willContinue);



//        2. Prompt the user for an integer. Output whether or not the number is prime.

//       boolean willContinue;
//
//        do {
//            System.out.print("Please enter a prime integer: ");
//            long primeInteger = sc.nextInt();
//            long i = primeInteger;
//
//            if (i % 1 == 0 && i % i == 0) {
//                System.out.println(primeInteger + " is a prime number");
//            } else  {
//                System.out.println(primeInteger + " is a NOT prime number");
//            }
//        System.out.print("\nDo you wish to continue? [y/n] or [yes/no]");
//        String userChoice = sc.next();
//        if (userChoice.equalsIgnoreCase("y") || userChoice.equalsIgnoreCase("yes")) {
//            willContinue = true;
//        } else {
//            willContinue = false;
//        }
//    }while (willContinue);

//        3. Prompt the user to enter an integer and output all the days of the week that
//        have no more letters than the integer given.

//        boolean willContinue;
//
//        do {
//            System.out.print("Please enter an integer and days of the week will given accordingly to how many letters are in each day: ");
//            int daysOfWeekInteger = sc.nextInt();
//
//            if (daysOfWeekInteger == 6) {
//                System.out.println("Monday, " + "Friday, " + "and Sunday " + "have 6 letters");
//            } else if (daysOfWeekInteger == 7)  {
//                System.out.println("Tuesday" + " has 7 letters");
//            } else if (daysOfWeekInteger == 8) {
//                System.out.println("Thursday and " + "Saturday " + "have 8 letters");
//            } else if (daysOfWeekInteger == 9) {
//                System.out.println("Wednesday " + "has the most letters at 9");
//            } else {
//                System.out.println("Nope, try a different integer");
//            }
//
//            System.out.print("\nDo you wish to continue? [y/n] or [yes/no]");
//            String userChoice = sc.next();
//            if (userChoice.equalsIgnoreCase("y") || userChoice.equalsIgnoreCase("yes")) {
//                willContinue = true;
//            } else {
//                willContinue = false;
//            }
//        }while (willContinue);


//        4. Prompt the user to enter their name. Output whether the name is
//                - short (less than 4 characters), medium (less than 9), long (more than 8)
//        - contains the letter 'y'
//                - is a palindrome
        boolean willContinue;
       do {


        System.out.println("Please enter your birth-given name: ");
        String userName = sc.next();

        if (userName.length() <= 4) {
            System.out.println("Short - Your name is less than 4 characters");
        } else if (userName.length() < 9) {
            System.out.println("Medium - Your name is less than 9 characters");
        } else if (userName.length() >= 9) {
            System.out.println("Long - Your name is more than 9 characters");
        } else if (userName.indexOf("y") <= 0) {
            System.out.println("Your name has a \"y\" in it");
        }


            System.out.print("\nDo you wish to continue? [y/n] or [yes/no]");
            String userChoice = sc.next();
            if (userChoice.equalsIgnoreCase("y") || userChoice.equalsIgnoreCase("yes")) {
                willContinue = true;
            } else {
                willContinue = false;
            }

    } while (willContinue);


//        5. Print out all times from 1:00am to 12:00pm.
//                Example:
//        1:00am
//        1:01am
//        1:02am
//        etc.
//                this will help you for this bonus...
//        https://stackoverflow.com/questions/12421444/how-to-format-a-number-0-9-to-display-with-2-digits-its-not-a-date




    }
}



