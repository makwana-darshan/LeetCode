package leetcode;

public class FinalArrayStateAfterKMultiplicationOperations {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        for (int i = 0; i < k; i++) {
            int max = Integer.MAX_VALUE;
            int index = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] < max) {
                    max = nums[j];
                    index = j;
                }
            }
            nums[index] *= multiplier;
        }
        return nums;
    }
}
