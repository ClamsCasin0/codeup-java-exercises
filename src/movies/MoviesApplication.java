package movies;
import util.Input;
import java.util.ArrayList;
import java.util.Arrays;

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

            if (userChoice.equals("1")) {
                allMovies();
            } else if (userChoice.equals("2")) {
                listMoviesCategory("comedy");
            } else if (userChoice.equals("3")) {
                listMoviesCategory("horror");
            } else if (userChoice.equals("4")) {
                listMoviesCategory("scifi");
            } else if (userChoice.equals("5")) {
                listMoviesCategory("drama");
            } else if (userChoice.equals("6")) {
                listMoviesCategory("musical");
            } else if (userChoice.equals("7")) {
                listMoviesCategory("animated");
            } else if (userChoice.equals("8")) {
                userAddMovie();
            }
            System.out.println();

        } while (!userChoice.equals("0"));

        System.out.println("That's all folks!");
    }

        public static void movieOptions () {
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

        public static void listMoviesCategory (String category){
            Movie[] allMovies = MoviesArray.findAll();


            for (Movie movie : allMovies) {
                if (movie.getCategoryOf().equalsIgnoreCase(category)) {
                    System.out.println("**---+---+---+---+---+---+---+---+---**");
                    System.out.print("| ");
                    System.out.println(movie.getNameIs() + " -- " + movie.getCategoryOf());
                    System.out.println("**---+---+---+---+---+---+---+---+---**");
                    System.out.print("| ");
                }
            }
        }

        public static void allMovies () {
            Movie[] allMovies = MoviesArray.findAll();
            for (Movie movie : allMovies) {
                System.out.println("**---+---+---+---+---+---+---+---+---**");
                System.out.print("| ");
                System.out.println(movie.getNameIs() + " -- " + movie.getCategoryOf());
                System.out.print("| ");
                System.out.println("**---+---+---+---+---+---+---+---+---**");

            }
        }

        //easy way of placing movie onto list

//    public static void addMovie() {
//
//        Input input = new Input();
//
//
//        System.out.println("Please enter the name of the movie you'd like to add: ");
//        String userMovieAdd = input.getString();
//
//        System.out.println("Please enter \"comedy\"/\"horror\"/\"scifi\"/\"drama\"/\"musical\"/\"animated\" as the category/genre: ");
//        String userMovieCategory = input.getString();
//
//        Movie userMovie = new Movie(userMovieAdd, userMovieCategory);
//
//        allMovies();
//
//        System.out.println("**---+---+---+---+---+---+---+---+---**");
//        System.out.print("| ");
////        System.out.println(userMovie.getNameIs() + " -- " + userMovie.getCategoryOf());
//        System.out.printf("%-14s -- %-10s", userMovie.getNameIs(), userMovie.getCategoryOf());
//        System.out.println();
//        System.out.println("**---+---+---+---+---+---+---+---+---**");
//        System.out.print("| ");
//
//
//    }


        public static void userAddMovie () {
            Input input = new Input();
            Movie[] copyArray;
            copyArray = new Movie[MoviesArray.findAll().length + 1];

            System.arraycopy(MoviesArray.findAll(), 0, copyArray, 0, MoviesArray.findAll().length);
            System.out.println("Please enter the name of the movie you'd like to add: ");
            String userMovieAdd = input.getString();

        System.out.println("Please enter \"comedy\"/\"horror\"/\"scifi\"/\"drama\"/\"musical\"/\"animated\" as the category/genre: ");
        String userMovieCategory = input.getString();
//
//            boolean willContinue = true;
//
//            do {
//                System.out.println("Please enter \"comedy\"/\"horror\"/\"scifi\"/\"drama\"/\"musical\"/\"animated\" as the category/genre: ");
//                String userMovieCategory = input.getString();
//                if (userMovieCategory.equalsIgnoreCase("comedy") || userMovieCategory.equalsIgnoreCase("horror") ||
//                        userMovieCategory.equalsIgnoreCase("scifi") || userMovieCategory.equalsIgnoreCase("drama") ||
//                        userMovieCategory.equalsIgnoreCase("musical") || userMovieCategory.equalsIgnoreCase("animated") )  {
//                    willContinue = true;
//                } else {
//                    willContinue = false;
//                }
//
//            } while (willContinue);

            copyArray[copyArray.length - 1] = new Movie(userMovieAdd, userMovieCategory);

            for (int i = 0; i < copyArray.length; i++) {
                System.out.println("**---+---+---+---+---+---+---+---+---**");
                System.out.print("| ");
                System.out.printf("%-14s -- %-10s\n", copyArray[i].getNameIs(), copyArray[i].getCategoryOf());
                System.out.println();
                System.out.println("**---+---+---+---+---+---+---+---+---**");
                System.out.print("| ");

            }


        }

//        private static void notCategory () {
//            Input input = new Input();
//
//            do {
//
//        System.out.println("Please enter \"comedy\"/\"horror\"/\"scifi\"/\"drama\"/\"musical\"/\"animated\" as the category/genre: ");
//        String userMovieCategory = input.getString();
//
//                if (userMovieCategory.equals("comedy")) {
//                    System.out.println(userMovieCategory.equalsIgnoreCase("comedy"));
//                } else if (!userMovieCategory.equals("horror")) {
//                    System.out.println(userMovieCategory.equalsIgnoreCase("horror"));
//                } else if (!userMovieCategory.equals("scifi")) {
//                    System.out.println(userMovieCategory.equalsIgnoreCase("scifi"));
//                } else if (!userMovieCategory.equals("drama")) {
//                    System.out.println(userMovieCategory.equalsIgnoreCase("drama"));
//                } else if (!userMovieCategory.equals("musical")) {
//                    System.out.println(userMovieCategory.equalsIgnoreCase("musical"));
//                } else if (!userMovieCategory.equals("animated")) {
//                    System.out.println(userMovieCategory.equalsIgnoreCase("animated"));
//                } else System.out.println("Please enter \"comedy\"/\"horror\"/\"scifi\"/\"drama\"/\"musical\"/\"animated\" as the category/genre: ");
//
//
//                System.out.println();
//
//            }
//            while (!userMovieCategory.equals("comedy") || !userMovieCategory.equals("horror") || !userMovieCategory.equals("scifi") ||
//                    !userMovieCategory.equals("drama") || !userMovieCategory.equals("musical") || !userMovieCategory.equals("animated"));






        }


