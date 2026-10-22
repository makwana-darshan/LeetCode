package leetcode;

import java.util.Arrays;

// 506. Relative Ranks
public class RelativeRanks {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        Integer[] indices = new Integer[n];

        Arrays.setAll(indices, i -> i);`

        Arrays.sort(indices, (i1, i2) -> score[i2] - score[i1]);
        String[] result = new String[n];
        String[] medals = new String[]{"Gold Medal", "Silver Medal", "Bronze Medal"};
        for (int i = 0; i < n; i++) {
            int originalIndex = indices[i];
            if (i < 3) {
                result[originalIndex] = medals[i];
            } else {
                result[originalIndex] = String.valueOf(i + 1);
            }
        }
        return result;
    }
}
