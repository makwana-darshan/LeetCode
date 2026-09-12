package leetcode;

public class MinimumCosttoReachEveryPosition {
    public int[] minCosts(int[] cost) {
        int n = cost.length;
        int[] result = new int[n];
        result[0] = cost[0];
        for (int i = 1; i < n; i++) {
            result[i] = Math.min(result[i - 1], cost[i]);
        }
        return result;
    }
}
