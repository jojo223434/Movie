public class Main {
    public static void main(String[] args) {
        // Creating a few Movie objects
        Movie movie1 = new Movie(1, "The Shawshank Redemption", "Frank Darabont", "Drama", 1994, 9.3);
        Movie movie2 = new Movie(2, "The Dark Knight", "Christopher Nolan", "Action", 2008, 9.0);
        Movie movie3 = new Movie(3, "Inception", "Christopher Nolan", "Sci-Fi", 2010, 8.8);

        // Displaying movie details using toString() method
        System.out.println(movie1);
        System.out.println();  // Empty line for separation
        System.out.println(movie2);
        System.out.println();  // Empty line for separation
        System.out.println(movie3);
    }
}
