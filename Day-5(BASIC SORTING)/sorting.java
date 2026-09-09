
public class sorting {
    //BUBBLE SORT.

    public static void bubbleSort(int[] nums) {

        for (int i = 0; i < nums.length - 1; i++) {

            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = temp;

                }
            }

        }

    }

    // SELECTION SORT.
    public static void selectionSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int midpos = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[midpos] > nums[j]) {
                    midpos = j;
                }
            }

            int temp = nums[midpos];
            nums[midpos] = nums[i];
            nums[i] = temp;

        }
    }

    public static void printArry(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

    }

    public static void insertionSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            int prev = i - 1;
            while (prev >= 0 && nums[prev] > curr) {
                nums[prev + 1] = nums[prev];
                prev--;
            }
            nums[prev + 1] = curr;
        }
    }

    public static void main(String args[]) {
        int[] arr = {5, 4, 1, 3, 2};
        printArry(arr);
        // bubbleSort(arr);
        // selectionSort(arr);
        insertionSort(arr);
        printArry(arr);

    }

}
