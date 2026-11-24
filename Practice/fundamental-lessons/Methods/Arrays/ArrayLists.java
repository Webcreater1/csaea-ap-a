import java.util.ArrayList;

public class ArrayLists {

    public static ArrayList<String> createList() {
        ArrayList<String> animals = new ArrayList<String>();
        animals.add("Donkey");
        animals.add("Penguin");
        animals.add("Blobfish");
        animals.add("cat");
        return animals;
    }

    public static void showIndex(ArrayList<String> animals) {
        System.out.println("First element: " + animals.get(0));
        System.out.println("Second element: " + animals.get(1));
        System.out.println("Last element: " + animals.get(animals.size() - 1));
    }
    
    public static int findIndex(ArrayList<String> list, String target) {
        for (int i = 0; i < list.size(); i++) {

            if (list.get(i).equals(target)) {
                return i;
            }

        }


         return -1;
    }

    public static void modeifyAnimals(ArrayList<String> animals) {

        animals.set(0, "babirusa");
        animals.add("glass frog");
        animals.add(3, "aye-aye");
        animals.add(1, "camel");

        String removed = animals.remove(0);
        System.out.println("Removed animal:" + removed);

        System.out.println("Modified animal ArrayList" + animals);

    }

    // * ===== CHALLENGE 1: Searching and Modifying =====

//      * Write replaceAll(ArrayList<String> list, String oldVal, String newVal) that replaces
//      * EVERY match, not just the first.
//      * Example: ["cat", "dog", "cat"], replace "cat" with "fox"  ->  [fox, dog, fox]
//      * Tools:   for loop with index i, size(), get(i), set(i, obj), .equals()

    public static void replaceAll(ArrayList<String> animals, String oldVal, String newVal) {
        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i).equals(oldVal)) {
                animals.set(i, newVal);
            }
        }
    }

    public static void numberUtilities() {

        int[] values = {3, 7, 1, 9, 4, 2, 5, 8, 6, 0};

        ArrayList<Integer> nums = new ArrayList<Integer>();

        for (int v : values) {
            nums.add(v);  //autoboxing is where java converts int -> integer automatically
        }

        System.out.println("Original Numbers: " + nums);
        System.out.println("Length of List: " + nums.size());
        int min = nums.get(0);
        int max = nums.get(0);
        int sum = 0;

        for (int n : nums) {
            if (n < min) min = n;
            if (n > max) max = n;
            sum += n;
        }

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Sum: " + sum);

        System.out.println("Average: " + (double)sum / nums.size());

    }

    /* ===== CHECKPOINT 2: Traversal Algorithms =====
     * CHALLENGE:
     * Find the INDEX of the max, not just its value. (Why can't you use an enhanced for loop?)
     * Example: [3, 7, 1, 9, 4]  ->  3   (the 9 is at index 3)
     * Tools:   for loop with index i, size(), get(i), a variable to remember the best index
     * */

    public static void traversalAlgorithms() {

        int[] numbs = {3, 7, 1, 9, 4};

        for(int n : numbs) {
            
        }


    }

    public static void membershipCheck(ArrayList<String> animals) {

        boolean found = false;
        String target = "cat";

        for (int i = 0; i < animals.size(); i++) {
            
            if (animals.get(i).equals(target)) {
                found = true;

            }
        }
        if (found) {
            System.out.println("There's a " + target + " in your array!");
        }
        else {
            System.out.println("No " + target);
        }

    }

    public static void copyList() {

        ArrayList<Integer> original = new ArrayList<>();
        original.add(1);
        original.add(2);
        original.add(3);
        original.add(4);
        ArrayList<Integer> copied = new ArrayList<>();
        for (int i : original) {
            copied.add(i);
        }
        copied.add(5);
        System.out.println(copied);
        System.out.println(original);

    }

    public static void removeShortNames(ArrayList<String> animals) {
        for (int i = animals.size() - 1; i > 0; i--) {
            if (animals.get(i).length() <= 5) {
                animals.remove(i);
            }
        }
        System.out.println("Without short names: " + animals);
    }

    /* ===== CHECKPOINT 3: Removing While Traversing =====
     * CHALLENGE:
     * Write removeAll(ArrayList<String> animals, String target) that removes EVERY copy of target.
     * Use the same backward loop as removeShortNames, but match with .equals like findIndex.
     * Example: [cat, dog, cat, emu], remove "cat"  ->  [dog, emu]
     * Tools:   backward for loop, size(), get(i), remove(i), .equals()
     *
  */

    public static void removeAll(ArrayList<String> animals, String target) {
        for (int i = animals.size() - 1; i > 0; i--) {
            if (animals.get(i).equals(target)) {
                animals.remove(i);
            }
        }
        System.out.println(animals);
    }

      /* ===== CHECKPOINT 4: Putting It All Together =====
     * CHALLENGE:
     * Write longNames(ArrayList<String> animals) that RETURNS A NEW list of every name longer
     * than the average name length. Along the way, print the longest name and whether
     * "glass frog" is in the list. Use ONLY enhanced for loops.
     * (Why can't you just remove the short names inside an enhanced for loop?)
     * Example: [cat, pangolin, emu, glass frog]  ->  average 6.0, returns [pangolin, glass frog]
     *          prints  Longest: glass frog   Has glass frog: true
     * Tools:   enhanced for, accumulator, min/max tracking, boolean flag, .equals(),
     *          (double) cast, building a new list with add(obj)
     * Steps:   set up total = 0, longest = list.get(0), and hasFrog = false,
     *          loop once to add each length to total, update longest, and flag "glass frog",
     *          compute avg as a double AFTER the loop, make an empty result list,
     *          loop a second time and add each name longer than avg, print longest and hasFrog,
     *          return result
     * Hint:    you need TWO loops -- you can't compare to the average until you've seen every name
     *
*/
    public static ArrayList<String> longNames(ArrayList<String> animals) {
        int total = 0;
        String longest = animals.get(0);
        boolean hasFrog = false;
        for (String name : animals) {

            total += name.length(); 

            if (name.length() > longest.length()) {
                longest = name;
            }

            if (name.equals("glass frog")) {
                hasFrog = true;
            }
        }
        double avg = (double) total / animals.size();

        ArrayList<String> result = new ArrayList<>();

        for (String name : animals) {
            if (name.length() > avg) {
                result.add(name);
            }
        }

        System.out.println("longest: " + longest);
        System.out.println("Has glass frog? " + hasFrog);
        return result;


    }

}
