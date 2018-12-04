import solution.ChessBoardRoutes;

public class Main {

    public static void main(String[] args) {
        ChessBoardRoutes chessBoardRoutes = new ChessBoardRoutes();
        int[][] board = chessBoardRoutes.initBoard(8, 8);
        int boardRoutes = chessBoardRoutes.chessBoardRoutes(board, 8, 8);
        System.out.println("boardRoutes = " + boardRoutes);
    }
}
