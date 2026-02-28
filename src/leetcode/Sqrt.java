package leetcode;

public class Sqrt {
    public int mySqrt1(int x) {
        if (x < 2) {
            return x;
        }
        for (int i = 1; i < x; i++) {
            if (i > x / 2) {
                return x - 1;
            }
        }
        return x / 2;
    }

    public int mySqrt(int x) {
        if (x < 2) {
            return x;
        }
        int left = 1;
        int right = x / 2;
        int ans = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid <= x / mid) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }
}
