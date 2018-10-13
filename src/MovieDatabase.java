import java.util.ArrayList;
import java.util.List;

public class MovieDatabase {

    private List<Movie> movies = new ArrayList<>();

    void add(Movie movie) {
        movies.add(movie);
    }

    void removeById(int movieId) {
        Movie foundMovie = findById(movieId);
        if(foundMovie != null)
            movies.remove(foundMovie);
    }

    Movie findById(int movieId) {
        for (Movie movie : movies) {
            if(movie.getId() == movieId)
                return movie;
        }
        return null;
    }

}
