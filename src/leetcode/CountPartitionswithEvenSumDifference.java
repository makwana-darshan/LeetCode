package leetcode;

public class CountPartitionswithEvenSumDifference {
    public int countPartitions(int[] nums) {
        int totalSum = 0;
        int n = nums.length;
        for (int num : nums) {
            totalSum += num;
        }
        int leftSum = 0;
        int count = 0;
        for (int i = 0; i < n-1; i++) {
            leftSum += nums[i];
            int rightSum = totalSum - leftSum;
            if ((leftSum - rightSum) % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
