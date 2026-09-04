package leetcode;

public class FindSpecialSubstringofLengthK {
    public boolean hasSpecialSubstring(String s, int k) {
        int count = 1;
        char ch = s.charAt(0);
        int n = s.length();
        for (int i = 1; i < n; i++) {
            char ch1 = s.charAt(i);
            if (ch1 == ch) {
                count++;
            } else {
                if (count == k) {
                    return true;
                }
                ch = ch1;
                count = 1;
            }
        }
        return count == k;
    }
}
