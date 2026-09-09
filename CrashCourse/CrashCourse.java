package CrashCourse;

import java.util.ArrayList;

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

        int[][] arryGrid2 = {{7, 8, 9},
                             {4, 5, 6},
                             {1, 2, 3}};

        System.out.println(arryGrid2[0][1] + arryGrid2[1][0]); //access number 8
        System.out.println(arryGrid2[2][2]); //access number 3

        System.out.println(arryGrid2);

        // ArrayList
        // Can be any size, lots of built in function to help
        // Avoid primative data types. Special classes for Int Double Boolean and String. Called "wrapper classes"
        ArrayList<String> arryLst = new ArrayList<>();

        arryLst.add("Word 1"); 
        arryLst.add("Word 2"); 
        arryLst.add("Word 3");
        arryLst.remove(0);
        arryLst.add(0, "Word 4");
        arryLst.set(2, "Word 5");
        System.out.println(arryLst);
        System.out.println(arryLst.size());
        System.out.println(arryLst.get(2));

        // Math Class
        Math.max(7,3);
        Math.min(5,9);
        Math.sqrt(14);
        Math.abs(-22);

        //boolean
        boolean tru = true; boolean fal = false;

        if(fal) {
            System.out.println("Reached first condition");
        } else {
            System.out.println("Reached Else");
        }

         if(fal) {
            System.out.println("Reached first condition");
        } else if (!tru) {
            System.out.println("Reached second condition");
        } else {
            System.out.println("Reached else");
        }

        // Iteration
        // while loop
        int x = 5;
        while (x < 10) {
            System.out.println(x + " ");
            x++;
        }

        //for loop
        // initialize variable for index; give it a conditional; increment decrement
        
        

        for(int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        ArrayList<String> animals = new ArrayList<>();
        animals.add("Sheep");
        animals.add("Dog");
        animals.add("Duck");
        System.out.println("ArrayList " + animals);

        for (String s : animals) {
            System.out.println("We saw a " + s);
        }

        double[] arry =  {5.1, 6.7, 9.4, 4.1, 6.9};
        System.out.println("Memory address " + arry);
        for (int i = 1; i < arry.length; i++) {
            System.out.println(arry[i]);
        }

        int[][] arryMatrix = { {41, 67, 69}, {21, 49, 17}, {98, 20, 4} };
        
        for(int row = 0; row < arryMatrix.length; row++) {
            for(int col = 0; col < arryMatrix[row].length; col++)
                System.out.println(arryMatrix[row][col] + " ");
        }

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
