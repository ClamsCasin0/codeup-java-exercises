import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {
    int userInput;
    Scanner sc = new Scanner(System.in);

        System.out.print("Enter something: ");
        userInput = sc.nextInt();

        System.out.println("You entered : --> \"" + userInput + "\" <--");

    }
}