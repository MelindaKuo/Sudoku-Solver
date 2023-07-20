public class Solver {
    


    public static boolean validator(int[][] board, int row, int col, int spot) {
        int boxrow = row-row%3;
        int boxcol = col-col%3;
        for(int i = 0; i<9; i++){
            if(board[i][col] == spot)
                return false;
            if(board[row][i] == spot)
                return false;  
        }

        for(int i=boxrow; i<boxrow +3; i++){
            for(int j=boxcol; j<boxcol+3; j++){
                if(board[i][j] == spot)
                    return false;
            }
        }
        return true;
    }

    public  static boolean solve(int[][] board){
        for(int i =0; i<board.length; i++){
            for(int j = 0; j<board[i].length; j++){
                if(board[i][j]== 0){
                    for(int k =1; k<=9; k++){
                        if(validator(board, i, j, k)){
                            board[i][j] = k;    
                            if(solve(board))
                                return true;
                            else{
                                board[i][j] = 0;
                            }


                            
                        }
                        }

                        return false;
                }
            }
        }
        return true;
    }
}
