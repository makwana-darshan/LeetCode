package leetcode;

public class SmallestIndexWithDigitSumEqualtoIndex {
    public int smallestIndex(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (i == sumOfDigi(nums[i])) {
                return i;
            }
        }
        return -1;
    }

    private int sumOfDigi(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
