package leetcode;

public class FindtheArrayConcatenationValue {
    public long findTheArrayConcVal(int[] nums) {
        long value = 0;
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            if (left == right) {

                value += nums[left];
            } else {
                String concatStr = Integer.toString(nums[left]) + Integer.toString(nums[right]);
                value += Long.parseLong(concatStr);
            }
            left++;
            right--;
        }
        return value;
    }
}