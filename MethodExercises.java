import java.util.Scanner;

public class MethodExercises {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1
//        System.out.println(add(15.5, 15.5));
//
//        System.out.println(subtract(6, 5));
//
//        System.out.println(multiply(3, 5));
//
//        System.out.println(divide(14, 2));
//
//        System.out.println(modulus(50, 10));


////2
//        System.out.print("Enter a number between 1 and 10: ");
//        int userInput = getInteger(1, 10);
//        System.out.println("Your integer is: " + userInput);


////3
        userChosenFactorial(sc);


//4
                  rollDiceGame(sc);

    }

//1


//        public static double add ( double a1, double b1){
//            return a1 + b1;
//        }
//
////
//
//
//        public static double subtract ( double a1, double b1){
//            return a1 - b1;
//        }
//
////
//
//
//        public static double multiply ( double a1, double b1){
//            return a1 * b1;
//        }
//
////
//
//
//        public static double divide ( double a1, double b1){
//            return a1 / b1;
//        }
//
////
//
//
//        public static double modulus ( double a1, double b1){
//            return a1 % b1;
//        }

//



////2
        public static int getInteger(int min, int max) {
            Scanner sc = new Scanner(System.in);
            if (!sc.hasNextInt()) {
                System.out.println("Not a number!");
                return getInteger(min, max);
            }
            int userInput = sc.nextInt();
            if (userInput >= min && userInput <= max) {
                return userInput;
            } else {
                System.out.println("Number not in range!");
                return getInteger(min, max);
            }
        }

//


//3

        public static long calculateFactorial(int num) {
            int output = 1;
            for (int i = 1; i <= num; i += 1) {
                output *= i;

            }
            return output;
        }

        public static void userChosenFactorial(Scanner sc) {
            boolean willContinue;
            String userChoice;
            do {
                System.out.println("Please enter an integer from 1 to 10");
                int userInt = getInteger(1, 10);
                System.out.println(calculateFactorial(userInt));
                do {
                    System.out.println("Do you wish to continue? [y/n]: ");
                    userChoice = sc.next().trim();
                } while (!userChoice.equalsIgnoreCase("y") & !userChoice.equalsIgnoreCase("n"));

                willContinue = userChoice.equalsIgnoreCase("y");
            } while (willContinue);
        }



    public static int randomWithRange(int min, int max)
    {
        int range = (max - min) + 1;
        return (int)(Math.random() * range) + min;
    }

    public static void rollDiceGame(Scanner sc) {
        String userChoice;
        System.out.print("Please enter the number of sides for the dice: ");
        int nSides = getInteger(1, 20);
        do {
            System.out.println("You have rolled a " + randomWithRange(1, nSides) + " and a " + randomWithRange(1, nSides));
            do {
                System.out.println("Would you like to roll again? [y/n]");
                userChoice = sc.next().trim();
            } while (!userChoice.equalsIgnoreCase("y") & !userChoice.equalsIgnoreCase("n"));

        } while (!userChoice.equals("n"));
    }



}


