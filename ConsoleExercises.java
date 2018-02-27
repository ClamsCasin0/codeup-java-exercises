import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

          System.out.print("Enter a integer: ");
          int userInput = sc.nextInt();
          System.out.println("You entered : --> \"" + userInput + "\" <--");



//        System.out.print("Please enter 3 words: ");
//        String firstWord, secondWord, thirdWord;
//        firstWord = sc.nextLine();
//        secondWord = sc.nextLine();
//        thirdWord = sc.nextLine();

//        System.out.println(firstWord);
//        System.out.println(secondWord);
//        System.out.println(thirdWord);

//          sc.nextLine();

//        System.out.println("Enter a sentence: ");
//        String sentence = sc.nextLine();
//        System.out.println(sentence);



        System.out.print("Please enter the room length: ");
        String lengthString = sc.nextLine();
        double length = Double.parseDouble(lengthString);

        System.out.print("Please enter the room width: ");
        double width = Double.parseDouble(sc.nextLine());


        double area = width * length;
        double perimeter = 2 * width + 2 * length;
        double volume = length * length * length;

        System.out.printf("%.2f = %.2f x %.2f\n", area, length, width);
        System.out.printf("%.2f = 2 x %.2f + 2 x %.2f\n", perimeter, length, width);
        System.out.printf("%.2f = %.2f x %.2f x %.2f\n", volume, length, length, length);

    }
}