package Trees;

public class TreeNode {
    private int val;
    public TreeNode left;
    public TreeNode right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }

    TreeNode(int val, TreeNode l, TreeNode r) {
        this.val = val;
        this.left = l;
        this.right = r;
    }
}
