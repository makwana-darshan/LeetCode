package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ThirdMaximumNumber {
    public int thirdMax(int[] nums) {
        int len = nums.length;
        Set<Integer> set = new TreeSet<>();
        for (int num : nums) {
            set.add(num);
        }
        List<Integer> ss = new ArrayList<>(set);
        len = ss.size();
        if (len >= 3) {
            return ss.get(len - 3);
        }
        return ss.get(len - 1);
    }
}
