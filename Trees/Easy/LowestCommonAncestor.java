package Trees.Easy;

// import java.util.ArrayDeque;
// import java.util.Deque;

import Trees.TreeNode;

public class LowestCommonAncestor {

    // Naive Solution 
    
    // void getAncestors(TreeNode node, TreeNode target, Deque<TreeNode> ancestors) {

    //     ancestors.addLast(node);

    //     if (node == target) 
    //         return;
        
    //     if (node.val < target.val)
    //         getAncestors(node.right, target, ancestors);
    //     else
    //         getAncestors(node.left, target, ancestors);
    // }

    // public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    //     Deque<TreeNode> pAncestors = new ArrayDeque<>();
    //     Deque<TreeNode> qAncestors = new ArrayDeque<>();

    //     getAncestors(root, p, pAncestors);
    //     getAncestors(root, q, qAncestors);

    //     while (pAncestors.size() > qAncestors.size())
    //         pAncestors.removeLast();
        
    //     while (pAncestors.size() < qAncestors.size())
    //         qAncestors.removeLast();

    //     while (pAncestors.getLast() != qAncestors.getLast()) {
    //         pAncestors.removeLast();
    //         qAncestors.removeLast();
    //     }

    //     return pAncestors.getLast();
    // }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root.val < p.val && root.val < q.val)
            return lowestCommonAncestor(root.right, p, q);
        if (root.val > p.val && root.val > q.val)
            return lowestCommonAncestor(root.left, p, q);
        return root;
    }
}
