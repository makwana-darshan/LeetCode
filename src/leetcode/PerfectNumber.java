package leetcode;

public class PerfectNumber {
    public boolean checkPerfectNumber(int num) {
        if (num <= 1) {
            return false;
        }
        int facSum = 1;
        int n = num / 2;
        for (int i = 2; i <= n; i++) {
            if (num % i == 0) {
                facSum += i;
            }
        }
        return facSum == num;
    }
}
