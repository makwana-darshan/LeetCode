package leetcode;

public class MaximumNumberofOperationsWiththeSameScore {
    public int maxOperations(int[] nums) {
        int targetScore = nums[0] + nums[1];
        int operations = 1;
        for (int i = 2; i + 1 < nums.length; i += 2) {
            if (nums[i] + nums[i + 1] == targetScore) {
                operations++;
            } else {
                break;
            }
        }
        return operations;
    }
}
