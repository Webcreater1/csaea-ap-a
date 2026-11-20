import java.util.ArrayList;

public class ArrayLists {

    public static ArrayList<String> createList() {
        ArrayList<String> animals = new ArrayList<String>();
        animals.add("Donkey");
        animals.add("Penguin");
        animals.add("Blobfish");
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
        animals.add(1, "mighty camel");

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

}
