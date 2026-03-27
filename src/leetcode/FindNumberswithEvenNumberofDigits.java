package leetcode;

public class FindNumberswithEvenNumberofDigits {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (countDig(nums[i]) % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    private int countDig(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }
}
