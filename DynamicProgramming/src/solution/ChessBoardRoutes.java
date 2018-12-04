package solution;

import java.util.Random;

public class ChessBoardRoutes {

    public int[][] initBoard(int row, int col) {
/*        //随机生成棋盘
        Random random = new Random();
        int[][] board = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                board[i][j] = random.nextInt(10) <= 2 ? -1 : 0;
            }
        }
        return board;*/

        //生成指定棋盘
        int[][] board = new int[8][8];
        board[1][2] = board[1][6] = -1;
        board[2][4] = -1;
        board[3][0] = board[3][2] = board[3][5] = -1;
        board[4][2] = -1;
        board[5][3] = board[5][4] = board[5][6] = -1;
        board[6][1] = board[6][5] = -1;
        return board;
    }

    /**
     * 动态规划
     * 在一个二位棋盘上：
     * 小人从左上角走到右下角，每次只能往右或往下走一步，遇到石头不能走，计算一共有多少种路线
     * @param board
     * @param row
     * @param col
     * @return
     */
    public int chessBoardRoutes(int[][] board, int row, int col) {
        //用来记忆二维棋盘上的各个位置到终点的路线数
        int[][] opt = new int[row][col];
        for (int i = row - 1; i >= 0; i--) {
            for (int j = col - 1; j >= 0; j--) {
                if (i == row - 1 || j == col - 1) {
                    //在最底下一行或者在最右边一列，此时只有一种路线
                    opt[i][j] = 1;
                } else if (board[i][j] == 0) {
                    //此处为空地
                    opt[i][j] = opt[i + 1][j] + opt[i][j + 1];
                } else {
                    //此处为石头
                    opt[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(opt[i][j] + "\t");
            }
            System.out.println();
        }
        return opt[0][0];
    }
}
