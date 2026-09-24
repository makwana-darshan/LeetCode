package leetcode;

import java.util.Arrays;

public class FindtheLongestSubstringContainingVowelsinEvenCounts {
    public int findTheLongestSubstring(String s) {
        int[] seen = new int[32];
        Arrays.fill(seen, -2);
        seen[0] = -1;
        int state = 0;
        int maxLen = 0;
        int n = s.length();
        String vowels = "aeiou";
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            int idx = vowels.indexOf(ch);
            if (idx != -1) {
                state ^= (1 << idx);
            }
            if (seen[state] != -2) {
                maxLen = Math.max(maxLen, i - seen[state]);
            } else {
                seen[state] = i;
            }
        }
        return maxLen;
    }
}
