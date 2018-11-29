import trie.Trie;

import java.util.Random;

public class Main {
    /**
     * 初始化一个二叉搜索树
     * @return
     */
    public static TreeNode initBST(){
        TreeNode treeNode = new TreeNode(6);
        TreeNode treeNode1 = new TreeNode(2);
        TreeNode treeNode2 = new TreeNode(8);
        TreeNode treeNode3 = new TreeNode(0);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(7);
        TreeNode treeNode6 = new TreeNode(9);
        TreeNode treeNode7 = new TreeNode(3);
        TreeNode treeNode8 = new TreeNode(5);
        treeNode.left = treeNode1;
        treeNode.right = treeNode2;
        treeNode1.left = treeNode3;
        treeNode1.right = treeNode4;
        treeNode2.left = treeNode5;
        treeNode2.right = treeNode6;
        treeNode4.left = treeNode7;
        treeNode4.right = treeNode8;
        return treeNode;
    }

    /**
     * 初始化一个二叉树
     * @return
     */
    public static TreeNode initBT(){
        TreeNode treeNode = new TreeNode(3);
        TreeNode treeNode1 = new TreeNode(5);
        TreeNode treeNode2 = new TreeNode(1);
        TreeNode treeNode3 = new TreeNode(6);
        TreeNode treeNode4 = new TreeNode(2);
        TreeNode treeNode5 = new TreeNode(0);
        TreeNode treeNode6 = new TreeNode(8);
        TreeNode treeNode7 = new TreeNode(7);
        TreeNode treeNode8 = new TreeNode(4);
        treeNode.left = treeNode1;
        treeNode.right = treeNode2;
        treeNode1.left = treeNode3;
        treeNode1.right = treeNode4;
        treeNode2.left = treeNode5;
        treeNode2.right = treeNode6;
        treeNode4.left = treeNode7;
        treeNode4.right = treeNode8;
        return treeNode;
    }

    public static void main(String[] args) {
/*        //Test: isValidBST
        boolean isValid = IsValidBST.isValidBST(initBST());
        System.out.println("isValid : "+ isValid);*/

/*        //Test: findLowestCommonAncestorBST
        TreeNode root = initBST();
        TreeNode lowestCommonAncestor = LowestCommonAncestor.findLowestCommonAncestorBST(root, root.left, root.right);
        System.out.println("lowestCommonAncestor : "+lowestCommonAncestor.val);*/

/*        //Test: findLowestCommonAncestorBT
        TreeNode root = initBT();
        TreeNode lowestCommonAncestorBT = LowestCommonAncestor.findLowestCommonAncestorBT(root, root.left, root.left.right);
        System.out.println("lowestCommonAncestorBT : "+ lowestCommonAncestorBT.val);*/

        //Test: Trie
        Trie trie = new Trie();
        trie.insert("apple");
        boolean search = trie.search("apple");
        System.out.println("search apple : " +search);
        boolean startsWith = trie.startsWith("apple");
        System.out.println("startWith apple : "+startsWith);
        boolean search1 = trie.search("app");
        System.out.println("search app : "+search1);
        boolean startsWith1 = trie.startsWith("app");
        System.out.println("startWith app : "+startsWith1);

    }
}
