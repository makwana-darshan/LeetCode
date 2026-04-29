package leetcode;

public class AlternatingDigitSum {
    public int alternateDigitSum(int n) {
        int sum = 0;
        int sum1 = 0;
        String num = "" + n;
        for (int i = 0; i < num.length(); i++) {
            if (i % 2 == 0) {
                sum += num.charAt(i) - '0';
            } else {
                sum1 += num.charAt(i) - '0';
            }
        }
        return sum - sum1;
    }
}
