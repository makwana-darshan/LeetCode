package leetcode;

public class SortArrayByParity {
    public int[] sortArrayByParity(int[] nums) {
        if (nums.length <= 1) {
            return nums;
        }
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            int num1 = nums[i] % 2;
            int num2 = nums[j] % 2;
            if (num2 < num1) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                i++;
                j--;
            } else if (num1 == 0 && num2 == 0) {
                i++;
            } else if (num2 == 1 && num1 == 1) {
                j--;
            } else {
                i++;
                j--;
            }
        }
        return nums;
    }
}
