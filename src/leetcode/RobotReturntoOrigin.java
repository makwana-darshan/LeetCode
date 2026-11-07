package leetcode;

public class RobotReturntoOrigin {
    public boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;
        int n = moves.length();
        for (int i = 0; i < n; i++) {
            char ch = moves.charAt(i);
            if (ch == 'U') {
                y++;
            } else if (ch == 'D') {
                y--;
            } else if (ch == 'R') {
                x++;
            } else if (ch == 'L') {
                x--;
            }
        }
        return x == 0 && y == 0;
    }
}
