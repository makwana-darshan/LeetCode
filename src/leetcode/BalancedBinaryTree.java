package leetcode;

public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        return height(root) != -1;
    }

    private int height(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int leftH = height(node.left);
        if (leftH == -1) {
            return -1;
        }
        int rightH = height(node.right);
        if (rightH == -1) {
            return -1;
        }
        if (Math.abs(leftH - rightH) > 1) {
            return -1;
        }
        return Math.max(leftH, rightH) + 1;
    }
}
