package movies;
import util.Input;
import java.util.ArrayList;

public class MoviesApplication {
    public static void main(String[] args) {
        Input input = new Input();
        String userChoice;


        System.out.println("Hello again to the Post Oscars Movie Database!");
        System.out.println("Enter a number (0-7) to access the option desired!");

        do {
            movieOptions();
            System.out.println("Enter in your selection!: ");
            userChoice = input.getString();

            if(userChoice.equals("1")) {
                allMovies();
            } else if(userChoice.equals("2")) {
                listMoviesCategory("comedy");
            } else if(userChoice.equals("3")) {
                listMoviesCategory("horror");
            } else if(userChoice.equals("4")) {
                listMoviesCategory("scifi");
            } else if (userChoice.equals("5")) {
                listMoviesCategory("drama");
            } else if (userChoice.equals("6")) {
                listMoviesCategory("musical");
            } else if (userChoice.equals("7")) {
                listMoviesCategory("animated");
            } else if(userChoice.equals("8")) {
                addMovie();
            }
            System.out.println();

        } while(!userChoice.equals("0"));

        System.out.println("That's all folks!");
    }

    public static void movieOptions() {
        System.out.println("0 -===- exit");
        System.out.println("1 -===- List all movies");
        System.out.println("2 -===- List all movies in Comedy category/genre");
        System.out.println("3 -===- List all movies in Horror category/genre");
        System.out.println("4 -===- List all movies in Sci-fi category/genre");
        System.out.println("5 -===- List all movies in Drama category/genre");
        System.out.println("6 -===- List all movies in Musical category/genre");
        System.out.println("7 -===- List all movies in Animation category/genre");
        System.out.println("8 -===- Add your favorite movie ");
    }

    public static void listMoviesCategory(String category) {
        Movie[] allMovies = MoviesArray.findAll();


        for(Movie movie : allMovies) {
            if(movie.getCategoryOf().equalsIgnoreCase(category)) {
                System.out.println("**---+---+---+---+---+---+---+---+---**");
                System.out.print("| ");
                System.out.println(movie.getNameIs() + " -- " + movie.getCategoryOf());
                System.out.println("**---+---+---+---+---+---+---+---+---**");
                System.out.print("| ");
            }
        }
    }

    public static void allMovies() {
        Movie[] allMovies = MoviesArray.findAll();
        for(Movie movie : allMovies) {
            System.out.println("**---+---+---+---+---+---+---+---+---**");
            System.out.print("| ");
            System.out.println(movie.getNameIs() + " -- " + movie.getCategoryOf());
            System.out.print("| ");
            System.out.println("**---+---+---+---+---+---+---+---+---**");

        }
    }


    public static void addMovie() {

        Input input = new Input();


        System.out.println("Please enter the name of the movie you'd like to add: ");
        String userMovieAdd = input.getString();

        System.out.println("Please name the category/genre of the movie entered: ");
        String userMovieCategory = input.getString();

        Movie userMovie = new Movie(userMovieAdd, userMovieCategory);

        allMovies();

        System.out.println("**---+---+---+---+---+---+---+---+---**");
        System.out.print("| ");
//        System.out.println(userMovie.getNameIs() + " -- " + userMovie.getCategoryOf());
        System.out.printf("%-14s -- %-10s", userMovie.getNameIs(), userMovie.getCategoryOf());
        System.out.println();
        System.out.println("**---+---+---+---+---+---+---+---+---**");
        System.out.print("| ");


    }

}
