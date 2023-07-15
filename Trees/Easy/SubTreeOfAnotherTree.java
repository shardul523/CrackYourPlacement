package Trees.Easy;

import Trees.TreeNode;

public class SubTreeOfAnotherTree {
    boolean areEqual(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null)
            return true;
        if (node1 == null || node2 == null)
            return false;

        return node1.val == node2.val && areEqual(node1.left, node2.left) && areEqual(node1.right, node2.right);
    }

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null)
            return false;
        if (areEqual(root, subRoot))
            return true;
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }
}
