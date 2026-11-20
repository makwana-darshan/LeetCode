package leetcode;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        List<String> res=new ArrayList<>();
        int n= nums.length;
        for (int i = 0; i < n; i++) {
            int start=nums[i];
            while (i+1<nums.length && nums[i + 1] == nums[i] + 1){
                i++;
            }
            if (nums[i]!=start){
                res.add(start + "->" + nums[i]);
            }else {
                res.add(String.valueOf(start));
            }
        }
        return res;
    }
}
