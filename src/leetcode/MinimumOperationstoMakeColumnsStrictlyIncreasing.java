package leetcode;

public class MinimumOperationstoMakeColumnsStrictlyIncreasing {
    public int minimumOperations(int[][] grid) {
        int totalOps = 0;
        int row = grid.length;
        int col = grid[0].length;

        for (int j = 0; j < col; j++) {
            for (int i = 1; i < row; i++) {
                if (grid[i][j] <= grid[i - 1][j]) {
                    int target = grid[i - 1][j] + 1;
                    totalOps += (target - grid[i][j]);
                    grid[i][j] = target;
                }
            }
        }
        return totalOps;
    }
}
