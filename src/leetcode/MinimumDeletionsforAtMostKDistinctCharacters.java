package leetcode;

import java.util.Arrays;

public class MinimumDeletionsforAtMostKDistinctCharacters {
    public int minDeletion(String s, int k) {
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        Arrays.sort(freq);
        int count = 0;
        int distinct = 0;
        for (int f : freq) {
            if (f > 0) {
                distinct++;
            }
        }
        int i = 0;
        while (distinct > k) {
            if (freq[i] > 0) {
                count += freq[i];
                distinct--;
            }
            i++;
        }
        return count;
    }
}
