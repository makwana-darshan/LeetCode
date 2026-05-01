package leetcode;

public class FindTheHighestAltitude {
    public int largestAltitude(int[] gain) {
        int altitude = 0;
        int maxAlt = 0;
        for (int num : gain) {
            altitude += num;
            maxAlt = Math.max(maxAlt, altitude);
        }
        return maxAlt;
    }
}
