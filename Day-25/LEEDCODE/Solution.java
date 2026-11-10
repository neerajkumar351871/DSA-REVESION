class Solution {
    public static int uniquePaths(int m, int n) {
        long ans = 1;
        int total = m + n - 2;
        int choose = Math.min(m - 1, n - 1);

        for (int i = 1; i <= choose; i++) {
            ans = ans * (total - choose + i) / i;
        }

        return (int) ans;
    }
    public static void main(String args[])
    {
       System.out.println(uniquePaths(3,3));
    }
}