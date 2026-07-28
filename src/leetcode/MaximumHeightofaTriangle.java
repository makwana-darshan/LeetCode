package leetcode;

public class MaximumHeightofaTriangle {
    public int maxHeightOfTriangle(int red, int blue) {
        return Math.max(helper(red, blue), helper(blue, red));
    }

    private int helper(int c1, int c2) {
        int height = 0;
        int row = 1;
        while (true) {
            if (row % 2 == 1) {
                if (c1 < row) {
                    break;
                }
                c1 -= row;
            } else {
                if (c2 < row) {
                    break;
                }
                c2 -= row;
            }
            height++;
            row++;
        }
        return height;
    }
}
