package leetcode;

public class MaximumSubarrayWithEqualProducts {
    public int maxLength(int[] nums) {
        int n = nums.length;
        int maxLength = 0;
        for (int i = 0; i < n; i++) {
            int prod = 1;
            int l = 1;
            int g = 0;
            for (int j = i; j < n; j++) {
                prod *= nums[j];
                if (prod > 25200) {
                    break;
                }
                l = lcm(l, nums[j]);
                g = gcd(g, nums[j]);

                if (prod == g * l) {
                    maxLength = Math.max(maxLength, j - i + 1);
                }
            }
        }
        return maxLength;
    }

    private int gcd(int a, int b) {
        return (b == 0) ? a : gcd(b, a % b);
    }

    private int lcm(int a, int b) {
        return a * (b / gcd(a, b));
    }
}
