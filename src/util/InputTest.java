package util;



public class InputTest {
    public static void main(String[] args) {
        Input inPut = new Input();

        System.out.println("Please input an Integer");
        int userInt = inPut.getInt();
        System.out.println();

        int betweenInt = inPut.getInt(1, 100);
        System.out.println(betweenInt);


        System.out.println("Please input a double Integer");
        double dblDbl = inPut.getDouble();
        System.out.println(dblDbl);

        double anotherDouble = inPut.getDouble(1.0, 20.0);
        System.out.println(anotherDouble);

        System.out.println("Please input yes or a no");

        if(inPut.yesNo()) {
            System.out.println("You input yes or 'y'");
        } else {
            System.out.println("You said anything other than yes.");
        }

        String someString = inPut.getString();
        System.out.println("You provided: " + someString);

    }

}
