public class CrashCourse {
    
    public static void main(String[] args) {

        // comment

        //    Multiline 
        //    Comment

        System.out.print("Hello");
        System.out.println("Hello Beautiful World");

        // variable declaration
        // Primitive Variables
        int a; //interger
        double b; // decimal
        boolean c; // true or false

        a = 4;
        b = 5.5;
        c = false; // has to be in lowercase

        // Arithmatic operators
        // + - / *
        // += -= /= %=

        int d = 3;
        d += 7;

        System.out.println("d = " + d);

        d--;
        System.out.println("d is now equal to " + d);
        //increment and decrement by 1
        // ++ --

        //comparisons (always return true or false)
        // < > <= >= == !=
        System.out.println(4 > 5);
        System.out.println(9 > 3);
        System.out.println(4 == 5);

        // logical operators
        // NOT(!) AND(&&) OR(||)
        // Order of preceidence Not 1st, And 2nd, Or 3rd

        boolean e = false; boolean f = true;

        // predict output true or false

        System.out.println(!e);
        System.out.println(e && f);
        System.out.println(e || f);
        System.out.println(e || f && !e);

        System.out.println(e && ?); // it will short circute because it doesnt want to solve somethign it already knows will be false


  
  
  
    }
}
