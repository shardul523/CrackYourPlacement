package Trees.Easy;

import Trees.TreeNode;

public class LeftChildSum {
    int getLeftSum(TreeNode node) {
        if (node == null)
            return 0;
        if (node.left == null && node.right == null)
            return Integer.MAX_VALUE;
        
        int sum = 0;

        int left = getLeftSum(node.left);
        // System.out.println("Left Sum at " + node.val + " " + left);
        int right = getLeftSum(node.right);
        // System.out.println("Right Sum at " + node.val + " " + right);

        if (left == Integer.MAX_VALUE)
            sum += node.left.val;
        else
            sum += left;

        if (right != Integer.MAX_VALUE)
            sum += right;

        return sum;
    }
    public int sumOfLeftLeaves(TreeNode root) {
        if (root.left == null && root.right == null)
            return 0;
        return getLeftSum(root);
    }
}
