package leetcode;

import java.util.HashSet;
//3375
public class MinimumOperationstoMakeArrayValuesEqualtoK {
    public int minOperations(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>(nums.length);
        for (int num : nums) {
            if (num < k) {
                return -1;
            }
            if (num > k) {
                set.add(num);
            }
        }
        return set.size();
    }
}
