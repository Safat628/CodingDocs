// FinalCode
import java.util.ArrayList;
import java.util.List;

public class MovieApp {
    private List<Movie> movies = new ArrayList<>();
    private List<Movie> favorites = new ArrayList<>();
    private String userEmail;

    public boolean registerWithEmail(String email) {
        this.userEmail = email;
        return true;
    }

    public void addMovie(String title, String cast, String category, String releaseDate, double budget) {
        movies.add(new Movie(title, cast, category, releaseDate, budget));
    }

    public List<Movie> searchMovies(String keyword) {
        List<Movie> result = new ArrayList<>();
        for (Movie movie : movies) {
            if (movie.getTitle().toLowerCase().contains(keyword.toLowerCase()) ||
                    movie.getCast().toLowerCase().contains(keyword.toLowerCase()) ||
                    movie.getCategory().toLowerCase().contains(keyword.toLowerCase())) {
                result.add(movie);
            }
        }
        return result;
    }

    public boolean addToFavorites(String title) {
        for (Movie movie : movies) {
            if (movie.getTitle().equalsIgnoreCase(title)) {
                favorites.add(movie);
                return true;
            }
        }
        return false; // Movie not found
    }

    public boolean removeFromFavorites(String title) {
        for (Movie movie : favorites) {
            if (movie.getTitle().equalsIgnoreCase(title)) {
                favorites.remove(movie);
                return true;
            }
        }
        return false; // Movie not found in favorites
    }

    public String viewPersonalDetails() {
        StringBuilder details = new StringBuilder();
        details.append("User Email: ").append(userEmail).append("\n");
        details.append("Favorite Movies:\n");
        for (int i = 0; i < favorites.size(); i++) {
            details.append(i + 1).append(". ").append(favorites.get(i).getTitle()).append("\n");
        }
        return details.toString();
    }

    public List<Movie> searchFavoriteMovies(String keyword) {
        List<Movie> result = new ArrayList<>();
        for (Movie movie : favorites) {
            if (movie.getTitle().toLowerCase().contains(keyword.toLowerCase()) ||
                    movie.getCast().toLowerCase().contains(keyword.toLowerCase()) ||
                    movie.getCategory().toLowerCase().contains(keyword.toLowerCase())) {
                result.add(movie);
            }
        }
        return result;
    }

    public Movie viewMovieDetails(String title) {
        for (Movie movie : movies) {
            if (movie.getTitle().equalsIgnoreCase(title)) {
                return movie;
            }
        }
        return null; // Movie not found
    }
}


