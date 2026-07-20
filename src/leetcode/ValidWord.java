package leetcode;

public class ValidWord {
    public boolean isValid(String word) {
        if (word.length() < 3) {
            return false;
        }
        boolean hasVowel = false;
        boolean hasConsonant = false;
        String vowels = "aeiouAEIOU";
        for (char ch : word.toCharArray()) {
            if (!Character.isLetterOrDigit(ch)) return false;

            if (Character.isLetter(ch)) {
                if (vowels.indexOf(ch) != -1) {
                    hasVowel = true;
                } else {
                    hasConsonant = true;
                }
            }
        }
        return hasVowel && hasConsonant;
    }
}
