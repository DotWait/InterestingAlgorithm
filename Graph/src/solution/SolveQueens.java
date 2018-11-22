package solution;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * N皇后问题
 * The n-queens puzzle is the problem of placing n queens on an n×n chessboard such that no two queens attack each other.
 *
 * Given an integer n, return all distinct solutions to the n-queens puzzle.
 *
 * Each solution contains a distinct board configuration of the n-queens' placement, where 'Q' and '.' both indicate a queen and an empty space respectively.
 *
 * Example:
 *
 * Input: 4
 * Output: [
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
 * Explanation: There exist two distinct solutions to the 4-queens puzzle as shown above.
 */
public class SolveQueens {
    private Set<Integer> col = new HashSet<>();
    private Set<Integer> left = new HashSet<>();
    private Set<Integer> right = new HashSet<>();
    private List<List<String>> result = new ArrayList<>();
    private List<String> res = new ArrayList<>();

    public List<List<String>> solveQueens(int n) {
        dfs(n, 0, "");
        return result;
    }

    public void dfs(int n, int row, String state) {
        if (row >= n) {
            String[] strings = state.split(",");
            for (int i=0;i<strings.length;i++){
                StringBuilder sb = new StringBuilder();
                int col = Integer.valueOf(strings[i]);
                for (int j = 0; j < col; j++)
                    sb.append(".");
                sb.append("Q");
                for (int j = col + 1; j < n; j++)
                    sb.append(".");
                res.add(sb.toString());
            }
            result.add(new ArrayList<>(res));
            res.clear();
            return;
        }
        for (int col = 0; col < n; col++) {
            if (this.col.contains(col) || this.left.contains(row + col) || this.right.contains(row - col)) continue;
            this.col.add(col);
            this.left.add(row + col);
            this.right.add(row - col);
            dfs(n, row + 1, state+col+",");
            this.col.remove(col);
            this.left.remove(row + col);
            this.right.remove(row - col);
        }
    }

    public void show() {
        int i = 1;
        for (List<String> res : result) {
            System.out.println("第" + (i++) + "种解法：");
            for (String state : res)
                System.out.println(state);
        }
    }
}

