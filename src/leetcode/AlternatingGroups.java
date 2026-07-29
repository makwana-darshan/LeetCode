package leetcode;

public class AlternatingGroups {
    public int numberOfAlternatingGroups(int[] colors) {
        int count = 0;
        int n = colors.length;
        for (int i = 0; i < n; i++) {
            int prev = colors[(i - 1 + n) % n];
            int next = colors[(i + 1) % n];
            if (prev != colors[i] && next != colors[i]) {
                count++;
            }
        }
        return count;
    }
}
