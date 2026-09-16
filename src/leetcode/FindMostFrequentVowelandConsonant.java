package leetcode;

public class FindMostFrequentVowelandConsonant {
    public int maxFreqSum(String s) {
        int[] freq = new int[26];
        int maxVowel = 0;
        int maxCons = 0;
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        String vowels = "aeiou";
        for (int i = 0; i < 26; i++) {
            if (vowels.indexOf((char) ('a' + i)) != -1) {
                maxVowel = Math.max(maxVowel, freq[i]);
            } else {
                maxCons = Math.max(maxCons, freq[i]);
            }
        }
        return maxVowel + maxCons;
    }
}
