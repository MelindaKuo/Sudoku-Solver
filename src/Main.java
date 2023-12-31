import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        int[][] board = {{0,0,0,0,0,0,1,0,0},
                         {0,7,0,6,0,1,0,9,0},
                         {1,0,0,0,8,9,0,6,5},
                         {0,0,0,8,2,0,9,0,7},
                         {0,5,0,9,0,6,0,2,0},
                         {9,0,7,0,3,4,0,0,0},
                         {3,8,0,7,6,0,0,0,4},
                         {0,6,0,5,0,8,0,7,0},
                         {0,0,5,0,0,0,0,0,0}};
        System.out.println("Sudoku Puzzle");
        System.out.println(Arrays.deepToString(board).replace("], ", "]\n"));
        Solver.solve(board);
        System.out.println("Sudoku Solved");
        System.out.println(Arrays.deepToString(board).replace("], ", "]\n"));
    }
}
