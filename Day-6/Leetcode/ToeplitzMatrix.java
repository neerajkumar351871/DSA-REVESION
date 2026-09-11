public class ToeplitzMatrix
{ 
    public boolean isToeplitzMatrix(int[][] matrix) {
        int i=0;
        int j=0;
        while(i<matrix.length-1 && j<matrix[0].length-1)
        {
            if(matrix[i][j]!=matrix[i+1][j+1])
            {
                return false;
            }
            i++;
            j++;
        }
     return true;
    }
  public static void main(String[] args) {
    ToeplitzMatrix obj = new ToeplitzMatrix();
      int[][]matrix={
                     {1,2,3,4},
                     {5,1,2,3},
                     {9,5,1,2}
                     };
 System.out.print("Toeplitz Matrix : "+obj.isToeplitzMatrix(matrix));
  }
}