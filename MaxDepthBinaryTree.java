public class MaxDepthBinaryTree {
    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;

        int leftSubTree = maxDepth(root.left);  //DFS recursive approach
        int rightSubTree = maxDepth(root.right);


        return Math.max(leftSubTree,rightSubTree)+1; // +1 for current node
    }
}
