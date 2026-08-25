package leetcode;

import java.util.HashSet;

public class MinimumNumberofOperationstoMakeElementsinArrayDistinct {
    public int minimumOperations(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (!set.add(num)) {
                return (i / 3) + 1;
            }
        }
        return 0;
    }
}
