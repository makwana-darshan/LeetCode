package leetcode;

import java.util.Arrays;

public class MaximumProductofThreeNumbers {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int length = nums.length - 1;
        int sum1 = nums[length] * nums[length - 1] * nums[length - 2];
        int sum2 = nums[0] * nums[1] * nums[length];
        return Math.max(sum1, sum2);
    }
}
