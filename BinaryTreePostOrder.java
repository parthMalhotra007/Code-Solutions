import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostOrder {
    public List<Integer> postorderTraversal(TreeNode root) {

        List<Integer> postOrder = new ArrayList<>();
        if (root == null)
            return postOrder;

        postOrder.addAll(postorderTraversal(root.left));
        postOrder.addAll(postorderTraversal(root.right));
        postOrder.add(root.val);

        return postOrder;

    }
}
