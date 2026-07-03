package leetcode;

public class FindMissingandRepeatedValues {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int element = n * n;
        int[] count = new int[element + 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                count[grid[i][j]]++;
            }
        }
        int rep = 0;
        int miss = 0;
        for (int i = 1; i <= element; i++) {
            if (count[i] == 2) {
                rep = i;
            } else if (count[i] == 0) {
                miss = i;
            }
        }
        return new int[]{rep, miss};
    }
}
