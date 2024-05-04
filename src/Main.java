//FinalCode
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MovieApp movieApp = new MovieApp();

        movieApp.registerWithEmail("safawandeey55@gmail.com");
        System.out.println("User registered with email: safawandeey55@gmail.com");

        movieApp.addMovie("Inception", "Leonardo DiCaprio, Joseph Gordon-Levitt", "Sci-Fi", "2010", 160000000);
        movieApp.addMovie("The Dark Knight", "Christian Bale, Heath Ledger", "Action", "2008", 185000000);
        movieApp.addMovie("Pulp Fiction", "John Travolta, Uma Thurman", "Crime", "1994", 8000000);
        movieApp.addMovie("Forrest Gump", "Tom Hanks, Robin Wright", "Drama", "1994", 55000000);
        movieApp.addMovie("The Shawshank Redemption", "Tim Robbins, Morgan Freeman", "Drama", "1994", 25000000);
        System.out.println("Movies added.");

        System.out.println("\nSearching for movies...");
        List<Movie> searchResult = movieApp.searchMovies("The");
        System.out.println("Search Result:");
        for (Movie movie : searchResult) {
            System.out.println("Title: " + movie.getTitle() + ", Cast: " + movie.getCast() + ", Category: " + movie.getCategory());
        }

        System.out.println("\nViewing movie details...");
        Movie movieDetails = movieApp.viewMovieDetails("The Shawshank Redemption");
        if (movieDetails != null) {
            System.out.println("Title: " + movieDetails.getTitle());
            System.out.println("Cast: " + movieDetails.getCast());
            System.out.println("Category: " + movieDetails.getCategory());
        } else {
            System.out.println("Movie not found.");
        }

        movieApp.addToFavorites("The Shawshank Redemption");
        System.out.println("\nAdded 'The Shawshank Redemption' to favorites.");

        System.out.println("\nViewing personal details and favorite movies...");
        String userDetails = movieApp.viewPersonalDetails();
        System.out.println("User Details:\n" + userDetails);

        System.out.println("\nSearching for favorite movies...");
        List<Movie> favoriteSearchResult = movieApp.searchFavoriteMovies("Shawshank");
        System.out.println("Favorite Movies:");
        for (Movie movie : favoriteSearchResult) {
            System.out.println("Title: " + movie.getTitle() + ", Cast: " + movie.getCast() + ", Category: " + movie.getCategory());
        }
    }
}








