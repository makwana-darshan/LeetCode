package leetcode;

import java.util.ArrayList;
import java.util.List;

public class NaryTreePostorderTraversal {
    public List<Integer> postorder(Node root) {
        List<Integer> res = new ArrayList<>();
        traverse(root, res);
        return res;
    }

    private void traverse(Node node, List<Integer> res) {
        if (node == null) {
            return;
        }
        for (Node child : node.children) {
            traverse(child, res);
        }
        res.add(node.val);
    }
}
