package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagramsInString {
    public List<Integer> findAnagrams(String s, String p) {
        int[] pFreq = new int[26];
        int[] sFreq = new int[26];
        for (char ch : p.toCharArray()) {
            pFreq[ch - 'a']++;
        }
        List<Integer> ans = new ArrayList<>(s.length());
        for (int i = 0; i < s.length(); i++) {
            sFreq[s.charAt(i) - 'a']++;
            if (i >= p.length()) {
                sFreq[s.charAt(i - p.length()) - 'a']--;
            }
            if (Arrays.equals(pFreq, sFreq)) {
                ans.add(i - p.length() + 1);
            }
        }
        return ans;
    }
}
