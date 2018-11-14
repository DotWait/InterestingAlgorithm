import binarytree.MaxDepth;
import binarytree.MinDepth;
import entity.Node;
import entity.TreeNode;
import search.BFS;
import search.DFS;
import utils.Init;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;

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

        //Test: MinDepth
        TreeNode root = Init.initTreeNode();
        int minDepth = MinDepth.minDepth(root);
        System.out.println("minDepth = "+minDepth);
    }
}
