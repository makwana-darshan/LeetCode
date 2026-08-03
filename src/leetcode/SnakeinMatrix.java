package leetcode;

import java.util.List;

public class SnakeinMatrix {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int row = 0;
        int col = 0;
        for (String cmd : commands) {
            char ch = cmd.charAt(0);
            if (ch == 'U') {
                row--;
            } else if (ch == 'D') {
                row++;
            } else if (ch == 'L') {
                col--;
            } else {
                col++;
            }
        }
        return row * n + col;
    }
}
