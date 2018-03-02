package util;



public class InputTest {
    public static void main(String[] args) {
        Input inPut = new Input();

        System.out.println("Please input an Integer");
        int userInt = inPut.getInt();
        System.out.println();

        int betweenInt = inPut.getInt(1, 100);
        System.out.println(betweenInt);

    }

}
