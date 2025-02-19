import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MovieSortingProject {
    public static void main(String[] args) {
        List<Movie> movieList = new ArrayList<>();

        // Tilføj film til listen
        movieList.add(new Movie(1, "Inception", "Christopher Nolan", "Sci-Fi", 2010, 8.8));
        movieList.add(new Movie(2, "The Dark Knight", "Christopher Nolan", "Action", 2008, 9.0));
        movieList.add(new Movie(3, "The Shawshank Redemption", "Frank Darabont", "Drama", 1994, 9.3));
        movieList.add(new Movie(4, "Forrest Gump", "Robert Zemeckis", "Drama", 1994, 8.8));
        movieList.add(new Movie(5, "The Godfather", "Francis Ford Coppola", "Crime", 1972, 9.2));

        // Udskriv listen før sortering
        System.out.println("Original filmliste");
        printMovies(movieList);

        // Sorter film efter ID (naturlig rækkefølge)
        Collections.sort(movieList);
        System.out.println("\nListe over film sorteret efter ID:");
        printMovies(movieList);

        // Sorter film efter titel (Titel) i stigende rækkefølge (A-Z)
        Collections.sort(movieList, new TitleComparator());
        System.out.println("\nListe over film sorteret efter titel (A-Z):");
        printMovies(movieList);

        // Sorter film efter titel (Z-A) faldende
        Collections.sort(movieList, Collections.reverseOrder(new TitleComparator()));
        System.out.println("\nListe over film sorteret efter titel (Z-A):");
        printMovies(movieList);
    }

    // Funktion til at udskrive filmlisten
    public static void printMovies(List<Movie> movies) {
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }
}