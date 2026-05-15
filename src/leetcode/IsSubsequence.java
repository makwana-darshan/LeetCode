package leetcode;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        if (s.length() > t.length()) {
            return false;
        }
        int i = 0;
        for (int k = 0; k < t.length() && i < s.length(); k++) {
            if (t.charAt(k) == s.charAt(i)) {
                i++;
            }
        }
        return i == s.length();
    }
}
