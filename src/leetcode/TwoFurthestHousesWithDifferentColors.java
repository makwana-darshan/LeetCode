package leetcode;

public class TwoFurthestHousesWithDifferentColors {
    public int maxDistance(int[] colors) {
        int n = colors.length;
        int maxDis = 0;

        for (int i = 0; i < n - 1; i++) {
            if (colors[i] != colors[n - 1]) {
                maxDis = Math.max(maxDis, n - 1 - i);
            }
        }

        for (int i = n - 1; i > 0; i--) {
            if (colors[i] != colors[0]) {
                maxDis = Math.max(maxDis, i);
            }
        }

        return maxDis;
    }
}
