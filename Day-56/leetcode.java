
import java.util.Arrays;

public class leetcode {

    // 2011. Final Value of Variable After Performing Operations
    public static int finalValueAfterOperations(String[] operations) {

        int val = 0;

        for (int i = 0; i < operations.length; i++) {

            String ch = operations[i];

            if (ch.equals("--X") || ch.equals("X--")) {
                val--;
            } else {
                val++;
            }
        }

        return val;
    }

    // 217. Contains Duplicate
    public static boolean containsDuplicate(int[] nums) {

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++) {

            if ((nums[i] ^ nums[i + 1]) == 0) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        // Problem 2011
        String[] operations = {"--X", "X++", "X++"};

        int result1 = finalValueAfterOperations(operations);

        System.out.println("Final Value: " + result1);


        // Problem 217
        int[] nums = {1, 2, 3, 1};

        boolean result2 = containsDuplicate(nums);

        System.out.println("Contains Duplicate: " + result2);
    }
}
