package leetcode;

public class CountNegativeNumbersinaSortedMatrix {
    public int countNegatives1(int[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] < 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public int countNegatives(int[][] grid) {
        int count = 0;
        for (int[] row : grid) {
            int lo = 0, hi = row.length;
            while (lo < hi) {
                int mid = (lo + hi) / 2;
                if (row[mid] < 0) {
                    hi = mid;
                } else {
                    lo = mid + 1;
                }
            }
            count += row.length - lo;
        }
        return count;
    }
}
