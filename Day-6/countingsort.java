
class countingsort {

    public static void countingSort(int arr[]) {
        // ye frequence ki length count kar na ka liya h
        int largestElement = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largestElement = Math.max(largestElement, arr[i]);
        }
        int count[] = new int[largestElement +1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        // sort.
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }

    }

    public static void printarr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        int[] arr = {1, 4, 1, 3, 2, 3, 7};
        countingSort(arr);
        printarr(arr);

    }
}
