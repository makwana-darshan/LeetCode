package leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class EqualRowandColumnPairs {
    public int equalPairs(int[][] grid) {
        HashMap<String, Integer> map = new HashMap<>();
        int n = grid.length;
        for (int i = 0; i < n; i++) {
            String row = Arrays.toString(grid[i]);
            map.put(row, map.getOrDefault(row, 0) + 1);
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            int[] col = new int[n];
            for (int j = 0; j < n; j++) {
                col[j] = grid[j][i];
            }
            String colStr = Arrays.toString(col);
            count += map.getOrDefault(colStr, 0);
        }
        return count;
    }
}
