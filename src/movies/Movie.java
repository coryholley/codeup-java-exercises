package movies;

import java.util.Arrays;

public class Movie {

    private String name;
    private String category;

    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    };

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
     return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public static Movie[] addMovie(Movie[] arrayOfMovies, Movie movie) {
        Movie[] copyToReturn = Arrays.copyOf(arrayOfMovies, arrayOfMovies.length+1);
        copyToReturn[copyToReturn.length-1] = movie;
        return copyToReturn;
    }

}
