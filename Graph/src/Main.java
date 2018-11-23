import binarytree.MaxDepth;
import binarytree.MinDepth;
import entity.Node;
import entity.TreeNode;
import search.BFS;
import search.DFS;
import solution.SolveQueens;
import solution.SolveQueensII;
import solution.Sudoku;
import utils.Init;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        //Test: BFS
/*        Node initNode = Init.initNode();
        Queue<Node> queue = new ArrayDeque<>();
        Set<Node> visited = new HashSet<>();
        BFS bfs = new BFS(queue,visited);
        bfs.bfs(initNode);*/

        //Test: DFS
/*        Node initNode = Init.initNode();
        Set<Node> visited = new HashSet<>();
        DFS dfs = new DFS(visited);
        dfs.dfs(initNode);*/

        //Test: MaxDepth
/*        TreeNode root = Init.initTreeNode();
        int maxDepth = MaxDepth.maxDepth(root);
        System.out.println("maxDepth = "+maxDepth);*/

/*        //Test: MinDepth
        TreeNode root = Init.initTreeNode();
        int minDepth = MinDepth.minDepth(root);
        System.out.println("minDepth = "+minDepth);*/

/*        //Test: SolveQueens
        SolveQueens solveQueens = new SolveQueens();
        solveQueens.solveQueens(4);
        solveQueens.show();*/

/*        //Test: SolveQueensII
        SolveQueensII solveQueensII = new SolveQueensII();
        int num = solveQueensII.solveQueens(8);
        System.out.println(num);*/

/*        //Test: isValidSudoku
        Sudoku sudoku = new Sudoku();
        char[][] board = Init.initSudoku3();
        boolean isValid = sudoku.dfs(board);
        System.out.println("isValid:"+isValid);*/

        //Test: isValidSudoku
        Sudoku sudoku = new Sudoku();
        char[][] board = Init.initSudoku();
        sudoku.solveSudoku(board);
    }
}
