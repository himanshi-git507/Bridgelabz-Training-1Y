import java.util.*;
import java.util.stream.*;

class Movie {
    String name;
    double rating;
    int year;

    Movie(String name, double rating, int year) {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }

    public String toString() {
        return name + " | Rating: " + rating + " | Year: " + year;
    }
}

public class MovieApp {
    public static void main(String[] args) {

        List<Movie> movies = Arrays.asList(
                new Movie("MovieA", 8.5, 2023),
                new Movie("MovieB", 9.0, 2024),
                new Movie("MovieC", 7.8, 2022),
                new Movie("MovieD", 8.9, 2024),
                new Movie("MovieE", 9.2, 2025),
                new Movie("MovieF", 8.7, 2023),
                new Movie("MovieG", 9.1, 2025)
        );

        List<Movie> topMovies = movies.stream()
                .filter(m -> m.year >= 2023)
                .sorted((m1, m2) -> {
                    if (m2.rating == m1.rating) {
                        return m2.year - m1.year;
                    }
                    return Double.compare(m2.rating, m1.rating);
                })
                .limit(5)
                .collect(Collectors.toList());

        topMovies.forEach(System.out::println);
    }
}
