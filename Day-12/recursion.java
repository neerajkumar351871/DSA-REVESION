
public class recursion {

    public static void desc(int n) {   // Base case.
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        // Recursive call.
        System.out.print(n + " ");
        // Function call.
        desc(n - 1);

    }

    public static void increase(int n) {
        // Base case.
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        // Recursive call.
        increase(n - 1);
        // kaam
        System.out.print(n + " ");

    }

    public static int factorial(int n) {
        // Base case.
        if (n == 1) {
            return 1;
        }
        // Negative number ka liya.
        if (0 > n) {
            return -1;
        }
        int fact = factorial(n - 1);
        return fact * n;
    }

    public static int sumOfNatural(int n) {
        // Base case.
        if (n == 1) {
            return 1;
        }
        // Negative number ka liya.
        if (0 > n) {
            return -1;
        }
        int sum = sumOfNatural(n - 1);
        System.out.println(sum + "*" + n);
        return (sum * n);
    }

    public static int fibn(int n) {
        if (n == 0 | n == 1) {
            return n;
        }
        int sum = 0;
        sum = fibn(n - 1) + fibn(n - 2);
        return sum;
    }

    public static boolean sortedarray(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return sortedarray(arr, i + 1);
    }

    public static void main(String args[]) {
        int n = 10;
        desc(n);
        System.out.println();
        increase(n);
        System.out.println();
        // Factorail call.
        System.out.println("Factorail of numbers " + factorial(5));
        // Sum of natural numbers.
        System.out.println("Sum of natural numbers:" + sumOfNatural(5));
        System.out.println();
        System.out.println("Fibonacci Number:" + fibn(5));
        int arr[] = {1, 2, 3, 4, 5};
        System.out.println("SORTED ARRAY:" + sortedarray(arr, 0));
    }
}
