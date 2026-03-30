package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LuckyNumbersinMatrix {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            int min = Integer.MAX_VALUE;
            int mincol = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    mincol = j;
                }
            }
            boolean isLucky = true;
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][mincol] > min) {
                    isLucky = false;
                    break;
                }
            }

            if (isLucky) {
                list.add(min);
            }
        }
        return list;
    }
}
