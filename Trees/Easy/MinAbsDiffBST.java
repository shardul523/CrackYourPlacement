package Trees.Easy;

import java.util.ArrayList;
import Trees.TreeNode;

public class MinAbsDiffBST {
    void getInorder(TreeNode node, ArrayList<Integer> in) {
        if (node == null)
            return;

        if (node.left == null && node.right == null) {
            in.add(node.val);
            return;
        }

        getInorder(node.left, in);
        in.add(node.val);
        getInorder(node.right, in);
    }

    public int getMinimumDifference(TreeNode root) {
        ArrayList<Integer> inorder = new ArrayList<>();
        getInorder(root, inorder);
        int numNodes = inorder.size();
        int absMinDiff = Integer.MAX_VALUE;

        // for (int i = 0; i < numNodes; i++)
        //     System.out.print(inorder.get(i) + " ");

        // System.out.println();

        for (int i = 0; i < numNodes - 1; i++) {
            int currDiff = Math.abs(inorder.get(i) - inorder.get(i + 1));
            absMinDiff = Math.min(absMinDiff, currDiff);
        }

        return absMinDiff;  
    }
}
