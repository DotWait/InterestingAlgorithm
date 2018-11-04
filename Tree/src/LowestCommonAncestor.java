import java.time.temporal.Temporal;

public class LowestCommonAncestor {
    /**
     * 给定一个二叉搜索树, 找到该树中两个指定节点的最近公共祖先。
     * Given a binary search tree (BST), find the lowest common ancestor (LCA) of two given nodes in the BST.
     *
     * According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes p and q as the lowest node in T that has both p and q as descendants (where we allow a node to be a descendant of itself).”
     *
     * Given binary search tree:  root = [6,2,8,0,4,7,9,null,null,3,5]
     *
     *         _______6______
     *        /              \
     *     ___2__          ___8__
     *    /      \        /      \
     *    0      _4       7       9
     *          /  \
     *          3   5
     *
     * Example 1:
     *
     * Input: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 8
     * Output: 6
     * Explanation: The LCA of nodes 2 and 8 is 6.
     *
     * Example 2:
     *
     * Input: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 4
     * Output: 2
     * Explanation: The LCA of nodes 2 and 4 is 2, since a node can be a descendant of itself
     *              according to the LCA definition.
     * @param root
     * @param p
     * @param q
     * @return
     */
    public static TreeNode findLowestCommonAncestorBST(TreeNode root , TreeNode p,TreeNode q){
        /*if(root == null || root == p || root == q) return root;
        if(p.val < root.val && q.val < root.val) return findLowestCommonAncestorBST(root.left,p,q);
        if(p.val > root.val && q.val > root.val) return findLowestCommonAncestorBST(root.right,p,q);
        return root;*/
        while (root != null){
            if(root.val > p.val && root.val > q.val) root = root.left;
            else if (root.val < p.val && root.val < q.val) root = root.right;
            else return root;
        }
        return root;
    }

    /**
     * 给定一个二叉树, 找到该树中两个指定节点的最近公共祖先。
     * Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree.
     *
     * According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes p and q as the lowest node in T that has both p and q as descendants (where we allow a node to be a descendant of itself).”
     *
     * Given the following binary tree:  root = [3,5,1,6,2,0,8,null,null,7,4]
     *
     *         _______3______
     *        /              \
     *     ___5__          ___1__
     *    /      \        /      \
     *    6      _2       0       8
     *          /  \
     *          7   4
     *
     * Example 1:
     *
     * Input: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 1
     * Output: 3
     * Explanation: The LCA of of nodes 5 and 1 is 3.
     *
     * Example 2:
     *
     * Input: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 4
     * Output: 5
     * Explanation: The LCA of nodes 5 and 4 is 5, since a node can be a descendant of itself
     *              according to the LCA definition.
     * @param root
     * @param p
     * @param q
     * @return
     */
    public static TreeNode findLowestCommonAncestorBT(TreeNode root, TreeNode p,TreeNode q){
        if(root == null || root == p || root == q) return root;
        TreeNode left = findLowestCommonAncestorBT(root.left,p,q);
        TreeNode right = findLowestCommonAncestorBT(root.right,p,q);
        return left == null ? right : right == null ? left : root;
    }
}
