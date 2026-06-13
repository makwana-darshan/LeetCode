package leetcode;

public class FindtheLongestBalancedSubstringofBinaryString {
    public int findTheLongestBalancedSubstring(String s) {
        int maxLen = 0;
        int i = 0;
        int n = s.length();

        while (i < n) {
            int zeros = 0, ones = 0;
            while (i < n && s.charAt(i) == '0') {
                zeros++;
                i++;
            }
            while (i < n && s.charAt(i) == '1') {
                ones++;
                i++;
            }
            maxLen = Math.max(maxLen, 2 * Math.min(zeros, ones));
        }
        return maxLen;
    }
}
