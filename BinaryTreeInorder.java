import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorder {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> inorder = new ArrayList<>();

        if(root == null)
            return inorder;

        inorder.addAll(inorderTraversal(root.left));
        inorder.add(root.val); //visit current node and add its value
        inorder.addAll(inorderTraversal(root.right));

        return inorder;
    }
}
