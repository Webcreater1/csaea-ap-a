import java.util.Arrays;

public class NativeArrays {

        public static void main(String[] args) {

            int[] scores = new int[5];

            System.out.println("Default values: " + Arrays.toString(scores));

            int[] nums = {3, 7, 1, 9, 4};

            System.out.println("Initializer list: " + Arrays.toString(nums));

            String[] names = new String[3];
            boolean[] flags = new boolean[3];
            double[] prices = new double[3];

            System.out.println("String defaults:  " + Arrays.toString(names));
            System.out.println("boolean defaults: " + Arrays.toString(flags));
            System.out.println("double defaults:  " + Arrays.toString(prices));

            System.out.println("\nFirst element nums[0]: " + nums[0]);
            System.out.println("Length (a field, no parentheses): " + nums.length);
            System.out.println("Last element nums[nums.length - 1]: " + nums[nums.length - 1]);

            nums[2] = 6;

        for (int i = 0; i < nums.length; i++) {

                System.out.println(" index " + i + " -> value " + nums[i]);

        }

        int[] scorings = {85, 62, 97, 45, 70, 99};
        for (int i = 0; i < scorings.length; i++) {
                scorings[i] = Math.min(scorings[i] + 5, 100);
                
        }

        System.out.println(Arrays.toString(scorings));


        int[] temps = {58, 71, 64, 80, 77, 69};
        int highest = temps[0];
        int highestIndex = 0;
        for (int i = 1; i < temps.length; i++) {
                highest = Math.max(highest, temps[i]);// deals with the index
                if (highest == temps[i]) {
                        highestIndex = i;
                }
        }





        }
}