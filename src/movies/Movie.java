package movies;

import java.util.Arrays;

public class Movie {

    private String name;
    private String category;

    public Movie(String aName, String aCategory) {
        this.name = aName;
        this.category = aCategory;
    };

    public String getName() {
        return this.name;
    }

    public void setName(String aName) {
        this.name = aName;
    }

    public String getCategory() {
     return this.category;
    }

    public void setCategory(String aCategory) {
        this.category = aCategory;
    }

    public static Movie[] addMovie(Movie[] arrayOfMovies, Movie movie) {
        Movie[] copyToReturn = Arrays.copyOf(arrayOfMovies, arrayOfMovies.length+1);
        copyToReturn[copyToReturn.length-1] = movie;
        return copyToReturn;
    }

}
