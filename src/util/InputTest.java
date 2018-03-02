package util;

import java.lang.NullPointerException;

public class InputTest {
    public static void main(String[] args) {
        NullPointerException npe;
        Input inPut = new Input();

        System.out.println("Please input an Integer");
        int randInt = inPut.getInt();
        System.out.println(randInt);

        int betweenInt = inPut.getInt(1, 100);
        System.out.println(betweenInt);


        System.out.println("Please input a double Integer");
        double dblDbl = inPut.getDouble();
        System.out.println(dblDbl);

        double anotherDouble = inPut.getDouble(1.0, 20.0);
        System.out.println(anotherDouble);

        System.out.println("Please input yes or a no");

        if(inPut.yesNo("Wanna enter a extra number?")) {
            System.out.println("You input yes or 'y'");
        } else {
            System.out.println("You said anything other than yes.");
        }

        String someString = inPut.getString();
        System.out.println("You provided: " + someString);

    }

}
