package leetcode;

public class MinimumTimeTypeWordUsingSpecialTypewriter {
    public int minTimeToType(String word) {
        char prev = 'a';
        int sum = 0;
        for (char ch : word.toCharArray()) {
            int diff = Math.abs(ch - prev);
            int minDist = Math.min(diff, 26 - diff);
            sum += minDist + 1;
            prev = ch;
        }
        return sum;
    }
}
