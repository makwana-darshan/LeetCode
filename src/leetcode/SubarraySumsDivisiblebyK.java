package leetcode;

public class SubarraySumsDivisiblebyK {
    public int subarraysDivByK(int[] nums, int k) {
        int[] remainderCount = new int[k];
        remainderCount[0] = 1;
        int sum = 0, count = 0;
        for (int num : nums) {
            sum += num;
            int rem = ((sum % k) + k) % k;
            count += remainderCount[rem];
            remainderCount[rem]++;
        }
        return count;
    }
}
