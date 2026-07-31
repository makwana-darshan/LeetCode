package leetcode;

public class FindifDigitGameCanBeWon {
    public boolean canAliceWin(int[] nums) {
        int aliceSum = 0;
        int bobSum = 0;
        for (int num : nums) {
            if (num >= 1 && num <= 9) {
                aliceSum += num;
            } else {
                bobSum += num;
            }
        }
        return aliceSum > bobSum;
    }
}
