import java.util.*;

class Movie {
    String name;
    String genre;

    public Movie(String name, String genre) {
        this.name = name;
        this.genre = genre;
    }

    public String toString() {
        return name + " (" + genre + ")";
    }
}

public class StreamingDemo {
    public static void main(String[] args) {
        List<Movie> allMovies = new ArrayList<>();
        allMovies.add(new Movie("Inception", "Sci-Fi"));
        allMovies.add(new Movie("Titanic", "Romance"));
        allMovies.add(new Movie("Avengers", "Action"));
        allMovies.add(new Movie("Interstellar", "Sci-Fi"));
        allMovies.add(new Movie("The Notebook", "Romance"));

        Queue<Movie> upNext = new LinkedList<>();
        upNext.add(allMovies.get(0));
        upNext.add(allMovies.get(2));
        upNext.add(allMovies.get(1));

        Stack<Movie> watchHistory = new Stack<>();
        Set<String> watchedGenres = new HashSet<>();

        while (!upNext.isEmpty()) {
            Movie current = upNext.poll();
            System.out.println("Watching: " + current);
            watchHistory.push(current);
            watchedGenres.add(current.genre);
        }

        System.out.println("\nWatch History:");
        for (Movie m : watchHistory) {
            System.out.println(m);
        }

        System.out.println("\nRecommended Movies:");
        for (Movie m : allMovies) {
            if (watchedGenres.contains(m.genre) && !watchHistory.contains(m)) {
                System.out.println(m);
            }
        }
    }
}
