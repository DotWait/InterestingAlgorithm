package solution;

import java.util.ArrayList;
import java.util.List;

public class Sudoku {
    /**
     * 有效的数组
     * Determine if a 9x9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:
     * <p>
     * Each row must contain the digits 1-9 without repetition.
     * Each column must contain the digits 1-9 without repetition.
     * Each of the 9 3x3 sub-boxes of the grid must contain the digits 1-9 without repetition.
     * <p>
     * <p>
     * A partially filled sudoku which is valid.
     * <p>
     * The Sudoku board could be partially filled, where empty cells are filled with the character '.'.
     * <p>
     * Example 1:
     * <p>
     * Input:
     * [
     * ["5","3",".",".","7",".",".",".","."],
     * ["6",".",".","1","9","5",".",".","."],
     * [".","9","8",".",".",".",".","6","."],
     * ["8",".",".",".","6",".",".",".","3"],
     * ["4",".",".","8",".","3",".",".","1"],
     * ["7",".",".",".","2",".",".",".","6"],
     * [".","6",".",".",".",".","2","8","."],
     * [".",".",".","4","1","9",".",".","5"],
     * [".",".",".",".","8",".",".","7","9"]
     * ]
     * Output: true
     * <p>
     * Example 2:
     * <p>
     * Input:
     * [
     * ["8","3",".",".","7",".",".",".","."],
     * ["6",".",".","1","9","5",".",".","."],
     * [".","9","8",".",".",".",".","6","."],
     * ["8",".",".",".","6",".",".",".","3"],
     * ["4",".",".","8",".","3",".",".","1"],
     * ["7",".",".",".","2",".",".",".","6"],
     * [".","6",".",".",".",".","2","8","."],
     * [".",".",".","4","1","9",".",".","5"],
     * [".",".",".",".","8",".",".","7","9"]
     * ]
     * Output: false
     * Explanation: Same as Example 1, except with the 5 in the top left corner being
     * modified to 8. Since there are two 8's in the top left 3x3 sub-box, it is invalid.
     * <p>
     * Note:
     * <p>
     * A Sudoku board (partially filled) could be valid but is not necessarily solvable.
     * Only the filled cells need to be validated according to the mentioned rules.
     * The given board contain only digits 1-9 and the character '.'.
     * The given board size is always 9x9.
     *
     * @param board
     * @return
     */
    public boolean isValidSudoku(char[][] board) {
        return dfs(board);
    }

    public boolean dfs(char[][] board) {
        for (int i = 0; i < board.length; i++)
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == '.') {
                    for (char c = '1'; c <= '9'; c++) {
                        if (isValid(board, i, j, c)) {
                            board[i][j] = c;
                            if (dfs(board)) return true;
                            else board[i][j] = '.';
                        }
                    }
                    return false;
                }
            }
        return true;
    }

    public boolean isValid(char[][] board, int row, int col, char c) {
        for (int i = 0; i < 9; i++) {
            if (board[row][i] != '.' && board[row][i] == c) return false;
            if (board[i][col] != '.' && board[i][col] == c) return false;
            if (board[row / 3 * 3 + i / 3][col / 3 * 3 + i % 3] != '.' && board[row / 3 * 3 + i / 3][col / 3 * 3 + i % 3] == c)
                return false;
        }
        return true;
    }

    /**
     * 数独解法
     * Write a program to solve a Sudoku puzzle by filling the empty cells.
     *
     * A sudoku solution must satisfy all of the following rules:
     *
     *     Each of the digits 1-9 must occur exactly once in each row.
     *     Each of the digits 1-9 must occur exactly once in each column.
     *     Each of the the digits 1-9 must occur exactly once in each of the 9 3x3 sub-boxes of the grid.
     *
     * Empty cells are indicated by the character '.'.
     *
     *
     * A sudoku puzzle...
     *
     *
     * ...and its solution numbers marked in red.
     *
     * Note:
     *
     *     The given board contain only digits 1-9 and the character '.'.
     *     You may assume that the given Sudoku puzzle will have a single unique solution.
     *     The given board size is always 9x9.
     * @param board
     */
//    private List<char[][]> results = new ArrayList<>();
    public void solveSudoku(char[][] board) {
        solve(board);
//        for (char[][] result : results)
//            printSudoku(result);
    }

    public boolean solve(char[][] board) {
  /*      if (isFull(board)){
            results.add(board);
            return true;
        }*/
        for (int i = 0; i < board.length; i++)
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == '.') {
                    for (char c = '1'; c <= '9'; c++) {
                        if (isValidSolve(board, i, j, c)) {
                            board[i][j] = c;
                            if (solve(board)) return true;
                            else board[i][j] = '.';
                        }
                    }
                    return false;
                }
            }
        printSudoku(board);
        return true;
    }

    public void printSudoku(char[][] board) {
        System.out.println("解法：");
        for (int i = 0; i < board[0].length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (j != board[0].length - 1)
                    System.out.print(board[i][j] + ",");
                else
                    System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }

    public boolean isValidSolve(char[][] board, int row, int col, char c) {
        for (int i = 0; i < 9; i++) {
            if (board[row][i] != '.' && board[row][i] == c) return false;
            if (board[i][col] != '.' && board[i][col] == c) return false;
            if (board[row / 3 * 3 + i / 3][col / 3 * 3 + i % 3] != '.' && board[row / 3 * 3 + i / 3][col / 3 * 3 + i % 3] == c)
                return false;
        }
        return true;
    }

    public boolean isFull(char[][] board){
        for (int i=0;i<board[0].length;i++)
            for (int j=0;j<board[0].length;j++){
                if (board[i][j] == '.') return false;
            }
            return true;
    }
}
