package Practice;

public class MovieTester {
   public static void main(String[] args) {
      
        Movie one = new Movie("Inception", 9);
        Movie two = new Movie("Interstellar", 8);
        Movie three = new Movie("Tenet", 7);
        one.printInfo();
        two.printInfo();
        three.printInfo();
   }
}


class Movie { 
    
    public String title;
    public int rating;

    public Movie(String t, int r) {
	    this.title = t;
	    this.rating = r;
    }

    public void printInfo() {
        System.out.println(title + " — Rating: " + rating);
    
    }
}
