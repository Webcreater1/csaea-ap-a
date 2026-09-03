package CrashCourse;
public class CrashCourse {
    
    public static void main(String[] args) {

        // Strings
        String s1 = "Goodnight"; String s2 = " and "; String s3 = "Goodbye";
        String result = s1 + s2 + s3;
        result += ", \nTho\tmas.";
        System.out.println(result + "\n");

        // Arrays
        int[] arry1 = new int[10];
        System.out.println(arry1);
        System.out.println("length: " + arry1.length);

        arry1[0] = 11;
        arry1[1] = 2;

        System.out.println( "Remainder: " + arry1[0] % arry1[1]);

        int[] arry2 = {34, 52, 3, 64, 32};
        System.out.println("arry2: " + arry2);

        // 2D arrays (grid or a table)

        int[][] arryGrid1 = new int[4][3]; //[rows] then [collumns]
        System.out.println("Rows: " + arryGrid1.length + "\nCollumns: " + arryGrid1[0].length);

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

        boolean f = false; boolean t = true;

        // predict output true or false

        System.out.println(!f);
        System.out.println(f && t);
        System.out.println(f || t);
        System.out.println(f || t && !f);

        System.out.println(f && t); // it will short circute because it doesnt want to solve somethign it already knows will be false
        System.out.println(t || f && t); //short circuts after checking first t

        // casting (converting)
        int g = (int)5.5;
        System.out.println(g);
        double h = (double)5/6;
        System.out.println(h);




  
  
    }
}
