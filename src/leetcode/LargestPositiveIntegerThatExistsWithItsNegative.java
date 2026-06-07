package leetcode;

import java.util.HashSet;

public class LargestPositiveIntegerThatExistsWithItsNegative {
    public int findMaxK(int[] nums) {
        int max = -1;
        HashSet<Integer> set = new HashSet<>(nums.length);
        for (int num : nums) {
            set.add(num);
        }
        for (int num : nums) {
            if (num > 0 && set.contains(-num)) {
                max = Math.max(max, num);
            }
        }
        return max;
    }
}
