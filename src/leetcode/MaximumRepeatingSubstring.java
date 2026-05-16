package leetcode;

public class MaximumRepeatingSubstring {
    public int maxRepeating(String sequence, String word) {
        int n = sequence.length();
        int m = word.length();
        int[] dp = new int[n + 1];
        int maxK = 0;

        for (int i = m; i <= n; i++) {
            if (sequence.substring(i - m, i).equals(word)) {
                dp[i] = dp[i - m] + 1;
                maxK = Math.max(maxK, dp[i]);
            }
        }
        return maxK;
    }

    public int maxRepeating1(String sequence, String word) {
        int count = 0;
        while (sequence.contains(word.repeat(count + 1))) {
            count++;
        }
        return count;
    }
}
