package leetcode;

public class FirstLetterAppearTwice {
    public char repeatedCharacter(String s) {
        boolean[] freq = new boolean[26];
        for (char ch : s.toCharArray()) {
            if (freq[ch - 'a']) {
                return ch;
            }
            freq[ch - 'a'] = true;
        }
        return ' ';
    }
}
