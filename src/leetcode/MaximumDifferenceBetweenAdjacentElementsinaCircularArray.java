package leetcode;

public class MaximumDifferenceBetweenAdjacentElementsinaCircularArray {
    // 3423
    public int maxAdjacentDistance(int[] nums) {
        int max = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, Math.abs(nums[i] - nums[(i + 1) % n]));
        }
        return max;
    }
}
