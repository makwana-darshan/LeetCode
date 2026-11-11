package leetcode;

// 697. Degree of an Array
public class DegreeofanArray {
    public int findShortestSubArray(int[] nums) {
        int[] count = new int[50000];
        int[] firstSeen = new int[50000];
        int n = nums.length;
        int degree = 0;
        int minLength = 0;
        for (int i = 0; i < n; i++) {
            if (count[nums[i]] == 0) {
                firstSeen[nums[i]] = i;
            }
            count[nums[i]]++;

            if (count[nums[i]] > degree) {
                degree = count[nums[i]];
                minLength = i - firstSeen[nums[i]] + 1;
            } else if (count[nums[i]] == degree) {
                minLength = Math.min(minLength, i - firstSeen[nums[i]] + 1);
            }
        }
        return minLength;
    }
}
