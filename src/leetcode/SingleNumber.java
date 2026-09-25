package leetcode;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += (nums[j] >> i) & 1;
            }
            if (sum % 3 != 0) {
                ans |= (1 << i);
            }
        }
        return ans;
    }
}
