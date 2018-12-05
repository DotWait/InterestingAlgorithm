package solution;

public class SolveQueensByBits {

    private int count = 0;

    /**
     * N 皇后问题，返回解法的种数
     * 使用二进制位，时间空间复杂度达到最优
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
     * @param n
     */
    public void solveQueensByBits(int n) {
        dfs(n, 0, 0, 0, 0);
        System.out.println("解法总数：" + count);
    }

    public void dfs(int n, int row, int col, int pie, int na) {
        //递归终止条件,超过最后一行
        if (row >= n) {
            count++;
            return;
        }
        //获取该行所有可以放置queen的空位
        int bits = ~(col | pie | na) & (1 << n) - 1;
        while (bits > 0) {
            //获取最后一个空位
            int bit = bits & -bits;
            //进入下一行
            dfs(n, row + 1, col | bit, (pie | bit) << 1, (na | bit) >> 1);
            //去除最后一个空位
            bits &= bits - 1;
        }
    }
}
