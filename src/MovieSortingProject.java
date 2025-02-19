import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MovieSortingProject {

    public static void main(String[] args) {
        // Opret en liste over filmobjekter
        List<Movie> movies = new ArrayList<>();

        // Tilføj 5 forskellige filmobjekter
        movies.add(new Movie(1, "Inception", "Christopher Nolan", "Sci-Fi", 2010, 8.8));
        movies.add(new Movie(2, "The Dark Knight", "Christopher Nolan", "Action", 2008, 9.0));
        movies.add(new Movie(3, "The Shawshank Redemption", "Frank Darabont", "Drama", 1994, 9.3));
        movies.add(new Movie(4, "Forrest Gump", "Robert Zemeckis", "Drama", 1994, 8.8));
        movies.add(new Movie(5, "The Godfather", "Francis Ford Coppola", "Crime", 1972, 9.2));

        // Bland listen med Collections.shuffle()
        Collections.shuffle(movies);

        // Udskriv filmliste efter blanding
        System.out.println("قائمة الأفلام بعد الخلط:");
        for (Movie movie : movies) {
            System.out.println(movie);
            System.out.println(); // Tom linje for at adskille film bedre
        }
    }
}

