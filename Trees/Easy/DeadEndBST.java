package Trees.Easy;

import java.util.HashSet;

import Trees.TreeNode;


class DeadEndBST {
    static void solve(HashSet<Integer> n, HashSet<Integer> l, TreeNode node) {
        if (node == null)
            return;
        if (node.left == null && node.right == null) {
            l.add(node.val);
            
        }
        
        n.add(node.val);
        solve(n, l, node.left);
        solve(n, l, node.right);
    }
    
    public static boolean isDeadEnd(TreeNode root)
    {
        HashSet<Integer> nodes = new HashSet<>();
        HashSet<Integer> leaves = new HashSet<>();
        
        solve(nodes, leaves, root);
        
        nodes.add(0);
        
        for (int leaf: leaves) {
            if (nodes.contains(leaf + 1) && nodes.contains(leaf - 1))
                return true;
        }
        
        return false;
        
    }
}