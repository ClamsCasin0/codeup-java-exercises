package util;

import java.util.Scanner;

public class Input {
        private Scanner sc;


        public String getString() {
            return this.sc.next();
        }


        public boolean yesNo() {
            String input = this.sc.next();
            if(input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes")) {
                return true;
            } else {
                return false;
            }
        }



        public int getInt(int min, int max) {
            System.out.println("Please input an integer between " + min + " and " + max: );
            int userInput = this.getInt();

            if(userInput > max || userInput < min) {
                return getInt(min, max);
            } else {
                return userInput;
            }
        }

        public int getInt(){
            return this.sc.nextInt();
        }


        public double getDouble(double min, double max) {
            System.out.println("Please input a double integer bewtween " + min + " and " + max);
            double userinput3 = this.getDouble();

            if(userinput3 > max || userinput3 < min) {
                return getDouble(min, max);
            } else {
                return userinput3;
            }
        }


}
