
public class nQueeenscomplete {
    public static boolean ischeck(char[][]board, int row , int col)
    {  // Vertical check
        for(int i=row-1; i>=0;i--)
            {
                if(board[i][col]=='Q')
                {
                    return false;
                }
            }

        // Diag left up
        for(int i=row-1, j=col-1;i>=0 && j>=0;i--,j--)
            {
                if(board[i][j]=='Q')
                {
                    return false;
                }
            }
        // Diag  right up.
        for(int i=row-1, j=col+1;i>=0 &&  j<board.length;i--,j++)
            {
            
                if(board[i][j]=='Q')
                {
                    return false;
                }
            }
        

      return true;
    }
   
    public static void nQueens(char board[][], int row) {
        // base case.
        if (row == board.length) {
            // printboard(board);
            counter++;
            return;
        }
        //Column loop
        for (int j = 0; j < board.length; j++) {
            
           if(ischeck(board, row,j))
           {
            board[row][j] = 'Q';
            nQueens(board, row + 1);// Recurive call
            board[row][j] = 'X';//  backtracking.
           }

        }
    }

    public static void printboard(char board[][]) {
        System.out.println("----------CHESS BOARD----------");
        int n = board.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

    }
    
static int counter=0;
    public static void main(String args[]) {
        int n = 4;
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'X';
            }
        }
        nQueens(board, 0);
        System.out.println("Total ways: "+counter);

    }

}
