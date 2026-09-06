package leetcode;

public class TransformArraybyParity {
    public int[] transformArray(int[] nums) {
        int n = nums.length;
        int count = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                count++;
            }
        }
        int[] ans = new int[n];
        for (int i = count; i < n; i++) {
            ans[i] = 1;
        }
        return ans;
    }
}
