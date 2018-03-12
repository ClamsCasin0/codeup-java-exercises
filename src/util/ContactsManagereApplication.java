package util;


import util.Input;

public class ContactsManagereApplication {

    public static void main(String[] args) {
        Input input = new Input();
        String userInput;

        System.out.println("Welcome to your Contacts Manager!");
        System.out.println("Enter a number (0-4) to access the desired option!");

        do {
            contactOptions();
            System.out.println("What would you like to do? ");
            userInput = input.getString();

            if (userInput.equals("1")) {
                showAllContacts();
            } else if (userInput.equals("2")) {

            } else if (userInput.equals("3")) {

            } else if (userInput.equals("4")) {

            }

            System.out.println();

        } while (!userInput.equals("0"));

        System.out.println("Exiting Contact Manager Application!");
        System.out.println("Good-bye!!!");


    }

    public static void contactOptions () {
        System.out.println("0 -===- Exit");
        System.out.println("1 -===- View all contacts.");
        System.out.println("2 -===- Add a new contact.");
        System.out.println("3 -===- Search by Contact Name");
        System.out.println("4 -===- Delete an existing Contact");
    }

    public static void showAllContacts () {
        Movie[] allMovies = MoviesArray.findAll();
        for (Movie movie : allMovies) {
            System.out.println("**---+---+---+---+---+---+---+---+---**");
            System.out.print("| ");
            System.out.println(movie.getNameIs() + " -- " + movie.getCategoryOf());
            System.out.print("| ");
            System.out.println("**---+---+---+---+---+---+---+---+---**");

        }
    }

}
