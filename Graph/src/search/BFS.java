package search;

import entity.Node;

import java.util.Queue;
import java.util.Set;

public class BFS {
    private Queue<Node> queue;
    private Set<Node> visited;

    public BFS(Queue<Node> queue,Set<Node> visited){
        this.queue = queue;
        this.visited = visited;
    }

    /**
     * 广度优先搜索 BFS
     * 使用Set集合，防止重复访问同一个节点
     * 使用Queue队列，将一个节点下的下一级的子节点顺序存入队列
     * 再从队列逐个取出
     * @param node
     */
    public void bfs(Node node){
        queue.offer(node);
        visited.add(node);
        while (!queue.isEmpty()){
            node = queue.poll();
            visited.add(node);
            process(node);
            if (node.getNodes() == null)
                continue;
            for (Node n : node.getNodes()){
                if (!visited.contains(n)){
                    visited.add(n);
                    queue.offer(n);
                }
            }
        }
    }

    public void process(Node node){
        System.out.println("value = "+node.getValue());
    }
}
