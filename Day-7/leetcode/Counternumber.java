
public class Counternumber {

    public static int counternumbers(int[][] matrix, int key) {
        int counter = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    counter++;
                }
            }
        }
        return counter;
    }

    public static int countrowsum(int[][] matrix) {
        int i = 1;
        int j = 0;
        int sum =0;
        while (j < matrix.length) {
            sum += matrix[i][j];
            j++;
        }
        return sum;

    }

    public static void main(String[] args) {
        // int[][] matrix = {{4, 7, 8},
        //                  {8, 8, 7},};
        // System.out.println("Total number is : " + counternumbers(matrix, 7));
        int [][] matrix={{1,4,9},{11,4,3},{2,2,3}};
        System.out.println("SECOND ROW SUM : "+countrowsum(matrix));
    }
}
