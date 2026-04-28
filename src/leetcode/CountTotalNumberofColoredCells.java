package leetcode;

public class CountTotalNumberofColoredCells {
    public long coloredCells1(int n) {
        if (n == 1) {
            return n;
        }
        long sum = 4L * (n - 1);
        return sum + coloredCells1(n - 1);
    }

    public long coloredCells(int n) {
        return 2L * n * n - 2L * n + 1;
    }
}
