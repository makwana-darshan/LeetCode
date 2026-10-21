package leetcode;

import java.util.ArrayList;
import java.util.List;

// 501. Find Mode in Binary Search Tree
public class FindModeinBinarySearchTree {
    int maxFrequency;
    int currentCount;
    TreeNode previousNode;
    List<Integer> modeList;

    public int[] findMode(TreeNode root) {
        modeList = new ArrayList<>();
        inOrderTraversal(root);
        int n = modeList.size();
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = modeList.get(i);
        }
        return result;
    }

    private void inOrderTraversal(TreeNode node) {
        if (node == null) {
            return;
        }
        inOrderTraversal(node.left);

        currentCount = (previousNode != null && previousNode.val == node.val) ? currentCount + 1 : 1;

        if (currentCount > maxFrequency) {
            modeList = new ArrayList<>(List.of(node.val));
            maxFrequency = currentCount;
        } else if (currentCount == maxFrequency) {
            modeList.add(node.val);
        }
        previousNode = node;
        inOrderTraversal(node.right);
    }
}
