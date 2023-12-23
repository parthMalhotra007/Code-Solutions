import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreOrder {
    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> preOrder = new ArrayList<>();
        if (root == null)
            return preOrder;

        preOrder.add(root.val); // visiting node and add
        preOrder.addAll(preorderTraversal(root.left));
        preOrder.addAll(preorderTraversal(root.right));

        return preOrder;

    }
}
