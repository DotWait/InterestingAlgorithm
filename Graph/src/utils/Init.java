package utils;

import entity.Node;
import entity.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Init {
    public static Node initNode(){
        Node node = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);
        Node node8 = new Node(8);
        Node node9 = new Node(9);
        List<Node> list1 = new ArrayList<>();
        list1.add(node2);
        list1.add(node3);
        list1.add(node4);
        List<Node> list2 = new ArrayList<>();
        list2.add(node5);
        list2.add(node6);
        List<Node> list3 = new ArrayList<>();
        list3.add(node7);
        list3.add(node8);
        List<Node> list4 = new ArrayList<>();
        list4.add(node9);
        node.setNodes(list1);
        node2.setNodes(list2);
        node3.setNodes(list3);
        node4.setNodes(list4);
        return node;
    }

    /**
     * init treenode
     *     3
     *    / \
     *   9  20
     *     /  \
     *    15   7
     * @return
     */
    public static TreeNode initTreeNode(){
        TreeNode treeNode = new TreeNode(3);
        TreeNode treeNode1 = new TreeNode(9);
        TreeNode treeNode2 = new TreeNode(20);
        TreeNode treeNode3 = new TreeNode(15);
        TreeNode treeNode4 = new TreeNode(7);
        treeNode.left = treeNode1;
        treeNode.right = treeNode2;
        treeNode2.left = treeNode3;
        treeNode2.right = treeNode4;
        return treeNode;
    }
}
