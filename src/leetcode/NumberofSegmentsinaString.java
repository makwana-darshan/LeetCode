package leetcode;

public class NumberofSegmentsinaString {
    public int countSegments(String s) {
        int segments = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != ' ') {
                if (i == 0 || s.charAt(i - 1) == ' ') {
                    segments++;
                }
            }
        }
        return segments;
    }
}
