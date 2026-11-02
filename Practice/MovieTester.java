package Practice;

public class MovieTester {
   public static void main(String[] args) {
      
        Movie one = new Movie("Inception", 9.7, 1997, "Adam.Sandler");
        Movie two = new Movie("Interstellar", 8.2, 1989, "John.Marran");
        Movie three = new Movie("Tenet", 7.0, 2009, "Walt.Disney");

        System.out.println(one.toString());
        System.out.println(two.toString());
        System.out.println(three.toString());

        System.out.println("Expected: false");
        System.out.println(one.isDisney());
        System.out.println("Expected: false");
        System.out.println(two.isDisney());
        System.out.println("Expected: true");
        System.out.println(three.isDisney());

        System.out.println("Expected: True");
        System.out.println(one.sameLastName("Jake.Sandler"));
        System.out.println("Expected: False");
        System.out.println(two.sameLastName("Tony.Stark"));
        System.out.println("Expected: False");
        System.out.println(three.sameLastName("Luke.Skywalker"));

        System.out.println("Expected: True");
        System.out.println(one.isClassic(2026));
        System.out.println("Expected: True");
        System.out.println(two.isClassic(2026));
        System.out.println("Expected: False");
        System.out.println(three.isClassic(2026));
       
   }
}