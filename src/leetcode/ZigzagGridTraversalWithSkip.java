package leetcode;

import java.util.ArrayList;
import java.util.List;

public class ZigzagGridTraversalWithSkip {
    public List<Integer> zigzagTraversal(int[][] grid) {
        List<Integer> list = new ArrayList<>(grid.length);
        for (int i = 0; i < grid.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < grid[0].length; j++) {
                    if ((i + j) % 2 == 0) {
                        list.add(grid[i][j]);
                    }
                }
            } else {
                for (int j = grid[0].length - 1; j >= 0; j--) {
                    if ((i + j) % 2 == 0) {
                        list.add(grid[i][j]);
                    }
                }
            }
        }
        return list;
    }
}
