package leetcode;

public class MirrorDistanceofanInteger {
    public int mirrorDistance(int n) {
        return Math.abs(n - reverse(n));
    }

    private int reverse(int num) {
        int ans = 0;
        while (num > 0) {
            int rem = num % 10;
            ans = ans * 10 + rem;
            num /= 10;
        }
        return ans;
    }
}
