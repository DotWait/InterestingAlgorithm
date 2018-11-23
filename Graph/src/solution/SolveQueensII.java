package solution;

import java.util.HashSet;
import java.util.Set;

/**
 * N 皇后问题，返回解法的种数
 * The n-queens puzzle is the problem of placing n queens on an n×n chessboard such that no two queens attack each other.
 *
 * Given an integer n, return the number of distinct solutions to the n-queens puzzle.
 *
 * Example:
 *
 * Input: 4
 * Output: 2
 * Explanation: There are two distinct solutions to the 4-queens puzzle as shown below.
 * [
 *  [".Q..",  // Solution 1
 *   "...Q",
 *   "Q...",
 *   "..Q."],
 *
 *  ["..Q.",  // Solution 2
 *   "Q...",
 *   "...Q",
 *   ".Q.."]
 * ]
 */
public class SolveQueensII {
    private Set<Integer> col = new HashSet<>();
    private Set<Integer> left = new HashSet<>();
    private Set<Integer> right = new HashSet<>();
    private int num = 0;

    public int solveQueens(int n) {
        dfs(n, 0);
        return num;
    }

    public void dfs(int n, int row) {
        if (row >= n) {
            num++;
            return;
        }
        for (int col = 0; col < n; col++) {
            if (this.col.contains(col) || this.left.contains(row + col) || this.right.contains(row - col)) continue;
            this.col.add(col);
            this.left.add(row + col);
            this.right.add(row - col);
            dfs(n, row + 1);
            this.col.remove(col);
            this.left.remove(row + col);
            this.right.remove(row - col);
        }
    }

}
