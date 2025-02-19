import java.util.*;

class Movie implements Comparable<Movie> {
    private int id;
    private String title;
    private String director;
    private String genre;
    private int productionYear;
    private Double rating;

    // Konstruktør
    public Movie(int id, String title, String director, String genre, int productionYear, Double rating) {
        this.id = id;
        this.title = title;
        this.director = director;
        this.genre = genre;
        this.productionYear = productionYear;
        this.rating = rating;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public String getGenre() {
        return genre;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public Double getRating() {
        return rating;
    }

    // toString() for at udskrive filmdetaljer
    @Override
    public String toString() {
        return String.format("Movie ID: %d\nTitle: %s\nDirector: %s\nGenre: %s\nProduction Year: %d\nRating: %.1f\n",
                id, title, director, genre, productionYear, rating);
    }

    // Sammenlign film efter ID
    @Override
    public int compareTo(Movie m) {
        return Integer.compare(this.id, m.id);
    }
}

// Komparator til at sortere film efter titel
class TitleComparator implements Comparator<Movie> {
    @Override
    public int compare(Movie m1, Movie m2) {
        return m1.getTitle().compareTo(m2.getTitle()); // Stigende rækkefølge (A-Z)
    }
}