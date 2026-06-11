package leetcode;

public class DifferenceBetweenElementSumandDigitSumofanArray {
    public int differenceOfSum(int[] nums) {
        int number = 0;
        int digit = 0;
        for (int num : nums) {
            number += num;
            digit += digSum(num);
        }
        return Math.abs(number - digit);
    }

    private int digSum(int num) {
        int res = 0;
        while (num > 0) {
            res += num % 10;
            num /= 10;
        }
        return res;
    }
}
