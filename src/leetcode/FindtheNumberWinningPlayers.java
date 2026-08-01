package leetcode;

public class FindtheNumberWinningPlayers {
    public int winningPlayerCount(int n, int[][] pick) {
        int[][] count = new int[n][11];
        for (int[] p : pick) {
            count[p[0]][p[1]]++;
        }
        int winners = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= 10; j++)
                if (count[i][j] > i) {
                    winners++;
                    break;
                }
        }
        return winners;
    }
}
