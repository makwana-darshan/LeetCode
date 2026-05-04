package leetcode;

import java.util.Arrays;

public class KRadiusSubarrayAverages {
    public int[] getAverages(int[] nums, int k) {
        int n = nums.length;
        int[] avg = new int[n];

        Arrays.fill(avg, -1);


        if (2 * k + 1 > n) {
            return avg;
        }

        long sum = 0;
        for (int i = 0; i <= 2 * k; i++) {
            sum += nums[i];
        }

        avg[k] = (int) (sum / (2 * k + 1));
        for (int i = k + 1; i < n - k; i++) {
            sum += nums[i + k];
            sum -= nums[i - k - 1];
            avg[i] = (int) (sum / (2 * k + 1));
        }

        return avg;
    }
}
