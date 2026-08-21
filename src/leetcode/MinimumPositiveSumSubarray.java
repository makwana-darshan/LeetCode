package leetcode;

import java.util.List;

public class MinimumPositiveSumSubarray {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n = nums.size();
        int minSum = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int currentSum = 0;
            for (int j = i; j < n; j++) {
                currentSum += nums.get(j);
                int length = j - i + 1;
                if (length >= l && length <= r && currentSum > 0) {
                    minSum = Math.min(minSum, currentSum);
                }
                if (length > r) {
                    break;
                }
            }
        }
        if (minSum == Integer.MAX_VALUE) {
            return -1;
        }
        return minSum;
    }
}
