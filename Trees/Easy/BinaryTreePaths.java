package Trees.Easy;

import java.util.ArrayList;
import java.util.List;

import Trees.TreeNode;

public class BinaryTreePaths {
    List<String> leafPaths;

    void generatePaths(TreeNode node, String path) {
        if (node == null)
            return;

        if (node.left == null && node.right == null) {
            leafPaths.add(path + node.val);
            return;
        }

        generatePaths(node.left, path + node.val + "->");
        generatePaths(node.right, path + node.val + "->");
    }

    public List<String> binaryTreePaths(TreeNode root) {
        leafPaths = new ArrayList<String>();
        generatePaths(root, new String());
        return leafPaths;
    }
}
