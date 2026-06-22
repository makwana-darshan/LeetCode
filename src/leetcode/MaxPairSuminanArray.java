package leetcode;

public class MaxPairSuminanArray {
    public int maxSum(int[] nums) {
        int[] best = new int[10];
        int ans = -1;
        for (int num : nums) {
            int md = maxDigi(num);
            if (best[md] != 0) {
                ans = Math.max(ans, best[md] + num);
            }
            best[md] = Math.max(best[md], num);
        }
        return ans;
    }

    private int maxDigi(int num) {
        int max = 0;
        while (num > 0) {
            max = Math.max(max, num % 10);
            num /= 10;
        }
        return max;
    }
}
