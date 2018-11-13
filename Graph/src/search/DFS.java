package search;

import entity.Node;

import java.util.Set;

public class DFS {
    private Set<Node> visited;

    public DFS(Set<Node> visited) {
        this.visited = visited;
    }

    /**
     * 深度优先搜索 DFS
     * 使用Set集合，防止重复访问同一个节点
     * 使用递归的方式
     * @param node
     */
    public void dfs(Node node) {
        visited.add(node);
        porcess(node);
        if(node.getNodes() == null)
            return;
        for (Node n : node.getNodes()) {
            if (!visited.contains(n))
                dfs(n);
        }
    }

    public void porcess(Node node) {
        System.out.println("value = " + node.getValue());
    }
}

