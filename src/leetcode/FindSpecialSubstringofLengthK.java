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
                ch = ch1;
                count = 1;
            }
            if (count >= k){
                return true;
            }
        }
        return false;
    }
}
