package leetcode;

public class ClosestPrimeNumbersInRange {
    public int[] closestPrimes(int left, int right) {
        int num1 = -1;
        int num2 = -1;
        int prev = -1;
        int minGap = Integer.MAX_VALUE;
        for (int i = left; i <= right; i++) {
            if (isprime(i)) {
                if (prev != -1) {
                    int gap = i - prev;
                    if (gap < minGap) {
                        minGap = gap;
                        num1 = prev;
                        num2 = i;
                    }
                }
                prev = i;
            }
        }
        return new int[]{num1, num2};
    }

    private boolean isprime(int i) {
        if (i < 2) {
            return false;
        }
        int n = (int) Math.sqrt(i);
        for (int j = 2; j <= n; j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }
}
