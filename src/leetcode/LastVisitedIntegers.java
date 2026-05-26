package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LastVisitedIntegers {
    public List<Integer> lastVisitedIntegers(int[] nums) {
        List<Integer> seen = new ArrayList<>(nums.length);
        List<Integer> ans = new ArrayList<>(nums.length);
        int preCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != -1) {
                seen.add(nums[i]);
                preCount = 0;
            } else {
                preCount++;
                if (preCount <= seen.size()) {
                    ans.add(seen.get(seen.size() - preCount));
                } else {
                    ans.add(-1);
                }
            }
        }
        return ans;
    }
}
