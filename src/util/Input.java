package util;
import java.lang.NullPointerException;
import java.util.Scanner;

public class Input {
        private Scanner sc;
        public NullPointerException npe;

        public Input() {
            sc = new Scanner(System.in).useDelimiter("\n");
    }

        public String getString() {
            return sc.nextLine();
        }

        public String getString(String prompt) {
            System.out.println(prompt);
            return getString();
        }

        public boolean yesNo() {
            String input1 = getString();
            if(input1.equalsIgnoreCase("y") || input1.equalsIgnoreCase("yes")) {
                return true;
            } else {
                return false;
            }
        }

        public boolean yesNo(String prompt) {
            System.out.println(prompt);
            return yesNo();
        }


        public int getInt(int min, int max) {
//            System.out.println("Please input an integer between " + min + " and " + max);
            int userInput3 = getInt();

            if(userInput3 < min || userInput3 > max) {
                return getInt(min, max);
            } else {
                return userInput3;
            }
        }

        public int getInt(int min, int max, String prompt) {
            System.out.println(prompt);

                return getInt(min, max);
        }


        public int getInt() {
            return sc.nextInt();
        }

        public int getInt(String prompt) {
            System.out.println(prompt);
            return getInt();
        }

        public double getDouble() {
            return sc.nextDouble();
        }

        public double getDouble(String prompt) {
            System.out.println(prompt);
            return getDouble();
        }


        public double getDouble(double min, double max) {
//            System.out.println("Please input a double integer bewtween " + min + " and " + max);
            double userinput5 = getDouble();

            if(userinput5 < min || userinput5 > max) {
                return getDouble(min, max);
            } else {
                return userinput5;
            }
        }

        public double getDouble(double min, double max, String prompt) {
            System.out.println(prompt);
                return getDouble(min, max);
        }



}
