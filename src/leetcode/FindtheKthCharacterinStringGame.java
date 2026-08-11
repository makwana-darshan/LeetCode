package leetcode;

public class FindtheKthCharacterinStringGame {
    public char kthCharacter(int k) {
        StringBuilder sb = new StringBuilder("a");
        while (sb.length() < k) {
            int n = sb.length();
            for (int i = 0; i < n; i++) {
                char nextChar = (char) (sb.charAt(i) + 1);
                sb.append(nextChar);
            }
        }
        return sb.charAt(k - 1);
    }
}
