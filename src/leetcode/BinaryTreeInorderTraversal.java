package leetcode;


import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class BinaryTreeInorderTraversal {


    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        solve(root, list);
        return list;
    }

    private void solve(TreeNode node, List<Integer> list) {
        if (node == null) {
            return;
        }
        solve(node.left, list);
        list.add(node.val);
        solve(node.right, list);
    }
}
