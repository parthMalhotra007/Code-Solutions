public class LowestCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || p == root || q ==root)
            return root;

        TreeNode left  = lowestCommonAncestor(root.left,p,q);
        TreeNode right = lowestCommonAncestor(root.right,p,q);

        // result
        if(left == null)
            return right;
        else if(right == null)
            return left;
        else
            return root; //if both are not null , means root is LCA
    }
}
