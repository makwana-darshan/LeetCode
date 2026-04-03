package leetcode;

import java.util.Arrays;
import java.util.HashSet;

public class LongestConsecutiveSequence {
    public int longestConsecutive1(int[] nums) {
        Arrays.sort(nums);
        int longest = 1;
        int current = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                continue;
            }
            if (nums[i + 1] - nums[i] == 1) {
                current++;
                longest = Math.max(longest, current);
            } else {
                current = 1;
            }
        }
        return longest;
    }

    public int longestConsecutive(int[] nums) {
        if (nums.length < 2) {
            return nums.length;
        }
        HashSet<Integer> set = new HashSet<>(nums.length);
        for (int num : nums) {
            set.add(num);
        }
        int longest = 1;
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int current = 1;
                while (set.contains(num + current)) {
                    current++;
                }
                longest = Math.max(longest, current);
            }
        }
        return longest;
    }
}
