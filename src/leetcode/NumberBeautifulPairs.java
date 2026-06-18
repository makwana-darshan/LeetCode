package leetcode;

public class NumberBeautifulPairs {
    public int countBeautifulPairs(int[] nums) {
        int count = 0;
        int[] firstDigitFreq = new int[10];

        for (int i = 0; i < nums.length; i++) {
            int lastDigit = nums[i] % 10;

            for (int d = 1; d <= 9; d++) {
                if (firstDigitFreq[d] > 0 && gcd(d, lastDigit) == 1) {
                    count += firstDigitFreq[d];
                }
            }
            int firstDigit = nums[i];
            while (firstDigit >= 10) {
                firstDigit /= 10;
            }
            firstDigitFreq[firstDigit]++;
        }
        return count;
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}