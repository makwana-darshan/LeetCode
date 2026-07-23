package leetcode;

public class FindtheXORofNumbersWhichAppearTwice {
    public int duplicateNumbersXOR(int[] nums) {
        boolean[] seen = new boolean[51];
        int result = 0;
        for (int num : nums) {
            if (seen[num]) {
                result ^= num;
            } else {
                seen[num] = true;
            }
        }
        return result;
    }
}
