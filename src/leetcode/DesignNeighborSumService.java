package leetcode;

public class DesignNeighborSumService {
    private int[][] grid;
    private int n;
    private int[][] pos;

    public DesignNeighborSumService(int[][] grid) {
        this.grid = grid;
        this.n = grid.length;
        this.pos = new int[n * n][2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int value = grid[i][j];
                pos[value][0] = i;
                pos[value][1] = j;
            }
        }
    }

    public int adjacentSum(int value) {
        int row = pos[value][0];
        int col = pos[value][1];
        int sum = 0;
        int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        for (int[] d : dirs) {
            int r = row + d[0], c = col + d[1];
            if (r >= 0 && r < n && c >= 0 && c < n) {
                sum += grid[r][c];
            }
        }
        return sum;
    }

    public int diagonalSum(int value) {
        int row = pos[value][0];
        int col = pos[value][1];
        int sum = 0;
        int[][] dirs = {{-1, -1}, {-1, 1}, {1, -1}, {1, 1}};

        for (int[] d : dirs) {
            int r = row + d[0], c = col + d[1];
            if (r >= 0 && r < n && c >= 0 && c < n) {
                sum += grid[r][c];
            }
        }
        return sum;
    }
}
