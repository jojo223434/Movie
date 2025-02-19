public class Movie {
    // Egenskaber (felter)
    private int id;
    private String title;
    private String director;
    private String genre;
    private int productionYear;
    private Double rating;

    // Constructor
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
        return id;  // id is read-only
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

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    // Override toString() method
    @Override
    public String toString() {
        return String.format("Movie ID: %d\nTitle: %s\nDirector: %s\nGenre: %s\nProduction Year: %d\nRating: %.1f",
                id, title, director, genre, productionYear, rating);
    }
}
