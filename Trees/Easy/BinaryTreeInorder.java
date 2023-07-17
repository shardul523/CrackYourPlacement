package Trees.Easy;

import java.util.ArrayList;
import java.util.List;

import Trees.TreeNode;

public class BinaryTreeInorder {
    void getInorder(TreeNode node, List<Integer> list) {
        if (node == null)
            return;
        getInorder(node.left, list);
        list.add(node.val);
        getInorder(node.right, list);
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> inorder = new ArrayList<>();
        getInorder(root, inorder);

        return inorder;
    }
}
