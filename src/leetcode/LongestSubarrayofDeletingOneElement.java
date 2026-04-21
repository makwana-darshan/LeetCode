package leetcode;

public class LongestSubarrayofDeletingOneElement {
    public int longestSubarray(int[] nums) {
        int left = 0;
        int right = 0;
        int maxLen = 0;
        int zeros = 0;
        while (right < nums.length) {

            if (nums[right] == 0) {
                zeros++;
            }
            while (zeros > 1) {
                if (nums[left] == 0) zeros--;
                left++;
            }
            maxLen = Math.max(maxLen, right - left);
            right++;
        }
        return maxLen;
    }
}
