package util;

import java.util.Scanner;

public class Input {
        private Scanner sc;


        public String getString() {
            return this.sc.next();
        }

        public String getString(String prompt) {
            System.out.println(prompt);
            return this.sc.next();
        }

        public boolean yesNo() {
            String input1 = this.sc.next();
            if(input1.equalsIgnoreCase("y") || input1.equalsIgnoreCase("yes")) {
                return true;
            } else {
                return false;
            }
        }

        public boolean yesNo(String prompt) {
            System.out.println(prompt);

            String input2 = this.sc.next();

            if(input2.equalsIgnoreCase("y") || input2.equalsIgnoreCase("yes")) {
                return true;
            } else {
                return false;
            }
        }


        public int getInt(int min, int max) {
            System.out.println("Please input an integer between " + min + " and " + max);
            int userInput3 = this.getInt();

            if(userInput3 > max || userInput3 < min) {
                return getInt(min, max);
            } else {
                return userInput3;
            }
        }

        public int getInt(int min, int max, String prompt) {
            System.out.println(prompt);

            int userInput4 = this.getInt();

            if(userInput4 > max || userInput4 < min) {
                return getInt(min, max);
            } else {
                return userInput4;
            }
        }


        public int getInt(){
            return this.sc.nextInt();
        }

        public int getInt(String prompt) {
            System.out.println(prompt);
            return this.sc.nextInt();
        }


        public double getDouble(double min, double max) {
            System.out.println("Please input a double integer bewtween " + min + " and " + max);
            double userinput5 = this.getDouble(min, max);

            if(userinput5 > max || userinput5 < min) {
                return getDouble(min, max);
            } else {
                return userinput5;
            }
        }

        public double getDouble(double min, double max, String prompt) {
            System.out.println(prompt);

            double userInput6 = this.getDouble();

            if(userInput6 > max || userInput6 < min) {
                return getDouble(min, max);
            } else {
                return userInput6;
            }
        }

        public double getDouble() {
            return this.sc.nextDouble();
        }

        public double getDouble(String prompt) {
            System.out.println(prompt);
            return this.sc.nextDouble();
        }

}
