package leetcode;

import java.util.Arrays;

public class MinimumAverageofSmallestandLargestElements {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int left=0;
        int right= nums.length-1;
        double minAvg=Integer.MAX_VALUE;
        while (left<right){
            minAvg=Math.min(minAvg,(nums[left]+nums[right])/2.0);
            left++;
            right--;
        }
        return minAvg;
    }
}
