package solution;

import java.util.HashSet;
import java.util.Set;

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
