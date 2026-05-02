package leetcode;

import java.util.HashSet;

public class MaximumNumberofVowelsinSubstringGivenLength {
    public int maxVowels(String s, int k) {
        HashSet<Character> vowels = new HashSet<>(5);
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        int count = 0;
        for (int i = 0; i < k; i++) {
            if (vowels.contains(s.charAt(i))) count++;
        }
        int maxCount = count;

        for (int i = k; i < s.length(); i++) {
            if (vowels.contains(s.charAt(i))) count++;       // add right
            if (vowels.contains(s.charAt(i - k))) count--;   // remove left
            maxCount = Math.max(maxCount, count);
        }
        return maxCount;
    }
}
