package Trees.Easy;

import Trees.TreeNode;

public class SymmetricTree {
    boolean checkMirror(TreeNode leftSub, TreeNode rightSub) {
        if (leftSub == null && rightSub == null)
            return true;
        if (leftSub == null || rightSub == null)
            return false;
        if (leftSub.val != rightSub.val)
            return false;

        return checkMirror(leftSub.left, rightSub.right) && checkMirror(leftSub.right, rightSub.left);
    }

    public boolean isSymmetric(TreeNode root) {
        return checkMirror(root.left, root.right);
    }
}
