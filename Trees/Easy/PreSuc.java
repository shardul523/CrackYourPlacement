package Trees.Easy;

import Trees.TreeNode;

public class PreSuc {
    static TreeNode pre;
    static TreeNode suc;

    public static void findPreSuc(TreeNode root, int key) {
    
        if (root == null)
            return;
        if (root.val < key) {
            pre = root;
            findPreSuc(root.right, key);
        } else if (root.val > key) {
            suc = root;
            findPreSuc(root.left, key);
        } else {
            findPreSuc(root.left, key);
            findPreSuc(root.right, key);
        }
    
    }
}
