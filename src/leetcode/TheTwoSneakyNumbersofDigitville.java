package leetcode;

public class TheTwoSneakyNumbersofDigitville {
    public int[] getSneakyNumbers(int[] nums) {
        int n = nums.length;
        boolean[] seen = new boolean[n + 1];
        int[] res = new int[2];
        int index = 0;
        for (int i = 0; i < n; i++) {
            int num = nums[i];
            if (seen[num]) {
                res[index++] = num;
                if (index == 2) {
                    break;
                }
            }
            seen[nums[i]] = true;
        }
        return res;
    }
}
