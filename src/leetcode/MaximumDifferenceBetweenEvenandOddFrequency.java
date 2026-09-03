package leetcode;

public class MaximumDifferenceBetweenEvenandOddFrequency {
    public int maxDifference(String s) {
        int count[] = new int[26];
        int n=s.length();
        for (int i = 0; i < n; i++) {
            count[s.charAt(i) - 'a']++;
        }
        int maxOdd = 0;
        int minEven = Integer.MAX_VALUE;
        for (int num : count) {
            if (num == 0) {
                continue;
            }
            if (num % 2 != 0) {
                maxOdd = Math.max(maxOdd, num);
            }
            if (num % 2 == 0) {
                minEven = Math.min(minEven, num);
            }
        }
        return maxOdd - minEven;
    }
}
