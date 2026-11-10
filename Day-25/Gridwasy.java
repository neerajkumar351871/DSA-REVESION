
public class Gridwasy {

    public static int countWays(int i, int j, int n, int m) {    // BASE CASE
        if (i == n - 1 && j == m - 1) {
            return 1;
        } else if (i == n || j == m) {
            return 0;
        }
        // Recurisve call
        int right = countWays(i, j + 1, n, m);
        int left = countWays(i + 1, j, n, m);
        return (right + left);
    }

    public static void main(String args[]) {
        int n = 3, m = 3;
        System.out.println(countWays(0,0,n,m));
    }
}
// Wihtout using math.
// Time Complextity->  0(2^n+m);





// Math Based.
