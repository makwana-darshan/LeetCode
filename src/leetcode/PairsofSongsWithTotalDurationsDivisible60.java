package leetcode;

public class PairsofSongsWithTotalDurationsDivisible60 {
    public int numPairsDivisibleBy60(int[] time) {
        int[] count = new int[60];
        int pairs = 0;

        for (int t : time) {
            int r = t % 60;
            int complement = (60 - r) % 60;
            pairs += count[complement];
            count[r]++;
        }
        return pairs;
    }
}
