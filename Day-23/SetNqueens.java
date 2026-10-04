public class SetNqueens
    {
      public static void nQueens(char board[][], int row)
        {  
            if(row==board.length)
       {   
         printboard(board);
            return;
        }
            //Column loop
            for(int j=0;j<board.length;j++)
                {
                    board[row][j]='Q';
                    nQueens(board,row+1);// Recurive call
                    board[row][j]='X';//  backtracking.
                }
        }
        public static void printboard(char board[][])
        {   System.out.println("----------CHESS BOARD----------");
             int n=board.length;
            for(int i=0;i<n;i++)
                {
                    for(int j=0;j<n;j++)
                        {
                            System.out.print(board[i][j]+" ");
                        }
                      System.out.println();
                }
          
        }
      
        public static void main(String args[])
        {
          int n=2;
          char[][] board= new char[n][n];
            for(int i=0;i<n;i++)
                {
                    for(int j=0;j<n;j++)
                        {
                            board[i][j]= 'X';
                        }
                }
            nQueens(board,0);
            
        }
        
    }