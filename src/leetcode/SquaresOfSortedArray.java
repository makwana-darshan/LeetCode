package leetcode;

public class SquaresOfSortedArray {

    public int[] sortedSquares(int[] nums) {
        if (nums.length == 1) {
            nums[0] = nums[0] * nums[0];
            return nums;
        }
        int[] res = new int[nums.length];
        int k = nums.length - 1;
        int i = 0;
        int j = nums.length - 1;
        while (i <= j) {
            if (Math.abs(nums[i]) <= Math.abs(nums[j])) {
                res[k--] = nums[j] * nums[j];
                j--;
            } else {
                res[k--] = nums[i] * nums[i];
                i++;
            }
        }
        return res;
    }
}
