package leetcode;

public class ReverseDegreeofaString {
    public int reverseDegree(String s) {
        int n = s.length();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int revPos = 26 - (s.charAt(i) - 'a');
            sum += revPos * (i + 1);
        }
        return sum;
    }
}
