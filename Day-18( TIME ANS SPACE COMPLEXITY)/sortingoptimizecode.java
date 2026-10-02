
class sortingoptimizecode {

    public static void modifidBinarySearch(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean value = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    value = true;
                }
            }
            if (value == false) {
                break;
            }
            System.out.println(value);
        }

    }

    public static void printarray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        modifidBinarySearch(arr);
        printarray(arr);
    }
}
