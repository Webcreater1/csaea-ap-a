package Practice;

public class Movie {

    private String title;
    private int year;
    private double rating;
    private boolean watched;
    private String author;

    public Movie(String title, double rating, int year, String author) {
        this.title = title;
        this.rating = rating;
        this.year = year;
        this.author = author;

        watched = true;
    }

    public String toString() {
        return "Movie: " + title + ", Year: " + year + ", Rating: " + rating + ", Watched: " + watched;
    }
    
    public boolean isDisney() {
        if (author.indexOf("Disney") != -1) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean sameLastName(String otherAuthor) {
        return author.substring(author.indexOf(".") + 1).equals(otherAuthor.substring(otherAuthor.indexOf(".") + 1));
    }

    public boolean isClassic(int currentYear) {
        return currentYear - year >= 25 && watched;
    }

}
