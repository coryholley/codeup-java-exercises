package movies;

import util.Input;
import movies.MoviesArray;

import java.util.Arrays;

import static movies.Movie.addMovie;

public class MoviesApplication {

    public static void movieSelection() {
        System.out.println("What would you like to do?");
        System.out.println("0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the sci-fi category\n" +
                "6 - add a new movie");

        int userResponse = new Input().getInt("What would you like to do?");
        Movie[] movies = MoviesArray.findAll();

        if (userResponse == 0) {
            System.exit(0);
        } else if (userResponse == 1) {
            for (Movie movie : movies) {
                System.out.println(movie.getName() + " - " + movie.getCategory());
            }
        } else if (userResponse == 2) {
            for (Movie movie : movies) {
                if (movie.getCategory().equalsIgnoreCase("animated")) {
                    System.out.println(movie.getName() + " - " + movie.getCategory());
                }
            }
        } else if (userResponse == 3) {
            for (Movie movie : movies) {
                if (movie.getCategory().equalsIgnoreCase("drama")) {
                    System.out.println(movie.getName() + " - " + movie.getCategory());
                }
            }
        } else if (userResponse == 4) {
            for (Movie movie : movies) {
                if (movie.getCategory().equalsIgnoreCase("horror")) {
                    System.out.println(movie.getName() + " - " + movie.getCategory());
                }
            }
        } else if (userResponse == 5) {
            for (Movie movie : movies) {
                if (movie.getCategory().equalsIgnoreCase("sci-fi")) {
                    System.out.println(movie.getName() + " - " + movie.getCategory());
                }
            }
        } else if (userResponse == 6) {
            String newName = new Input().getString("Please enter the new movie name.");
            String newCategory = new Input().getString("Please enter the movie category/genre.");
            for (Movie newMovies: addMovie(movies, new Movie(newName, newCategory))) {
                System.out.println(newMovies.getName() + " - " + newMovies.getCategory());
            }
        } else {
            System.out.println("You did not enter a valid number. Please try again.");
            movieSelection();
        }
    }

    public static void main(String[] args) {

        boolean toContinue;

        do {
            MoviesApplication.movieSelection();
            toContinue = new Input().yesNo("Would you like to continue? [y/n]");
        } while (toContinue);

    }
}
