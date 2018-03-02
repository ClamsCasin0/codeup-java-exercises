import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    boolean willContinue = true;
    do {
        System.out.println("My name is Bob and I hate the society");
                String userResponse = sc.next();
              if(userResponse.endsWith("?")) {
                  System.out.println("Bob says: Sure....");
              } else if(userResponse.endsWith("!")) {
            System.out.println("Bob says: Whoa, Chill out man...");
             } else if(userResponse.trim().equals("")) {
                  System.out.println("Bob says: Fine, Be that way!");
              } else {
                  System.out.println("Bob says: Whatever");
              }



        System.out.print("\nBob says: Do you have anything else to say? I'm trying to be morbid.. [y/n] or [yes/no]\n");
                String userChoice = sc.next();
                if (userChoice.equalsIgnoreCase("y") || userChoice.equalsIgnoreCase("yes")) {
                    willContinue = true;
                } else {
                    willContinue = false;
                }

            } while (willContinue);

    }
}
