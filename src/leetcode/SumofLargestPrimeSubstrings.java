package leetcode;

import java.util.Comparator;
import java.util.TreeSet;

public class SumofLargestPrimeSubstrings {
    public long sumOfLargestPrimes(String s) {
        TreeSet<Long> set = new TreeSet<>(Comparator.reverseOrder());
        int n = s.length();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                long num = Long.parseLong(s.substring(i, j));
                if (isPrime(num)) {
                    set.add(num);
                }
            }
        }
        long sum = 0;
        int count = 0;
        for (long num : set) {
            if (count++ == 3) {
                break;
            }
            sum += num;
        }
        return sum;
    }

    private boolean isPrime(long num) {
        if (num <= 1) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        if (num % 2 == 0) {
            return false;
        }
        long limit = (long) Math.sqrt(num);
        for (int i = 2; i <= limit; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
