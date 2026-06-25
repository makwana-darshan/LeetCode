package leetcode;

import java.util.List;

public class MinimumRightShiftstoSorttheArray {
    public int minimumRightShifts(List<Integer> nums) {
        int n = nums.size();
        int drops = 0;
        int dropIndex = 0;

        for (int i = 0; i < n - 1; i++) {
            if (nums.get(i) > nums.get(i + 1)) {
                drops++;
                dropIndex = i + 1;
            }
        }
        if (drops == 0) {
            return 0;
        }
        if (drops > 1) {
            return -1;
        }
        if (nums.get(n - 1) > nums.get(0)) {
            return -1;
        }
        return n - dropIndex;
    }
}
