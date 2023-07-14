package Trees.Easy;

import Trees.TreeNode;

public class DiameterOfTree {
    int diameter;

    int edgesCount(TreeNode node) {
        if (node == null)
            return 0;
        
        int leftCount = edgesCount(node.left);
        int rightCount = edgesCount(node.right);
        
        diameter = Math.max(diameter, leftCount + rightCount);

        return 1 + Math.max(leftCount, rightCount);
    }

    public int diameterOfBinaryTree(TreeNode root) {
        diameter = 0;
        diameter = Math.max(edgesCount(root.left) + edgesCount(root.right), diameter);

        return diameter;
    }
}
