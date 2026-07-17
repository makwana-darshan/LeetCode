package leetcode;

public class CounttheNumberofSpecialCharacters {
    public int numberOfSpecialChars(String word) {
        boolean[] lower = new boolean[26];
        boolean[] uper = new boolean[26];

        for (char ch : word.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                lower[ch - 'a'] = true;
            }
            if (ch >= 'A' && ch <= 'Z') {
                uper[ch - 'A'] = true;
            }
        }
        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (lower[i] && uper[i]) {
                count++;
            }
        }
        return count;
    }
}
