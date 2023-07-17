package Trees.Easy;

import Trees.TreeNode;

class BalancedTree {
    boolean imbalance;

    int compareHeight(TreeNode node) {
        if (node == null)
            return 0;
        int left = compareHeight(node.left);
        int right = compareHeight(node.right);

        if (Math.abs(left - right) > 1)
            imbalance = true;

        return 1 + Math.max(left, right);
    }

    public boolean isBalanced(TreeNode root) {
        imbalance = false;
        compareHeight(root);
        return !imbalance;
    }
}