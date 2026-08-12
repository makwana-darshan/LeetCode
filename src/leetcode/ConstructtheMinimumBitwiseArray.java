package leetcode;

import java.util.List;

public class ConstructtheMinimumBitwiseArray {
    public int[] minBitwiseArray(List<Integer> nums) {
        int n = nums.size();
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            int num = nums.get(i);
            if (num == 2) {
                ans[i] = -1;
                continue;
            }
            for (int bit = 1; bit < 32; bit++) {
                if ((num & (1 << bit)) == 0) {
                    ans[i] = num ^ (1 << (bit - 1));
                    break;
                }
            }
        }
        return ans;
    }
}
