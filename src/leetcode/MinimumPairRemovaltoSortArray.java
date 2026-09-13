package leetcode;

public class MinimumPairRemovaltoSortArray {
    public int minimumPairRemoval(int[] nums) {
        int n = nums.length;
        int ans = 0;

        while (true) {
            boolean sorted = true;
            for (int i = 0; i < n - 1; i++) {
                if (nums[i] > nums[i + 1]) {
                    sorted = false;
                    break;
                }
            }
            if (sorted) {
                break;
            }
            int minSum = Integer.MAX_VALUE;
            int minIndex = -1;

            for (int i = 0; i < n - 1; i++) {
                int currentSum = nums[i] + nums[i + 1];
                if (currentSum < minSum) {
                    minSum = currentSum;
                    minIndex = i;
                }
            }
            nums[minIndex] = minSum;

            for (int i = minIndex + 1; i < n - 1; i++) {
                nums[i] = nums[i + 1];
            }
            n--;
            ans++;
        }
        return ans;
    }
}
