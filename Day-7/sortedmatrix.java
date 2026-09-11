
public class sortedmatrix {
    // YE PROGRAM RIGHT TOP KA LIYA HA .
    //         {10, 20, 30, 40}, (40) Search yeha sa start ho ga.
    //         {15, 25, 35, 45},
    //         {27, 29, 37, 48},
    //         {32, 33, 39, 50}

    public static boolean sortedMatrix(int[][] matrix, int key) {
        int row = 0;
        int col = matrix.length - 1;
        int tm = 0;
        while (row < matrix.length && col >= 0) {
            if (key == matrix[row][col]) {
                System.out.println("Index is found" + "(" + row + "," + col + ")");
                System.out.println("Total moves:" + tm);
                return true;
            } else if (key < matrix[row][col]) {
                col--;
                tm++;

            } else {
                row++;
                tm++;
            }
        }

        return false;
    }
    // YE PROGRAM  LEFT BOTTOM KA  LIYA HA .
    //             {10, 20, 30, 40}, .
    //             {15, 25, 35, 45},
    //             {27, 29, 37, 48},
    // (32) Search {32, 33, 39, 50}

    public static boolean sortedMatrixs(int[][] matrix, int key) {
        int row = matrix.length - 1;
        int col = 0;
        int tm = 0;
        while (row >= 0 && col < matrix.length) {
            if (key == matrix[row][col]) {
                System.out.println("Index id found" + "(" + row + "," + col + ")");
                System.out.println("Total moves:" + tm);
              return true;
            } else if (key < matrix[row][col]) {
                row--;
                tm++;

            } else {
                col++;
                tm++;

            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50}
        };
        System.out.println(sortedMatrix(matrix, 50));
        // System.out.println(sortedMatrixs(matrix, 40));

    }
}
